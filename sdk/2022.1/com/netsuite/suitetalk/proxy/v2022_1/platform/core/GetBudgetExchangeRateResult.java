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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Status;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetBudgetExchangeRateResult
implements Serializable {
    private Status status;
    private BudgetExchangeRateList budgetExchangeRateList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetBudgetExchangeRateResult.class, true);

    public GetBudgetExchangeRateResult() {
    }

    public GetBudgetExchangeRateResult(Status status, BudgetExchangeRateList budgetExchangeRateList) {
        this.status = status;
        this.budgetExchangeRateList = budgetExchangeRateList;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public BudgetExchangeRateList getBudgetExchangeRateList() {
        return this.budgetExchangeRateList;
    }

    public void setBudgetExchangeRateList(BudgetExchangeRateList budgetExchangeRateList) {
        this.budgetExchangeRateList = budgetExchangeRateList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBudgetExchangeRateResult)) {
            return false;
        }
        GetBudgetExchangeRateResult other = (GetBudgetExchangeRateResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.budgetExchangeRateList == null && other.getBudgetExchangeRateList() == null || this.budgetExchangeRateList != null && this.budgetExchangeRateList.equals(other.getBudgetExchangeRateList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getBudgetExchangeRateList() != null) {
            _hashCode += this.getBudgetExchangeRateList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetBudgetExchangeRateResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("budgetExchangeRateList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "budgetExchangeRateList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BudgetExchangeRateList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

