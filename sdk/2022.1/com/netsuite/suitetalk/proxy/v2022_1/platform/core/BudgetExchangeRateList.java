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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRate;
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

public class BudgetExchangeRateList
implements Serializable {
    private BudgetExchangeRate[] budgetExchangeRate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BudgetExchangeRateList.class, true);

    public BudgetExchangeRateList() {
    }

    public BudgetExchangeRateList(BudgetExchangeRate[] budgetExchangeRate) {
        this.budgetExchangeRate = budgetExchangeRate;
    }

    public BudgetExchangeRate[] getBudgetExchangeRate() {
        return this.budgetExchangeRate;
    }

    public void setBudgetExchangeRate(BudgetExchangeRate[] budgetExchangeRate) {
        this.budgetExchangeRate = budgetExchangeRate;
    }

    public BudgetExchangeRate getBudgetExchangeRate(int i) {
        return this.budgetExchangeRate[i];
    }

    public void setBudgetExchangeRate(int i, BudgetExchangeRate _value) {
        this.budgetExchangeRate[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BudgetExchangeRateList)) {
            return false;
        }
        BudgetExchangeRateList other = (BudgetExchangeRateList)obj;
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
        boolean _equals = this.budgetExchangeRate == null && other.getBudgetExchangeRate() == null || this.budgetExchangeRate != null && Arrays.equals(this.budgetExchangeRate, other.getBudgetExchangeRate());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getBudgetExchangeRate() != null) {
            for (int i = 0; i < Array.getLength(this.getBudgetExchangeRate()); ++i) {
                Object obj = Array.get(this.getBudgetExchangeRate(), i);
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BudgetExchangeRateList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("budgetExchangeRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "budgetExchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BudgetExchangeRate"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

