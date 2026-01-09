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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

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

public class CustomerCreditCards
implements Serializable {
    private String internalId;
    private String ccNumber;
    private Calendar ccExpireDate;
    private String ccName;
    private RecordRef paymentMethod;
    private RecordRef cardState;
    private Calendar stateFrom;
    private String debitcardIssueNo;
    private String ccMemo;
    private Calendar validfrom;
    private Boolean ccDefault;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerCreditCards.class, true);

    public CustomerCreditCards() {
    }

    public CustomerCreditCards(String internalId, String ccNumber, Calendar ccExpireDate, String ccName, RecordRef paymentMethod, RecordRef cardState, Calendar stateFrom, String debitcardIssueNo, String ccMemo, Calendar validfrom, Boolean ccDefault) {
        this.internalId = internalId;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.paymentMethod = paymentMethod;
        this.cardState = cardState;
        this.stateFrom = stateFrom;
        this.debitcardIssueNo = debitcardIssueNo;
        this.ccMemo = ccMemo;
        this.validfrom = validfrom;
        this.ccDefault = ccDefault;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Calendar getCcExpireDate() {
        return this.ccExpireDate;
    }

    public void setCcExpireDate(Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }

    public String getCcName() {
        return this.ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public RecordRef getCardState() {
        return this.cardState;
    }

    public void setCardState(RecordRef cardState) {
        this.cardState = cardState;
    }

    public Calendar getStateFrom() {
        return this.stateFrom;
    }

    public void setStateFrom(Calendar stateFrom) {
        this.stateFrom = stateFrom;
    }

    public String getDebitcardIssueNo() {
        return this.debitcardIssueNo;
    }

    public void setDebitcardIssueNo(String debitcardIssueNo) {
        this.debitcardIssueNo = debitcardIssueNo;
    }

    public String getCcMemo() {
        return this.ccMemo;
    }

    public void setCcMemo(String ccMemo) {
        this.ccMemo = ccMemo;
    }

    public Calendar getValidfrom() {
        return this.validfrom;
    }

    public void setValidfrom(Calendar validfrom) {
        this.validfrom = validfrom;
    }

    public Boolean getCcDefault() {
        return this.ccDefault;
    }

    public void setCcDefault(Boolean ccDefault) {
        this.ccDefault = ccDefault;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomerCreditCards)) {
            return false;
        }
        CustomerCreditCards other = (CustomerCreditCards)obj;
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
        boolean _equals = (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.cardState == null && other.getCardState() == null || this.cardState != null && this.cardState.equals(other.getCardState())) && (this.stateFrom == null && other.getStateFrom() == null || this.stateFrom != null && this.stateFrom.equals(other.getStateFrom())) && (this.debitcardIssueNo == null && other.getDebitcardIssueNo() == null || this.debitcardIssueNo != null && this.debitcardIssueNo.equals(other.getDebitcardIssueNo())) && (this.ccMemo == null && other.getCcMemo() == null || this.ccMemo != null && this.ccMemo.equals(other.getCcMemo())) && (this.validfrom == null && other.getValidfrom() == null || this.validfrom != null && this.validfrom.equals(other.getValidfrom())) && (this.ccDefault == null && other.getCcDefault() == null || this.ccDefault != null && this.ccDefault.equals(other.getCcDefault()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getCcExpireDate() != null) {
            _hashCode += this.getCcExpireDate().hashCode();
        }
        if (this.getCcName() != null) {
            _hashCode += this.getCcName().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getCardState() != null) {
            _hashCode += this.getCardState().hashCode();
        }
        if (this.getStateFrom() != null) {
            _hashCode += this.getStateFrom().hashCode();
        }
        if (this.getDebitcardIssueNo() != null) {
            _hashCode += this.getDebitcardIssueNo().hashCode();
        }
        if (this.getCcMemo() != null) {
            _hashCode += this.getCcMemo().hashCode();
        }
        if (this.getValidfrom() != null) {
            _hashCode += this.getValidfrom().hashCode();
        }
        if (this.getCcDefault() != null) {
            _hashCode += this.getCcDefault().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerCreditCards"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardState");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "cardState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stateFrom");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "stateFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitcardIssueNo");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "debitcardIssueNo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccMemo");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ccMemo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validfrom");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "validfrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

