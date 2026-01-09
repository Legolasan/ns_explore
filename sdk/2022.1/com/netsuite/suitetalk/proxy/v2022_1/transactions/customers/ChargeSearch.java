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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.customers;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingAccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingScheduleSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ChargeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TimeBillSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.UsageSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
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

public class ChargeSearch
extends SearchRecord
implements Serializable {
    private ChargeSearchBasic basic;
    private BillingAccountSearchBasic billingAccountJoin;
    private BillingScheduleSearchBasic billingScheduleJoin;
    private EmployeeSearchBasic chargeEmployeeJoin;
    private CustomerSearchBasic customerJoin;
    private TransactionSearchBasic invoiceJoin;
    private ItemSearchBasic itemJoin;
    private JobSearchBasic jobJoin;
    private TransactionSearchBasic salesOrderJoin;
    private TimeBillSearchBasic timeJoin;
    private TransactionSearchBasic transactionJoin;
    private UsageSearchBasic usageJoin;
    private EmployeeSearchBasic userJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ChargeSearch.class, true);

    public ChargeSearch() {
    }

    public ChargeSearch(ChargeSearchBasic basic, BillingAccountSearchBasic billingAccountJoin, BillingScheduleSearchBasic billingScheduleJoin, EmployeeSearchBasic chargeEmployeeJoin, CustomerSearchBasic customerJoin, TransactionSearchBasic invoiceJoin, ItemSearchBasic itemJoin, JobSearchBasic jobJoin, TransactionSearchBasic salesOrderJoin, TimeBillSearchBasic timeJoin, TransactionSearchBasic transactionJoin, UsageSearchBasic usageJoin, EmployeeSearchBasic userJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.billingAccountJoin = billingAccountJoin;
        this.billingScheduleJoin = billingScheduleJoin;
        this.chargeEmployeeJoin = chargeEmployeeJoin;
        this.customerJoin = customerJoin;
        this.invoiceJoin = invoiceJoin;
        this.itemJoin = itemJoin;
        this.jobJoin = jobJoin;
        this.salesOrderJoin = salesOrderJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.usageJoin = usageJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ChargeSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ChargeSearchBasic basic) {
        this.basic = basic;
    }

    public BillingAccountSearchBasic getBillingAccountJoin() {
        return this.billingAccountJoin;
    }

    public void setBillingAccountJoin(BillingAccountSearchBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }

    public BillingScheduleSearchBasic getBillingScheduleJoin() {
        return this.billingScheduleJoin;
    }

    public void setBillingScheduleJoin(BillingScheduleSearchBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
    }

    public EmployeeSearchBasic getChargeEmployeeJoin() {
        return this.chargeEmployeeJoin;
    }

    public void setChargeEmployeeJoin(EmployeeSearchBasic chargeEmployeeJoin) {
        this.chargeEmployeeJoin = chargeEmployeeJoin;
    }

    public CustomerSearchBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public TransactionSearchBasic getInvoiceJoin() {
        return this.invoiceJoin;
    }

    public void setInvoiceJoin(TransactionSearchBasic invoiceJoin) {
        this.invoiceJoin = invoiceJoin;
    }

    public ItemSearchBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public JobSearchBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public TransactionSearchBasic getSalesOrderJoin() {
        return this.salesOrderJoin;
    }

    public void setSalesOrderJoin(TransactionSearchBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }

    public TimeBillSearchBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public TransactionSearchBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public UsageSearchBasic getUsageJoin() {
        return this.usageJoin;
    }

    public void setUsageJoin(UsageSearchBasic usageJoin) {
        this.usageJoin = usageJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public CustomSearchJoin[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChargeSearch)) {
            return false;
        }
        ChargeSearch other = (ChargeSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.billingAccountJoin == null && other.getBillingAccountJoin() == null || this.billingAccountJoin != null && this.billingAccountJoin.equals(other.getBillingAccountJoin())) && (this.billingScheduleJoin == null && other.getBillingScheduleJoin() == null || this.billingScheduleJoin != null && this.billingScheduleJoin.equals(other.getBillingScheduleJoin())) && (this.chargeEmployeeJoin == null && other.getChargeEmployeeJoin() == null || this.chargeEmployeeJoin != null && this.chargeEmployeeJoin.equals(other.getChargeEmployeeJoin())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.invoiceJoin == null && other.getInvoiceJoin() == null || this.invoiceJoin != null && this.invoiceJoin.equals(other.getInvoiceJoin())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.salesOrderJoin == null && other.getSalesOrderJoin() == null || this.salesOrderJoin != null && this.salesOrderJoin.equals(other.getSalesOrderJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.usageJoin == null && other.getUsageJoin() == null || this.usageJoin != null && this.usageJoin.equals(other.getUsageJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
        }
        if (this.getBillingAccountJoin() != null) {
            _hashCode += this.getBillingAccountJoin().hashCode();
        }
        if (this.getBillingScheduleJoin() != null) {
            _hashCode += this.getBillingScheduleJoin().hashCode();
        }
        if (this.getChargeEmployeeJoin() != null) {
            _hashCode += this.getChargeEmployeeJoin().hashCode();
        }
        if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
        }
        if (this.getInvoiceJoin() != null) {
            _hashCode += this.getInvoiceJoin().hashCode();
        }
        if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getSalesOrderJoin() != null) {
            _hashCode += this.getSalesOrderJoin().hashCode();
        }
        if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getUsageJoin() != null) {
            _hashCode += this.getUsageJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getCustomSearchJoin() != null) {
            for (int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
                Object obj = Array.get(this.getCustomSearchJoin(), i);
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ChargeSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeEmployeeJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "chargeEmployeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invoiceJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "invoiceJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usageJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "usageJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "UsageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

