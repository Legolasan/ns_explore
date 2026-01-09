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

public class TaxDetails
implements Serializable {
    private String taxDetailsReference;
    private String lineType;
    private String lineName;
    private Double netAmount;
    private Double grossAmount;
    private RecordRef taxType;
    private RecordRef taxCode;
    private Double taxBasis;
    private Double taxRate;
    private Double taxAmount;
    private String calcDetail;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxDetails.class, true);

    public TaxDetails() {
    }

    public TaxDetails(String taxDetailsReference, String lineType, String lineName, Double netAmount, Double grossAmount, RecordRef taxType, RecordRef taxCode, Double taxBasis, Double taxRate, Double taxAmount, String calcDetail) {
        this.taxDetailsReference = taxDetailsReference;
        this.lineType = lineType;
        this.lineName = lineName;
        this.netAmount = netAmount;
        this.grossAmount = grossAmount;
        this.taxType = taxType;
        this.taxCode = taxCode;
        this.taxBasis = taxBasis;
        this.taxRate = taxRate;
        this.taxAmount = taxAmount;
        this.calcDetail = calcDetail;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public String getLineType() {
        return this.lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getLineName() {
        return this.lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public Double getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(Double netAmount) {
        this.netAmount = netAmount;
    }

    public Double getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public RecordRef getTaxType() {
        return this.taxType;
    }

    public void setTaxType(RecordRef taxType) {
        this.taxType = taxType;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxBasis() {
        return this.taxBasis;
    }

    public void setTaxBasis(Double taxBasis) {
        this.taxBasis = taxBasis;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getCalcDetail() {
        return this.calcDetail;
    }

    public void setCalcDetail(String calcDetail) {
        this.calcDetail = calcDetail;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxDetails)) {
            return false;
        }
        TaxDetails other = (TaxDetails)obj;
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
        boolean _equals = (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.lineType == null && other.getLineType() == null || this.lineType != null && this.lineType.equals(other.getLineType())) && (this.lineName == null && other.getLineName() == null || this.lineName != null && this.lineName.equals(other.getLineName())) && (this.netAmount == null && other.getNetAmount() == null || this.netAmount != null && this.netAmount.equals(other.getNetAmount())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && this.grossAmount.equals(other.getGrossAmount())) && (this.taxType == null && other.getTaxType() == null || this.taxType != null && this.taxType.equals(other.getTaxType())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxBasis == null && other.getTaxBasis() == null || this.taxBasis != null && this.taxBasis.equals(other.getTaxBasis())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.calcDetail == null && other.getCalcDetail() == null || this.calcDetail != null && this.calcDetail.equals(other.getCalcDetail()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getLineType() != null) {
            _hashCode += this.getLineType().hashCode();
        }
        if (this.getLineName() != null) {
            _hashCode += this.getLineName().hashCode();
        }
        if (this.getNetAmount() != null) {
            _hashCode += this.getNetAmount().hashCode();
        }
        if (this.getGrossAmount() != null) {
            _hashCode += this.getGrossAmount().hashCode();
        }
        if (this.getTaxType() != null) {
            _hashCode += this.getTaxType().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxBasis() != null) {
            _hashCode += this.getTaxBasis().hashCode();
        }
        if (this.getTaxRate() != null) {
            _hashCode += this.getTaxRate().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
        }
        if (this.getCalcDetail() != null) {
            _hashCode += this.getCalcDetail().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetails"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calcDetail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calcDetail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

