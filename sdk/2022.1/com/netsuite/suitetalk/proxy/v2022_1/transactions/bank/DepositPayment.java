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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.bank;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DepositPayment
implements Serializable {
    private Boolean deposit;
    private Long id;
    private Calendar docDate;
    private String type;
    private String docNumber;
    private String memo;
    private RecordRef paymentMethod;
    private String refNum;
    private RecordRef entity;
    private RecordRef currency;
    private Double transactionAmount;
    private Double paymentAmount;
    private Long lineId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(DepositPayment.class, true);

    public DepositPayment() {
    }

    public DepositPayment(Boolean deposit, Long id, Calendar docDate, String type, String docNumber, String memo, RecordRef paymentMethod, String refNum, RecordRef entity, RecordRef currency, Double transactionAmount, Double paymentAmount, Long lineId) {
        this.deposit = deposit;
        this.id = id;
        this.docDate = docDate;
        this.type = type;
        this.docNumber = docNumber;
        this.memo = memo;
        this.paymentMethod = paymentMethod;
        this.refNum = refNum;
        this.entity = entity;
        this.currency = currency;
        this.transactionAmount = transactionAmount;
        this.paymentAmount = paymentAmount;
        this.lineId = lineId;
    }

    public Boolean getDeposit() {
        return this.deposit;
    }

    public void setDeposit(Boolean deposit) {
        this.deposit = deposit;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDocDate() {
        return this.docDate;
    }

    public void setDocDate(Calendar docDate) {
        this.docDate = docDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDocNumber() {
        return this.docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRefNum() {
        return this.refNum;
    }

    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getTransactionAmount() {
        return this.transactionAmount;
    }

    public void setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public Double getPaymentAmount() {
        return this.paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Long getLineId() {
        return this.lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DepositPayment)) {
            return false;
        }
        DepositPayment other = (DepositPayment)obj;
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
        boolean _equals = (this.deposit == null && other.getDeposit() == null || this.deposit != null && this.deposit.equals(other.getDeposit())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.docDate == null && other.getDocDate() == null || this.docDate != null && this.docDate.equals(other.getDocDate())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.docNumber == null && other.getDocNumber() == null || this.docNumber != null && this.docNumber.equals(other.getDocNumber())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.refNum == null && other.getRefNum() == null || this.refNum != null && this.refNum.equals(other.getRefNum())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.transactionAmount == null && other.getTransactionAmount() == null || this.transactionAmount != null && this.transactionAmount.equals(other.getTransactionAmount())) && (this.paymentAmount == null && other.getPaymentAmount() == null || this.paymentAmount != null && this.paymentAmount.equals(other.getPaymentAmount())) && (this.lineId == null && other.getLineId() == null || this.lineId != null && this.lineId.equals(other.getLineId()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getDeposit() != null) {
            _hashCode += this.getDeposit().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getDocDate() != null) {
            _hashCode += this.getDocDate().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getDocNumber() != null) {
            _hashCode += this.getDocNumber().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getRefNum() != null) {
            _hashCode += this.getRefNum().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getTransactionAmount() != null) {
            _hashCode += this.getTransactionAmount().hashCode();
        }
        if (this.getPaymentAmount() != null) {
            _hashCode += this.getPaymentAmount().hashCode();
        }
        if (this.getLineId() != null) {
            _hashCode += this.getLineId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "DepositPayment"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "deposit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("docDate");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "docDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("docNumber");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "docNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("refNum");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "refNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "transactionAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentAmount");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "paymentAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new QName("urn:bank_2022_1.transactions.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

