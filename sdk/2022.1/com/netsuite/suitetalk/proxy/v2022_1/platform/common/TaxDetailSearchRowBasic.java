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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class TaxDetailSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] account;
    private SearchColumnStringField[] details;
    private SearchColumnLongField[] lineNumber;
    private SearchColumnDoubleField[] taxAmount;
    private SearchColumnDoubleField[] taxBasis;
    private SearchColumnSelectField[] taxCode;
    private SearchColumnDoubleField[] taxRate;
    private SearchColumnSelectField[] taxType;
    private SearchColumnLongField[] tranId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxDetailSearchRowBasic.class, true);

    public TaxDetailSearchRowBasic() {
    }

    public TaxDetailSearchRowBasic(SearchColumnStringField[] account, SearchColumnStringField[] details, SearchColumnLongField[] lineNumber, SearchColumnDoubleField[] taxAmount, SearchColumnDoubleField[] taxBasis, SearchColumnSelectField[] taxCode, SearchColumnDoubleField[] taxRate, SearchColumnSelectField[] taxType, SearchColumnLongField[] tranId) {
        this.account = account;
        this.details = details;
        this.lineNumber = lineNumber;
        this.taxAmount = taxAmount;
        this.taxBasis = taxBasis;
        this.taxCode = taxCode;
        this.taxRate = taxRate;
        this.taxType = taxType;
        this.tranId = tranId;
    }

    public SearchColumnStringField[] getAccount() {
        return this.account;
    }

    public void setAccount(SearchColumnStringField[] account) {
        this.account = account;
    }

    public SearchColumnStringField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, SearchColumnStringField _value) {
        this.account[i] = _value;
    }

    public SearchColumnStringField[] getDetails() {
        return this.details;
    }

    public void setDetails(SearchColumnStringField[] details) {
        this.details = details;
    }

    public SearchColumnStringField getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, SearchColumnStringField _value) {
        this.details[i] = _value;
    }

    public SearchColumnLongField[] getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(SearchColumnLongField[] lineNumber) {
        this.lineNumber = lineNumber;
    }

    public SearchColumnLongField getLineNumber(int i) {
        return this.lineNumber[i];
    }

    public void setLineNumber(int i, SearchColumnLongField _value) {
        this.lineNumber[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(SearchColumnDoubleField[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public SearchColumnDoubleField getTaxAmount(int i) {
        return this.taxAmount[i];
    }

    public void setTaxAmount(int i, SearchColumnDoubleField _value) {
        this.taxAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxBasis() {
        return this.taxBasis;
    }

    public void setTaxBasis(SearchColumnDoubleField[] taxBasis) {
        this.taxBasis = taxBasis;
    }

    public SearchColumnDoubleField getTaxBasis(int i) {
        return this.taxBasis[i];
    }

    public void setTaxBasis(int i, SearchColumnDoubleField _value) {
        this.taxBasis[i] = _value;
    }

    public SearchColumnSelectField[] getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(SearchColumnSelectField[] taxCode) {
        this.taxCode = taxCode;
    }

    public SearchColumnSelectField getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, SearchColumnSelectField _value) {
        this.taxCode[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(SearchColumnDoubleField[] taxRate) {
        this.taxRate = taxRate;
    }

    public SearchColumnDoubleField getTaxRate(int i) {
        return this.taxRate[i];
    }

    public void setTaxRate(int i, SearchColumnDoubleField _value) {
        this.taxRate[i] = _value;
    }

    public SearchColumnSelectField[] getTaxType() {
        return this.taxType;
    }

    public void setTaxType(SearchColumnSelectField[] taxType) {
        this.taxType = taxType;
    }

    public SearchColumnSelectField getTaxType(int i) {
        return this.taxType[i];
    }

    public void setTaxType(int i, SearchColumnSelectField _value) {
        this.taxType[i] = _value;
    }

    public SearchColumnLongField[] getTranId() {
        return this.tranId;
    }

    public void setTranId(SearchColumnLongField[] tranId) {
        this.tranId = tranId;
    }

    public SearchColumnLongField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, SearchColumnLongField _value) {
        this.tranId[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxDetailSearchRowBasic)) {
            return false;
        }
        TaxDetailSearchRowBasic other = (TaxDetailSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && Arrays.equals(this.account, other.getAccount())) && (this.details == null && other.getDetails() == null || this.details != null && Arrays.equals(this.details, other.getDetails())) && (this.lineNumber == null && other.getLineNumber() == null || this.lineNumber != null && Arrays.equals(this.lineNumber, other.getLineNumber())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && Arrays.equals(this.taxAmount, other.getTaxAmount())) && (this.taxBasis == null && other.getTaxBasis() == null || this.taxBasis != null && Arrays.equals(this.taxBasis, other.getTaxBasis())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && Arrays.equals(this.taxCode, other.getTaxCode())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && Arrays.equals(this.taxRate, other.getTaxRate())) && (this.taxType == null && other.getTaxType() == null || this.taxType != null && Arrays.equals(this.taxType, other.getTaxType())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && Arrays.equals(this.tranId, other.getTranId()));
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
        if (this.getAccount() != null) {
            for (i = 0; i < Array.getLength(this.getAccount()); ++i) {
                obj = Array.get(this.getAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDetails() != null) {
            for (i = 0; i < Array.getLength(this.getDetails()); ++i) {
                obj = Array.get(this.getDetails(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLineNumber() != null) {
            for (i = 0; i < Array.getLength(this.getLineNumber()); ++i) {
                obj = Array.get(this.getLineNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getTaxAmount()); ++i) {
                obj = Array.get(this.getTaxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxBasis() != null) {
            for (i = 0; i < Array.getLength(this.getTaxBasis()); ++i) {
                obj = Array.get(this.getTaxBasis(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxCode() != null) {
            for (i = 0; i < Array.getLength(this.getTaxCode()); ++i) {
                obj = Array.get(this.getTaxCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxRate() != null) {
            for (i = 0; i < Array.getLength(this.getTaxRate()); ++i) {
                obj = Array.get(this.getTaxRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxType() != null) {
            for (i = 0; i < Array.getLength(this.getTaxType()); ++i) {
                obj = Array.get(this.getTaxType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranId() != null) {
            for (i = 0; i < Array.getLength(this.getTranId()); ++i) {
                obj = Array.get(this.getTranId(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "details"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

