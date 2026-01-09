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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class RevRecScheduleSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField accountingBook;
    private SearchEnumMultiSelectField amorStatus;
    private SearchDoubleField amortizedAmount;
    private SearchEnumMultiSelectField amorType;
    private SearchDoubleField amount;
    private SearchMultiSelectField currency;
    private SearchDoubleField deferredAmount;
    private SearchMultiSelectField destAcct;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchDoubleField initialAmt;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isRecognized;
    private SearchMultiSelectField jeDoc;
    private SearchStringField name;
    private SearchDoubleField pctComplete;
    private SearchDoubleField pctRecognition;
    private SearchLongField periodOffset;
    private SearchMultiSelectField postPeriod;
    private SearchDateField schedDate;
    private SearchLongField scheduleNumber;
    private SearchStringField scheduleNumberText;
    private SearchMultiSelectField sourceAcct;
    private SearchMultiSelectField srcTranPostPeriod;
    private SearchMultiSelectField srcTranType;
    private SearchLongField startOffset;
    private SearchStringField templateName;
    private SearchBooleanField useForeignAmounts;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecScheduleSearchBasic.class, true);

    public RevRecScheduleSearchBasic() {
    }

    public RevRecScheduleSearchBasic(SearchMultiSelectField accountingBook, SearchEnumMultiSelectField amorStatus, SearchDoubleField amortizedAmount, SearchEnumMultiSelectField amorType, SearchDoubleField amount, SearchMultiSelectField currency, SearchDoubleField deferredAmount, SearchMultiSelectField destAcct, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchDoubleField initialAmt, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isRecognized, SearchMultiSelectField jeDoc, SearchStringField name, SearchDoubleField pctComplete, SearchDoubleField pctRecognition, SearchLongField periodOffset, SearchMultiSelectField postPeriod, SearchDateField schedDate, SearchLongField scheduleNumber, SearchStringField scheduleNumberText, SearchMultiSelectField sourceAcct, SearchMultiSelectField srcTranPostPeriod, SearchMultiSelectField srcTranType, SearchLongField startOffset, SearchStringField templateName, SearchBooleanField useForeignAmounts) {
        this.accountingBook = accountingBook;
        this.amorStatus = amorStatus;
        this.amortizedAmount = amortizedAmount;
        this.amorType = amorType;
        this.amount = amount;
        this.currency = currency;
        this.deferredAmount = deferredAmount;
        this.destAcct = destAcct;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.initialAmt = initialAmt;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isRecognized = isRecognized;
        this.jeDoc = jeDoc;
        this.name = name;
        this.pctComplete = pctComplete;
        this.pctRecognition = pctRecognition;
        this.periodOffset = periodOffset;
        this.postPeriod = postPeriod;
        this.schedDate = schedDate;
        this.scheduleNumber = scheduleNumber;
        this.scheduleNumberText = scheduleNumberText;
        this.sourceAcct = sourceAcct;
        this.srcTranPostPeriod = srcTranPostPeriod;
        this.srcTranType = srcTranType;
        this.startOffset = startOffset;
        this.templateName = templateName;
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchMultiSelectField getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchEnumMultiSelectField getAmorStatus() {
        return this.amorStatus;
    }

    public void setAmorStatus(SearchEnumMultiSelectField amorStatus) {
        this.amorStatus = amorStatus;
    }

    public SearchDoubleField getAmortizedAmount() {
        return this.amortizedAmount;
    }

    public void setAmortizedAmount(SearchDoubleField amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }

    public SearchEnumMultiSelectField getAmorType() {
        return this.amorType;
    }

    public void setAmorType(SearchEnumMultiSelectField amorType) {
        this.amorType = amorType;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchDoubleField getDeferredAmount() {
        return this.deferredAmount;
    }

    public void setDeferredAmount(SearchDoubleField deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    public SearchMultiSelectField getDestAcct() {
        return this.destAcct;
    }

    public void setDestAcct(SearchMultiSelectField destAcct) {
        this.destAcct = destAcct;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchDoubleField getInitialAmt() {
        return this.initialAmt;
    }

    public void setInitialAmt(SearchDoubleField initialAmt) {
        this.initialAmt = initialAmt;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getIsRecognized() {
        return this.isRecognized;
    }

    public void setIsRecognized(SearchBooleanField isRecognized) {
        this.isRecognized = isRecognized;
    }

    public SearchMultiSelectField getJeDoc() {
        return this.jeDoc;
    }

    public void setJeDoc(SearchMultiSelectField jeDoc) {
        this.jeDoc = jeDoc;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchDoubleField getPctComplete() {
        return this.pctComplete;
    }

    public void setPctComplete(SearchDoubleField pctComplete) {
        this.pctComplete = pctComplete;
    }

    public SearchDoubleField getPctRecognition() {
        return this.pctRecognition;
    }

    public void setPctRecognition(SearchDoubleField pctRecognition) {
        this.pctRecognition = pctRecognition;
    }

    public SearchLongField getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(SearchLongField periodOffset) {
        this.periodOffset = periodOffset;
    }

    public SearchMultiSelectField getPostPeriod() {
        return this.postPeriod;
    }

    public void setPostPeriod(SearchMultiSelectField postPeriod) {
        this.postPeriod = postPeriod;
    }

    public SearchDateField getSchedDate() {
        return this.schedDate;
    }

    public void setSchedDate(SearchDateField schedDate) {
        this.schedDate = schedDate;
    }

    public SearchLongField getScheduleNumber() {
        return this.scheduleNumber;
    }

    public void setScheduleNumber(SearchLongField scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public SearchStringField getScheduleNumberText() {
        return this.scheduleNumberText;
    }

    public void setScheduleNumberText(SearchStringField scheduleNumberText) {
        this.scheduleNumberText = scheduleNumberText;
    }

    public SearchMultiSelectField getSourceAcct() {
        return this.sourceAcct;
    }

    public void setSourceAcct(SearchMultiSelectField sourceAcct) {
        this.sourceAcct = sourceAcct;
    }

    public SearchMultiSelectField getSrcTranPostPeriod() {
        return this.srcTranPostPeriod;
    }

    public void setSrcTranPostPeriod(SearchMultiSelectField srcTranPostPeriod) {
        this.srcTranPostPeriod = srcTranPostPeriod;
    }

    public SearchMultiSelectField getSrcTranType() {
        return this.srcTranType;
    }

    public void setSrcTranType(SearchMultiSelectField srcTranType) {
        this.srcTranType = srcTranType;
    }

    public SearchLongField getStartOffset() {
        return this.startOffset;
    }

    public void setStartOffset(SearchLongField startOffset) {
        this.startOffset = startOffset;
    }

    public SearchStringField getTemplateName() {
        return this.templateName;
    }

    public void setTemplateName(SearchStringField templateName) {
        this.templateName = templateName;
    }

    public SearchBooleanField getUseForeignAmounts() {
        return this.useForeignAmounts;
    }

    public void setUseForeignAmounts(SearchBooleanField useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RevRecScheduleSearchBasic)) {
            return false;
        }
        RevRecScheduleSearchBasic other = (RevRecScheduleSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.amorStatus == null && other.getAmorStatus() == null || this.amorStatus != null && this.amorStatus.equals(other.getAmorStatus())) && (this.amortizedAmount == null && other.getAmortizedAmount() == null || this.amortizedAmount != null && this.amortizedAmount.equals(other.getAmortizedAmount())) && (this.amorType == null && other.getAmorType() == null || this.amorType != null && this.amorType.equals(other.getAmorType())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.deferredAmount == null && other.getDeferredAmount() == null || this.deferredAmount != null && this.deferredAmount.equals(other.getDeferredAmount())) && (this.destAcct == null && other.getDestAcct() == null || this.destAcct != null && this.destAcct.equals(other.getDestAcct())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.initialAmt == null && other.getInitialAmt() == null || this.initialAmt != null && this.initialAmt.equals(other.getInitialAmt())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isRecognized == null && other.getIsRecognized() == null || this.isRecognized != null && this.isRecognized.equals(other.getIsRecognized())) && (this.jeDoc == null && other.getJeDoc() == null || this.jeDoc != null && this.jeDoc.equals(other.getJeDoc())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.pctComplete == null && other.getPctComplete() == null || this.pctComplete != null && this.pctComplete.equals(other.getPctComplete())) && (this.pctRecognition == null && other.getPctRecognition() == null || this.pctRecognition != null && this.pctRecognition.equals(other.getPctRecognition())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && this.periodOffset.equals(other.getPeriodOffset())) && (this.postPeriod == null && other.getPostPeriod() == null || this.postPeriod != null && this.postPeriod.equals(other.getPostPeriod())) && (this.schedDate == null && other.getSchedDate() == null || this.schedDate != null && this.schedDate.equals(other.getSchedDate())) && (this.scheduleNumber == null && other.getScheduleNumber() == null || this.scheduleNumber != null && this.scheduleNumber.equals(other.getScheduleNumber())) && (this.scheduleNumberText == null && other.getScheduleNumberText() == null || this.scheduleNumberText != null && this.scheduleNumberText.equals(other.getScheduleNumberText())) && (this.sourceAcct == null && other.getSourceAcct() == null || this.sourceAcct != null && this.sourceAcct.equals(other.getSourceAcct())) && (this.srcTranPostPeriod == null && other.getSrcTranPostPeriod() == null || this.srcTranPostPeriod != null && this.srcTranPostPeriod.equals(other.getSrcTranPostPeriod())) && (this.srcTranType == null && other.getSrcTranType() == null || this.srcTranType != null && this.srcTranType.equals(other.getSrcTranType())) && (this.startOffset == null && other.getStartOffset() == null || this.startOffset != null && this.startOffset.equals(other.getStartOffset())) && (this.templateName == null && other.getTemplateName() == null || this.templateName != null && this.templateName.equals(other.getTemplateName())) && (this.useForeignAmounts == null && other.getUseForeignAmounts() == null || this.useForeignAmounts != null && this.useForeignAmounts.equals(other.getUseForeignAmounts()));
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
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getAmorStatus() != null) {
            _hashCode += this.getAmorStatus().hashCode();
        }
        if (this.getAmortizedAmount() != null) {
            _hashCode += this.getAmortizedAmount().hashCode();
        }
        if (this.getAmorType() != null) {
            _hashCode += this.getAmorType().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getDeferredAmount() != null) {
            _hashCode += this.getDeferredAmount().hashCode();
        }
        if (this.getDestAcct() != null) {
            _hashCode += this.getDestAcct().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInitialAmt() != null) {
            _hashCode += this.getInitialAmt().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsRecognized() != null) {
            _hashCode += this.getIsRecognized().hashCode();
        }
        if (this.getJeDoc() != null) {
            _hashCode += this.getJeDoc().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getPctComplete() != null) {
            _hashCode += this.getPctComplete().hashCode();
        }
        if (this.getPctRecognition() != null) {
            _hashCode += this.getPctRecognition().hashCode();
        }
        if (this.getPeriodOffset() != null) {
            _hashCode += this.getPeriodOffset().hashCode();
        }
        if (this.getPostPeriod() != null) {
            _hashCode += this.getPostPeriod().hashCode();
        }
        if (this.getSchedDate() != null) {
            _hashCode += this.getSchedDate().hashCode();
        }
        if (this.getScheduleNumber() != null) {
            _hashCode += this.getScheduleNumber().hashCode();
        }
        if (this.getScheduleNumberText() != null) {
            _hashCode += this.getScheduleNumberText().hashCode();
        }
        if (this.getSourceAcct() != null) {
            _hashCode += this.getSourceAcct().hashCode();
        }
        if (this.getSrcTranPostPeriod() != null) {
            _hashCode += this.getSrcTranPostPeriod().hashCode();
        }
        if (this.getSrcTranType() != null) {
            _hashCode += this.getSrcTranType().hashCode();
        }
        if (this.getStartOffset() != null) {
            _hashCode += this.getStartOffset().hashCode();
        }
        if (this.getTemplateName() != null) {
            _hashCode += this.getTemplateName().hashCode();
        }
        if (this.getUseForeignAmounts() != null) {
            _hashCode += this.getUseForeignAmounts().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amortizedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "destAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialAmt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRecognized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isRecognized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jeDoc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jeDoc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pctRecognition");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pctRecognition"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleNumberText");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleNumberText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("srcTranPostPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "srcTranPostPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("srcTranType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "srcTranType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("templateName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "templateName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

