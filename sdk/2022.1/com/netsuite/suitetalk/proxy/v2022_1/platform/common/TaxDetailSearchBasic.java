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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TaxDetailSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField account;
    private SearchLongField lineNumber;
    private SearchDoubleField taxAmount;
    private SearchDoubleField taxBasis;
    private SearchMultiSelectField taxCode;
    private SearchDoubleField taxRate;
    private SearchMultiSelectField taxType;
    private SearchMultiSelectField tranId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxDetailSearchBasic.class, true);

    public TaxDetailSearchBasic() {
    }

    public TaxDetailSearchBasic(SearchMultiSelectField account, SearchLongField lineNumber, SearchDoubleField taxAmount, SearchDoubleField taxBasis, SearchMultiSelectField taxCode, SearchDoubleField taxRate, SearchMultiSelectField taxType, SearchMultiSelectField tranId) {
        this.account = account;
        this.lineNumber = lineNumber;
        this.taxAmount = taxAmount;
        this.taxBasis = taxBasis;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.taxType = taxType;
        this.tranId = tranId;
    }

    public SearchMultiSelectField getAccount() {
        return this.account;
    }

    public void setAccount(SearchMultiSelectField account) {
        this.account = account;
    }

    public SearchLongField getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(SearchLongField lineNumber) {
        this.lineNumber = lineNumber;
    }

    public SearchDoubleField getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(SearchDoubleField taxAmount) {
        this.taxAmount = taxAmount;
    }

    public SearchDoubleField getTaxBasis() {
        return this.taxBasis;
    }

    public void setTaxBasis(SearchDoubleField taxBasis) {
        this.taxBasis = taxBasis;
    }

    public SearchMultiSelectField getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(SearchMultiSelectField taxCode) {
        this.taxCode = taxCode;
    }

    public SearchDoubleField getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }

    public SearchMultiSelectField getTaxType() {
        return this.taxType;
    }

    public void setTaxType(SearchMultiSelectField taxType) {
        this.taxType = taxType;
    }

    public SearchMultiSelectField getTranId() {
        return this.tranId;
    }

    public void setTranId(SearchMultiSelectField tranId) {
        this.tranId = tranId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxDetailSearchBasic)) {
            return false;
        }
        TaxDetailSearchBasic other = (TaxDetailSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.lineNumber == null && other.getLineNumber() == null || this.lineNumber != null && this.lineNumber.equals(other.getLineNumber())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.taxBasis == null && other.getTaxBasis() == null || this.taxBasis != null && this.taxBasis.equals(other.getTaxBasis())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.taxType == null && other.getTaxType() == null || this.taxType != null && this.taxType.equals(other.getTaxType())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId()));
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
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getLineNumber() != null) {
            _hashCode += this.getLineNumber().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
        }
        if (this.getTaxBasis() != null) {
            _hashCode += this.getTaxBasis().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxRate() != null) {
            _hashCode += this.getTaxRate().hashCode();
        }
        if (this.getTaxType() != null) {
            _hashCode += this.getTaxType().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

