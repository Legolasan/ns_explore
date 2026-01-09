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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning;

import com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.PeriodDemandPlanList;
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

public class DemandPlan
implements Serializable {
    private Calendar startDate;
    private Calendar endDate;
    private Double calculatedQuantity;
    private PeriodDemandPlanList periodDemandPlanList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(DemandPlan.class, true);

    public DemandPlan() {
    }

    public DemandPlan(Calendar startDate, Calendar endDate, Double calculatedQuantity, PeriodDemandPlanList periodDemandPlanList) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.calculatedQuantity = calculatedQuantity;
        this.periodDemandPlanList = periodDemandPlanList;
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

    public Double getCalculatedQuantity() {
        return this.calculatedQuantity;
    }

    public void setCalculatedQuantity(Double calculatedQuantity) {
        this.calculatedQuantity = calculatedQuantity;
    }

    public PeriodDemandPlanList getPeriodDemandPlanList() {
        return this.periodDemandPlanList;
    }

    public void setPeriodDemandPlanList(PeriodDemandPlanList periodDemandPlanList) {
        this.periodDemandPlanList = periodDemandPlanList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DemandPlan)) {
            return false;
        }
        DemandPlan other = (DemandPlan)obj;
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
        boolean _equals = (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.calculatedQuantity == null && other.getCalculatedQuantity() == null || this.calculatedQuantity != null && this.calculatedQuantity.equals(other.getCalculatedQuantity())) && (this.periodDemandPlanList == null && other.getPeriodDemandPlanList() == null || this.periodDemandPlanList != null && this.periodDemandPlanList.equals(other.getPeriodDemandPlanList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getCalculatedQuantity() != null) {
            _hashCode += this.getCalculatedQuantity().hashCode();
        }
        if (this.getPeriodDemandPlanList() != null) {
            _hashCode += this.getPeriodDemandPlanList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "DemandPlan"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedQuantity");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "calculatedQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodDemandPlanList");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "periodDemandPlanList"));
        elemField.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "PeriodDemandPlanList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

