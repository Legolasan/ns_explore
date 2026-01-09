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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
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

public class ProjectTaskAssignmentSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] actualWork;
    private SearchColumnDoubleField[] cost;
    private SearchColumnDoubleField[] costBase;
    private SearchColumnDateField[] endDate;
    private SearchColumnDoubleField[] estimatedWork;
    private SearchColumnDoubleField[] estimatedWorkBaseline;
    private SearchColumnDoubleField[] grossProfit;
    private SearchColumnDoubleField[] grossProfitBase;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDoubleField[] plannedWork;
    private SearchColumnDoubleField[] plannedWorkBaseline;
    private SearchColumnDoubleField[] price;
    private SearchColumnDoubleField[] priceBase;
    private SearchColumnSelectField[] resource;
    private SearchColumnStringField[] resourceName;
    private SearchColumnStringField[] serviceItem;
    private SearchColumnStringField[] serviceItemDesc;
    private SearchColumnDateField[] startDate;
    private SearchColumnDoubleField[] unitCost;
    private SearchColumnDoubleField[] unitCostBase;
    private SearchColumnDoubleField[] unitPrice;
    private SearchColumnDoubleField[] unitPriceBase;
    private SearchColumnDoubleField[] units;
    private SearchColumnSelectField[] workCalendar;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskAssignmentSearchRowBasic.class, true);

    public ProjectTaskAssignmentSearchRowBasic() {
    }

    public ProjectTaskAssignmentSearchRowBasic(SearchColumnDoubleField[] actualWork, SearchColumnDoubleField[] cost, SearchColumnDoubleField[] costBase, SearchColumnDateField[] endDate, SearchColumnDoubleField[] estimatedWork, SearchColumnDoubleField[] estimatedWorkBaseline, SearchColumnDoubleField[] grossProfit, SearchColumnDoubleField[] grossProfitBase, SearchColumnSelectField[] internalId, SearchColumnDoubleField[] plannedWork, SearchColumnDoubleField[] plannedWorkBaseline, SearchColumnDoubleField[] price, SearchColumnDoubleField[] priceBase, SearchColumnSelectField[] resource, SearchColumnStringField[] resourceName, SearchColumnStringField[] serviceItem, SearchColumnStringField[] serviceItemDesc, SearchColumnDateField[] startDate, SearchColumnDoubleField[] unitCost, SearchColumnDoubleField[] unitCostBase, SearchColumnDoubleField[] unitPrice, SearchColumnDoubleField[] unitPriceBase, SearchColumnDoubleField[] units, SearchColumnSelectField[] workCalendar) {
        this.actualWork = actualWork;
        this.cost = cost;
        this.costBase = costBase;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.grossProfit = grossProfit;
        this.grossProfitBase = grossProfitBase;
        this.internalId = internalId;
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

    public SearchColumnDoubleField[] getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(SearchColumnDoubleField[] actualWork) {
        this.actualWork = actualWork;
    }

    public SearchColumnDoubleField getActualWork(int i) {
        return this.actualWork[i];
    }

    public void setActualWork(int i, SearchColumnDoubleField _value) {
        this.actualWork[i] = _value;
    }

    public SearchColumnDoubleField[] getCost() {
        return this.cost;
    }

    public void setCost(SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }

    public SearchColumnDoubleField[] getCostBase() {
        return this.costBase;
    }

    public void setCostBase(SearchColumnDoubleField[] costBase) {
        this.costBase = costBase;
    }

    public SearchColumnDoubleField getCostBase(int i) {
        return this.costBase[i];
    }

    public void setCostBase(int i, SearchColumnDoubleField _value) {
        this.costBase[i] = _value;
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

    public SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return this.estimatedWorkBaseline;
    }

    public void setEstimatedWorkBaseline(SearchColumnDoubleField[] estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public SearchColumnDoubleField getEstimatedWorkBaseline(int i) {
        return this.estimatedWorkBaseline[i];
    }

    public void setEstimatedWorkBaseline(int i, SearchColumnDoubleField _value) {
        this.estimatedWorkBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getGrossProfit() {
        return this.grossProfit;
    }

    public void setGrossProfit(SearchColumnDoubleField[] grossProfit) {
        this.grossProfit = grossProfit;
    }

    public SearchColumnDoubleField getGrossProfit(int i) {
        return this.grossProfit[i];
    }

    public void setGrossProfit(int i, SearchColumnDoubleField _value) {
        this.grossProfit[i] = _value;
    }

    public SearchColumnDoubleField[] getGrossProfitBase() {
        return this.grossProfitBase;
    }

    public void setGrossProfitBase(SearchColumnDoubleField[] grossProfitBase) {
        this.grossProfitBase = grossProfitBase;
    }

    public SearchColumnDoubleField getGrossProfitBase(int i) {
        return this.grossProfitBase[i];
    }

    public void setGrossProfitBase(int i, SearchColumnDoubleField _value) {
        this.grossProfitBase[i] = _value;
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

    public SearchColumnDoubleField[] getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchColumnDoubleField[] plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchColumnDoubleField getPlannedWork(int i) {
        return this.plannedWork[i];
    }

    public void setPlannedWork(int i, SearchColumnDoubleField _value) {
        this.plannedWork[i] = _value;
    }

    public SearchColumnDoubleField[] getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchColumnDoubleField[] plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchColumnDoubleField getPlannedWorkBaseline(int i) {
        return this.plannedWorkBaseline[i];
    }

    public void setPlannedWorkBaseline(int i, SearchColumnDoubleField _value) {
        this.plannedWorkBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getPrice() {
        return this.price;
    }

    public void setPrice(SearchColumnDoubleField[] price) {
        this.price = price;
    }

    public SearchColumnDoubleField getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, SearchColumnDoubleField _value) {
        this.price[i] = _value;
    }

    public SearchColumnDoubleField[] getPriceBase() {
        return this.priceBase;
    }

    public void setPriceBase(SearchColumnDoubleField[] priceBase) {
        this.priceBase = priceBase;
    }

    public SearchColumnDoubleField getPriceBase(int i) {
        return this.priceBase[i];
    }

    public void setPriceBase(int i, SearchColumnDoubleField _value) {
        this.priceBase[i] = _value;
    }

    public SearchColumnSelectField[] getResource() {
        return this.resource;
    }

    public void setResource(SearchColumnSelectField[] resource) {
        this.resource = resource;
    }

    public SearchColumnSelectField getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, SearchColumnSelectField _value) {
        this.resource[i] = _value;
    }

    public SearchColumnStringField[] getResourceName() {
        return this.resourceName;
    }

    public void setResourceName(SearchColumnStringField[] resourceName) {
        this.resourceName = resourceName;
    }

    public SearchColumnStringField getResourceName(int i) {
        return this.resourceName[i];
    }

    public void setResourceName(int i, SearchColumnStringField _value) {
        this.resourceName[i] = _value;
    }

    public SearchColumnStringField[] getServiceItem() {
        return this.serviceItem;
    }

    public void setServiceItem(SearchColumnStringField[] serviceItem) {
        this.serviceItem = serviceItem;
    }

    public SearchColumnStringField getServiceItem(int i) {
        return this.serviceItem[i];
    }

    public void setServiceItem(int i, SearchColumnStringField _value) {
        this.serviceItem[i] = _value;
    }

    public SearchColumnStringField[] getServiceItemDesc() {
        return this.serviceItemDesc;
    }

    public void setServiceItemDesc(SearchColumnStringField[] serviceItemDesc) {
        this.serviceItemDesc = serviceItemDesc;
    }

    public SearchColumnStringField getServiceItemDesc(int i) {
        return this.serviceItemDesc[i];
    }

    public void setServiceItemDesc(int i, SearchColumnStringField _value) {
        this.serviceItemDesc[i] = _value;
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

    public SearchColumnDoubleField[] getUnitCost() {
        return this.unitCost;
    }

    public void setUnitCost(SearchColumnDoubleField[] unitCost) {
        this.unitCost = unitCost;
    }

    public SearchColumnDoubleField getUnitCost(int i) {
        return this.unitCost[i];
    }

    public void setUnitCost(int i, SearchColumnDoubleField _value) {
        this.unitCost[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitCostBase() {
        return this.unitCostBase;
    }

    public void setUnitCostBase(SearchColumnDoubleField[] unitCostBase) {
        this.unitCostBase = unitCostBase;
    }

    public SearchColumnDoubleField getUnitCostBase(int i) {
        return this.unitCostBase[i];
    }

    public void setUnitCostBase(int i, SearchColumnDoubleField _value) {
        this.unitCostBase[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(SearchColumnDoubleField[] unitPrice) {
        this.unitPrice = unitPrice;
    }

    public SearchColumnDoubleField getUnitPrice(int i) {
        return this.unitPrice[i];
    }

    public void setUnitPrice(int i, SearchColumnDoubleField _value) {
        this.unitPrice[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitPriceBase() {
        return this.unitPriceBase;
    }

    public void setUnitPriceBase(SearchColumnDoubleField[] unitPriceBase) {
        this.unitPriceBase = unitPriceBase;
    }

    public SearchColumnDoubleField getUnitPriceBase(int i) {
        return this.unitPriceBase[i];
    }

    public void setUnitPriceBase(int i, SearchColumnDoubleField _value) {
        this.unitPriceBase[i] = _value;
    }

    public SearchColumnDoubleField[] getUnits() {
        return this.units;
    }

    public void setUnits(SearchColumnDoubleField[] units) {
        this.units = units;
    }

    public SearchColumnDoubleField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, SearchColumnDoubleField _value) {
        this.units[i] = _value;
    }

    public SearchColumnSelectField[] getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchColumnSelectField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchColumnSelectField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, SearchColumnSelectField _value) {
        this.workCalendar[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskAssignmentSearchRowBasic)) {
            return false;
        }
        ProjectTaskAssignmentSearchRowBasic other = (ProjectTaskAssignmentSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && Arrays.equals(this.actualWork, other.getActualWork())) && (this.cost == null && other.getCost() == null || this.cost != null && Arrays.equals(this.cost, other.getCost())) && (this.costBase == null && other.getCostBase() == null || this.costBase != null && Arrays.equals(this.costBase, other.getCostBase())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && Arrays.equals(this.estimatedWork, other.getEstimatedWork())) && (this.estimatedWorkBaseline == null && other.getEstimatedWorkBaseline() == null || this.estimatedWorkBaseline != null && Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline())) && (this.grossProfit == null && other.getGrossProfit() == null || this.grossProfit != null && Arrays.equals(this.grossProfit, other.getGrossProfit())) && (this.grossProfitBase == null && other.getGrossProfitBase() == null || this.grossProfitBase != null && Arrays.equals(this.grossProfitBase, other.getGrossProfitBase())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && Arrays.equals(this.plannedWork, other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && Arrays.equals(this.plannedWorkBaseline, other.getPlannedWorkBaseline())) && (this.price == null && other.getPrice() == null || this.price != null && Arrays.equals(this.price, other.getPrice())) && (this.priceBase == null && other.getPriceBase() == null || this.priceBase != null && Arrays.equals(this.priceBase, other.getPriceBase())) && (this.resource == null && other.getResource() == null || this.resource != null && Arrays.equals(this.resource, other.getResource())) && (this.resourceName == null && other.getResourceName() == null || this.resourceName != null && Arrays.equals(this.resourceName, other.getResourceName())) && (this.serviceItem == null && other.getServiceItem() == null || this.serviceItem != null && Arrays.equals(this.serviceItem, other.getServiceItem())) && (this.serviceItemDesc == null && other.getServiceItemDesc() == null || this.serviceItemDesc != null && Arrays.equals(this.serviceItemDesc, other.getServiceItemDesc())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.unitCost == null && other.getUnitCost() == null || this.unitCost != null && Arrays.equals(this.unitCost, other.getUnitCost())) && (this.unitCostBase == null && other.getUnitCostBase() == null || this.unitCostBase != null && Arrays.equals(this.unitCostBase, other.getUnitCostBase())) && (this.unitPrice == null && other.getUnitPrice() == null || this.unitPrice != null && Arrays.equals(this.unitPrice, other.getUnitPrice())) && (this.unitPriceBase == null && other.getUnitPriceBase() == null || this.unitPriceBase != null && Arrays.equals(this.unitPriceBase, other.getUnitPriceBase())) && (this.units == null && other.getUnits() == null || this.units != null && Arrays.equals(this.units, other.getUnits())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && Arrays.equals(this.workCalendar, other.getWorkCalendar()));
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
        if (this.getActualWork() != null) {
            for (i = 0; i < Array.getLength(this.getActualWork()); ++i) {
                obj = Array.get(this.getActualWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCost() != null) {
            for (i = 0; i < Array.getLength(this.getCost()); ++i) {
                obj = Array.get(this.getCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostBase() != null) {
            for (i = 0; i < Array.getLength(this.getCostBase()); ++i) {
                obj = Array.get(this.getCostBase(), i);
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
        if (this.getEstimatedWorkBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWorkBaseline()); ++i) {
                obj = Array.get(this.getEstimatedWorkBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getGrossProfit()); ++i) {
                obj = Array.get(this.getGrossProfit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGrossProfitBase() != null) {
            for (i = 0; i < Array.getLength(this.getGrossProfitBase()); ++i) {
                obj = Array.get(this.getGrossProfitBase(), i);
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
        if (this.getPlannedWork() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWork()); ++i) {
                obj = Array.get(this.getPlannedWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPlannedWorkBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWorkBaseline()); ++i) {
                obj = Array.get(this.getPlannedWorkBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrice() != null) {
            for (i = 0; i < Array.getLength(this.getPrice()); ++i) {
                obj = Array.get(this.getPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriceBase() != null) {
            for (i = 0; i < Array.getLength(this.getPriceBase()); ++i) {
                obj = Array.get(this.getPriceBase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResource() != null) {
            for (i = 0; i < Array.getLength(this.getResource()); ++i) {
                obj = Array.get(this.getResource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResourceName() != null) {
            for (i = 0; i < Array.getLength(this.getResourceName()); ++i) {
                obj = Array.get(this.getResourceName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getServiceItem() != null) {
            for (i = 0; i < Array.getLength(this.getServiceItem()); ++i) {
                obj = Array.get(this.getServiceItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getServiceItemDesc() != null) {
            for (i = 0; i < Array.getLength(this.getServiceItemDesc()); ++i) {
                obj = Array.get(this.getServiceItemDesc(), i);
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
        if (this.getUnitCost() != null) {
            for (i = 0; i < Array.getLength(this.getUnitCost()); ++i) {
                obj = Array.get(this.getUnitCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitCostBase() != null) {
            for (i = 0; i < Array.getLength(this.getUnitCostBase()); ++i) {
                obj = Array.get(this.getUnitCostBase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitPrice() != null) {
            for (i = 0; i < Array.getLength(this.getUnitPrice()); ++i) {
                obj = Array.get(this.getUnitPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitPriceBase() != null) {
            for (i = 0; i < Array.getLength(this.getUnitPriceBase()); ++i) {
                obj = Array.get(this.getUnitPriceBase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnits() != null) {
            for (i = 0; i < Array.getLength(this.getUnits()); ++i) {
                obj = Array.get(this.getUnits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWorkCalendar() != null) {
            for (i = 0; i < Array.getLength(this.getWorkCalendar()); ++i) {
                obj = Array.get(this.getWorkCalendar(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBase"));
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
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossProfitBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossProfitBase"));
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
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resourceName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItemDesc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serviceItemDesc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitCostBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCostBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPriceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPriceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

