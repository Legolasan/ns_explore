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

import com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.PeriodDemandPlan;
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

public class PeriodDemandPlanList
implements Serializable {
    private PeriodDemandPlan[] periodDemandPlan;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PeriodDemandPlanList.class, true);

    public PeriodDemandPlanList() {
    }

    public PeriodDemandPlanList(PeriodDemandPlan[] periodDemandPlan) {
        this.periodDemandPlan = periodDemandPlan;
    }

    public PeriodDemandPlan[] getPeriodDemandPlan() {
        return this.periodDemandPlan;
    }

    public void setPeriodDemandPlan(PeriodDemandPlan[] periodDemandPlan) {
        this.periodDemandPlan = periodDemandPlan;
    }

    public PeriodDemandPlan getPeriodDemandPlan(int i) {
        return this.periodDemandPlan[i];
    }

    public void setPeriodDemandPlan(int i, PeriodDemandPlan _value) {
        this.periodDemandPlan[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PeriodDemandPlanList)) {
            return false;
        }
        PeriodDemandPlanList other = (PeriodDemandPlanList)obj;
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
        boolean _equals = this.periodDemandPlan == null && other.getPeriodDemandPlan() == null || this.periodDemandPlan != null && Arrays.equals(this.periodDemandPlan, other.getPeriodDemandPlan());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPeriodDemandPlan() != null) {
            for (int i = 0; i < Array.getLength(this.getPeriodDemandPlan()); ++i) {
                Object obj = Array.get(this.getPeriodDemandPlan(), i);
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
        typeDesc.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "PeriodDemandPlanList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("periodDemandPlan");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "periodDemandPlan"));
        elemField.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "PeriodDemandPlan"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

