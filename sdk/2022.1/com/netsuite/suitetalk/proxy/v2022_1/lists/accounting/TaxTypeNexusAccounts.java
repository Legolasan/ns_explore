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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

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

public class TaxTypeNexusAccounts
implements Serializable {
    private RecordRef nexus;
    private RecordRef payablesAccount;
    private RecordRef receivablesAccount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxTypeNexusAccounts.class, true);

    public TaxTypeNexusAccounts() {
    }

    public TaxTypeNexusAccounts(RecordRef nexus, RecordRef payablesAccount, RecordRef receivablesAccount) {
        this.nexus = nexus;
        this.payablesAccount = payablesAccount;
        this.receivablesAccount = receivablesAccount;
    }

    public RecordRef getNexus() {
        return this.nexus;
    }

    public void setNexus(RecordRef nexus) {
        this.nexus = nexus;
    }

    public RecordRef getPayablesAccount() {
        return this.payablesAccount;
    }

    public void setPayablesAccount(RecordRef payablesAccount) {
        this.payablesAccount = payablesAccount;
    }

    public RecordRef getReceivablesAccount() {
        return this.receivablesAccount;
    }

    public void setReceivablesAccount(RecordRef receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxTypeNexusAccounts)) {
            return false;
        }
        TaxTypeNexusAccounts other = (TaxTypeNexusAccounts)obj;
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
        boolean _equals = (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.payablesAccount == null && other.getPayablesAccount() == null || this.payablesAccount != null && this.payablesAccount.equals(other.getPayablesAccount())) && (this.receivablesAccount == null && other.getReceivablesAccount() == null || this.receivablesAccount != null && this.receivablesAccount.equals(other.getReceivablesAccount()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getPayablesAccount() != null) {
            _hashCode += this.getPayablesAccount().hashCode();
        }
        if (this.getReceivablesAccount() != null) {
            _hashCode += this.getReceivablesAccount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TaxTypeNexusAccounts"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

