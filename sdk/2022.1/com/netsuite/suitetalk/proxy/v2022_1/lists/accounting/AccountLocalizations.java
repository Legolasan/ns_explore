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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Language;
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

public class AccountLocalizations
implements Serializable {
    private RecordRef accountingContext;
    private String acctNumber;
    private String acctName;
    private String legalName;
    private Language locale;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountLocalizations.class, true);

    public AccountLocalizations() {
    }

    public AccountLocalizations(RecordRef accountingContext, String acctNumber, String acctName, String legalName, Language locale) {
        this.accountingContext = accountingContext;
        this.acctNumber = acctNumber;
        this.acctName = acctName;
        this.legalName = legalName;
        this.locale = locale;
    }

    public RecordRef getAccountingContext() {
        return this.accountingContext;
    }

    public void setAccountingContext(RecordRef accountingContext) {
        this.accountingContext = accountingContext;
    }

    public String getAcctNumber() {
        return this.acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getLegalName() {
        return this.legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public Language getLocale() {
        return this.locale;
    }

    public void setLocale(Language locale) {
        this.locale = locale;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountLocalizations)) {
            return false;
        }
        AccountLocalizations other = (AccountLocalizations)obj;
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
        boolean _equals = (this.accountingContext == null && other.getAccountingContext() == null || this.accountingContext != null && this.accountingContext.equals(other.getAccountingContext())) && (this.acctNumber == null && other.getAcctNumber() == null || this.acctNumber != null && this.acctNumber.equals(other.getAcctNumber())) && (this.acctName == null && other.getAcctName() == null || this.acctName != null && this.acctName.equals(other.getAcctName())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && this.legalName.equals(other.getLegalName())) && (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getAccountingContext() != null) {
            _hashCode += this.getAccountingContext().hashCode();
        }
        if (this.getAcctNumber() != null) {
            _hashCode += this.getAcctNumber().hashCode();
        }
        if (this.getAcctName() != null) {
            _hashCode += this.getAcctName().hashCode();
        }
        if (this.getLegalName() != null) {
            _hashCode += this.getLegalName().hashCode();
        }
        if (this.getLocale() != null) {
            _hashCode += this.getLocale().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AccountLocalizations"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "acctNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "acctName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

