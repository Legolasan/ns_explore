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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class JobPlStatement
implements Serializable {
    private String costCategory;
    private Double revenue;
    private Double cost;
    private Double profit;
    private Double margin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JobPlStatement.class, true);

    public JobPlStatement() {
    }

    public JobPlStatement(String costCategory, Double revenue, Double cost, Double profit, Double margin) {
        this.costCategory = costCategory;
        this.revenue = revenue;
        this.cost = cost;
        this.profit = profit;
        this.margin = margin;
    }

    public String getCostCategory() {
        return this.costCategory;
    }

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getProfit() {
        return this.profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getMargin() {
        return this.margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JobPlStatement)) {
            return false;
        }
        JobPlStatement other = (JobPlStatement)obj;
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
        boolean _equals = (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.revenue == null && other.getRevenue() == null || this.revenue != null && this.revenue.equals(other.getRevenue())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.profit == null && other.getProfit() == null || this.profit != null && this.profit.equals(other.getProfit())) && (this.margin == null && other.getMargin() == null || this.margin != null && this.margin.equals(other.getMargin()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
        }
        if (this.getRevenue() != null) {
            _hashCode += this.getRevenue().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getProfit() != null) {
            _hashCode += this.getProfit().hashCode();
        }
        if (this.getMargin() != null) {
            _hashCode += this.getMargin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobPlStatement"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "revenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "profit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("margin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "margin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

