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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
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

public class ProjectTaskAssignmentSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField actualWork;
    private SearchDoubleField cost;
    private SearchDoubleField costBase;
    private SearchDateField endDate;
    private SearchDoubleField estimatedWork;
    private SearchDoubleField estimatedWorkBaseline;
    private SearchDoubleField grossProfit;
    private SearchDoubleField grossProfitBase;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchDoubleField plannedWork;
    private SearchDoubleField plannedWorkBaseline;
    private SearchDoubleField price;
    private SearchDoubleField priceBase;
    private SearchMultiSelectField resource;
    private SearchStringField resourceName;
    private SearchStringField serviceItem;
    private SearchStringField serviceItemDesc;
    private SearchDateField startDate;
    private SearchDoubleField unitCost;
    private SearchDoubleField unitCostBase;
    private SearchDoubleField unitPrice;
    private SearchDoubleField unitPriceBase;
    private SearchDoubleField units;
    private SearchMultiSelectField workCalendar;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskAssignmentSearchBasic.class, true);

    public ProjectTaskAssignmentSearchBasic() {
    }

    public ProjectTaskAssignmentSearchBasic(SearchDoubleField actualWork, SearchDoubleField cost, SearchDoubleField costBase, SearchDateField endDate, SearchDoubleField estimatedWork, SearchDoubleField estimatedWorkBaseline, SearchDoubleField grossProfit, SearchDoubleField grossProfitBase, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchDoubleField plannedWork, SearchDoubleField plannedWorkBaseline, SearchDoubleField price, SearchDoubleField priceBase, SearchMultiSelectField resource, SearchStringField resourceName, SearchStringField serviceItem, SearchStringField serviceItemDesc, SearchDateField startDate, SearchDoubleField unitCost, SearchDoubleField unitCostBase, SearchDoubleField unitPrice, SearchDoubleField unitPriceBase, SearchDoubleField units, SearchMultiSelectField workCalendar) {
        this.actualWork = actualWork;
        this.cost = cost;
        this.costBase = costBase;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.grossProfit = grossProfit;
        this.grossProfitBase = grossProfitBase;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.price = price;
        this.priceBase = priceBase;
        this.resource = resource;
        this.resourceName = resourceName;
        this.serviceItem = serviceItem;
        this.serviceItemDesc = serviceItemDesc;
        this.startDate = startDate;
        this.unitCost = unitCost;
        this.unitCostBase = unitCostBase;
        this.unitPrice = unitPrice;
        this.unitPriceBase = unitPriceBase;
        this.units = units;
        this.workCalendar = workCalendar;
    }

    public SearchDoubleField getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(SearchDoubleField actualWork) {
        this.actualWork = actualWork;
    }

    public SearchDoubleField getCost() {
        return this.cost;
    }

    public void setCost(SearchDoubleField cost) {
        this.cost = cost;
    }

    public SearchDoubleField getCostBase() {
        return this.costBase;
    }

    public void setCostBase(SearchDoubleField costBase) {
        this.costBase = costBase;
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

    public SearchDoubleField getEstimatedWorkBaseline() {
        return this.estimatedWorkBaseline;
    }

    public void setEstimatedWorkBaseline(SearchDoubleField estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public SearchDoubleField getGrossProfit() {
        return this.grossProfit;
    }

    public void setGrossProfit(SearchDoubleField grossProfit) {
        this.grossProfit = grossProfit;
    }

    public SearchDoubleField getGrossProfitBase() {
        return this.grossProfitBase;
    }

    public void setGrossProfitBase(SearchDoubleField grossProfitBase) {
        this.grossProfitBase = grossProfitBase;
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

    public SearchDoubleField getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchDoubleField plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchDoubleField getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchDoubleField plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchDoubleField getPrice() {
        return this.price;
    }

    public void setPrice(SearchDoubleField price) {
        this.price = price;
    }

    public SearchDoubleField getPriceBase() {
        return this.priceBase;
    }

    public void setPriceBase(SearchDoubleField priceBase) {
        this.priceBase = priceBase;
    }

    public SearchMultiSelectField getResource() {
        return this.resource;
    }

    public void setResource(SearchMultiSelectField resource) {
        this.resource = resource;
    }

    public SearchStringField getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(SearchStringField resourceName) {
        this.resourceName = resourceName;
    }

    public SearchStringField getServiceItem() {
        return this.serviceItem;
    }

    public void setServiceItem(SearchStringField serviceItem) {
        this.serviceItem = serviceItem;
    }

    public SearchStringField getServiceItemDesc() {
        return this.serviceItemDesc;
    }

    public void setServiceItemDesc(SearchStringField serviceItemDesc) {
        this.serviceItemDesc = serviceItemDesc;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchDoubleField getUnitCost() {
        return this.unitCost;
    }

    public void setUnitCost(SearchDoubleField unitCost) {
        this.unitCost = unitCost;
    }

    public SearchDoubleField getUnitCostBase() {
        return this.unitCostBase;
    }

    public void setUnitCostBase(SearchDoubleField unitCostBase) {
        this.unitCostBase = unitCostBase;
    }

    public SearchDoubleField getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(SearchDoubleField unitPrice) {
        this.unitPrice = unitPrice;
    }

    public SearchDoubleField getUnitPriceBase() {
        return this.unitPriceBase;
    }

    public void setUnitPriceBase(SearchDoubleField unitPriceBase) {
        this.unitPriceBase = unitPriceBase;
    }

    public SearchDoubleField getUnits() {
        return this.units;
    }

    public void setUnits(SearchDoubleField units) {
        this.units = units;
    }

    public SearchMultiSelectField getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskAssignmentSearchBasic)) {
            return false;
        }
        ProjectTaskAssignmentSearchBasic other = (ProjectTaskAssignmentSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && this.actualWork.equals(other.getActualWork())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costBase == null && other.getCostBase() == null || this.costBase != null && this.costBase.equals(other.getCostBase())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.estimatedWorkBaseline == null && other.getEstimatedWorkBaseline() == null || this.estimatedWorkBaseline != null && this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline())) && (this.grossProfit == null && other.getGrossProfit() == null || this.grossProfit != null && this.grossProfit.equals(other.getGrossProfit())) && (this.grossProfitBase == null && other.getGrossProfitBase() == null || this.grossProfitBase != null && this.grossProfitBase.equals(other.getGrossProfitBase())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && this.plannedWorkBaseline.equals(other.getPlannedWorkBaseline())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.priceBase == null && other.getPriceBase() == null || this.priceBase != null && this.priceBase.equals(other.getPriceBase())) && (this.resource == null && other.getResource() == null || this.resource != null && this.resource.equals(other.getResource())) && (this.resourceName == null && other.getResourceName() == null || this.resourceName != null && this.resourceName.equals(other.getResourceName())) && (this.serviceItem == null && other.getServiceItem() == null || this.serviceItem != null && this.serviceItem.equals(other.getServiceItem())) && (this.serviceItemDesc == null && other.getServiceItemDesc() == null || this.serviceItemDesc != null && this.serviceItemDesc.equals(other.getServiceItemDesc())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.unitCost == null && other.getUnitCost() == null || this.unitCost != null && this.unitCost.equals(other.getUnitCost())) && (this.unitCostBase == null && other.getUnitCostBase() == null || this.unitCostBase != null && this.unitCostBase.equals(other.getUnitCostBase())) && (this.unitPrice == null && other.getUnitPrice() == null || this.unitPrice != null && this.unitPrice.equals(other.getUnitPrice())) && (this.unitPriceBase == null && other.getUnitPriceBase() == null || this.unitPriceBase != null && this.unitPriceBase.equals(other.getUnitPriceBase())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar()));
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
        if (this.getActualWork() != null) {
            _hashCode += this.getActualWork().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCostBase() != null) {
            _hashCode += this.getCostBase().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getEstimatedWorkBaseline() != null) {
            _hashCode += this.getEstimatedWorkBaseline().hashCode();
        }
        if (this.getGrossProfit() != null) {
            _hashCode += this.getGrossProfit().hashCode();
        }
        if (this.getGrossProfitBase() != null) {
            _hashCode += this.getGrossProfitBase().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
        }
        if (this.getPlannedWorkBaseline() != null) {
            _hashCode += this.getPlannedWorkBaseline().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getPriceBase() != null) {
            _hashCode += this.getPriceBase().hashCode();
        }
        if (this.getResource() != null) {
            _hashCode += this.getResource().hashCode();
        }
        if (this.getResourceName() != null) {
            _hashCode += this.getResourceName().hashCode();
        }
        if (this.getServiceItem() != null) {
            _hashCode += this.getServiceItem().hashCode();
        }
        if (this.getServiceItemDesc() != null) {
            _hashCode += this.getServiceItemDesc().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getUnitCost() != null) {
            _hashCode += this.getUnitCost().hashCode();
        }
        if (this.getUnitCostBase() != null) {
            _hashCode += this.getUnitCostBase().hashCode();
        }
        if (this.getUnitPrice() != null) {
            _hashCode += this.getUnitPrice().hashCode();
        }
        if (this.getUnitPriceBase() != null) {
            _hashCode += this.getUnitPriceBase().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBase"));
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
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossProfitBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossProfitBase"));
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
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resourceName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItemDesc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serviceItemDesc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitCostBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCostBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPriceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPriceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

