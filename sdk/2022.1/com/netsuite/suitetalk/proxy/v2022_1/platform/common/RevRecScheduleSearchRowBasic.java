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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class RevRecScheduleSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] accountingBook;
    private SearchColumnEnumSelectField[] amorStatus;
    private SearchColumnStringField[] amorTemplate;
    private SearchColumnDoubleField[] amortizedAmount;
    private SearchColumnEnumSelectField[] amorType;
    private SearchColumnDoubleField[] amount;
    private SearchColumnStringField[] currency;
    private SearchColumnDoubleField[] deferredAmount;
    private SearchColumnStringField[] destAcct;
    private SearchColumnSelectField[] externalId;
    private SearchColumnDoubleField[] initialAmt;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isRecognized;
    private SearchColumnStringField[] jeDoc;
    private SearchColumnLongField[] lineSequenceNumber;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] nameUrl;
    private SearchColumnDoubleField[] pctComplete;
    private SearchColumnDoubleField[] pctRecognition;
    private SearchColumnLongField[] periodOffset;
    private SearchColumnDoubleField[] recurAmount;
    private SearchColumnDoubleField[] recurFxAmount;
    private SearchColumnDateField[] schedDate;
    private SearchColumnStringField[] scheduleNumber;
    private SearchColumnStringField[] sourceAcct;
    private SearchColumnStringField[] srcDocLine;
    private SearchColumnStringField[] srcTran;
    private SearchColumnStringField[] srcTranPostPeriod;
    private SearchColumnLongField[] startOffset;
    private SearchColumnBooleanField[] useForeignAmounts;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecScheduleSearchRowBasic.class, true);

    public RevRecScheduleSearchRowBasic() {
    }

    public RevRecScheduleSearchRowBasic(SearchColumnSelectField[] accountingBook, SearchColumnEnumSelectField[] amorStatus, SearchColumnStringField[] amorTemplate, SearchColumnDoubleField[] amortizedAmount, SearchColumnEnumSelectField[] amorType, SearchColumnDoubleField[] amount, SearchColumnStringField[] currency, SearchColumnDoubleField[] deferredAmount, SearchColumnStringField[] destAcct, SearchColumnSelectField[] externalId, SearchColumnDoubleField[] initialAmt, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isRecognized, SearchColumnStringField[] jeDoc, SearchColumnLongField[] lineSequenceNumber, SearchColumnStringField[] name, SearchColumnStringField[] nameUrl, SearchColumnDoubleField[] pctComplete, SearchColumnDoubleField[] pctRecognition, SearchColumnLongField[] periodOffset, SearchColumnDoubleField[] recurAmount, SearchColumnDoubleField[] recurFxAmount, SearchColumnDateField[] schedDate, SearchColumnStringField[] scheduleNumber, SearchColumnStringField[] sourceAcct, SearchColumnStringField[] srcDocLine, SearchColumnStringField[] srcTran, SearchColumnStringField[] srcTranPostPeriod, SearchColumnLongField[] startOffset, SearchColumnBooleanField[] useForeignAmounts) {
        this.accountingBook = accountingBook;
        this.amorStatus = amorStatus;
        this.amorTemplate = amorTemplate;
        this.amortizedAmount = amortizedAmount;
        this.amorType = amorType;
        this.amount = amount;
        this.currency = currency;
        this.deferredAmount = deferredAmount;
        this.destAcct = destAcct;
        this.externalId = externalId;
        this.initialAmt = initialAmt;
        this.internalId = internalId;
        this.isRecognized = isRecognized;
        this.jeDoc = jeDoc;
        this.lineSequenceNumber = lineSequenceNumber;
        this.name = name;
        this.nameUrl = nameUrl;
        this.pctComplete = pctComplete;
        this.pctRecognition = pctRecognition;
        this.periodOffset = periodOffset;
        this.recurAmount = recurAmount;
        this.recurFxAmount = recurFxAmount;
        this.schedDate = schedDate;
        this.scheduleNumber = scheduleNumber;
        this.sourceAcct = sourceAcct;
        this.srcDocLine = srcDocLine;
        this.srcTran = srcTran;
        this.srcTranPostPeriod = srcTranPostPeriod;
        this.startOffset = startOffset;
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchColumnSelectField[] getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchColumnSelectField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchColumnSelectField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, SearchColumnSelectField _value) {
        this.accountingBook[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAmorStatus() {
        return this.amorStatus;
    }

    public void setAmorStatus(SearchColumnEnumSelectField[] amorStatus) {
        this.amorStatus = amorStatus;
    }

    public SearchColumnEnumSelectField getAmorStatus(int i) {
        return this.amorStatus[i];
    }

    public void setAmorStatus(int i, SearchColumnEnumSelectField _value) {
        this.amorStatus[i] = _value;
    }

    public SearchColumnStringField[] getAmorTemplate() {
        return this.amorTemplate;
    }

    public void setAmorTemplate(SearchColumnStringField[] amorTemplate) {
        this.amorTemplate = amorTemplate;
    }

    public SearchColumnStringField getAmorTemplate(int i) {
        return this.amorTemplate[i];
    }

    public void setAmorTemplate(int i, SearchColumnStringField _value) {
        this.amorTemplate[i] = _value;
    }

    public SearchColumnDoubleField[] getAmortizedAmount() {
        return this.amortizedAmount;
    }

    public void setAmortizedAmount(SearchColumnDoubleField[] amortizedAmount) {
        this.amortizedAmount = amortizedAmount;
    }

    public SearchColumnDoubleField getAmortizedAmount(int i) {
        return this.amortizedAmount[i];
    }

    public void setAmortizedAmount(int i, SearchColumnDoubleField _value) {
        this.amortizedAmount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAmorType() {
        return this.amorType;
    }

    public void setAmorType(SearchColumnEnumSelectField[] amorType) {
        this.amorType = amorType;
    }

    public SearchColumnEnumSelectField getAmorType(int i) {
        return this.amorType[i];
    }

    public void setAmorType(int i, SearchColumnEnumSelectField _value) {
        this.amorType[i] = _value;
    }

    public SearchColumnDoubleField[] getAmount() {
        return this.amount;
    }

    public void setAmount(SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }

    public SearchColumnStringField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnStringField[] currency) {
        this.currency = currency;
    }

    public SearchColumnStringField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnStringField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnDoubleField[] getDeferredAmount() {
        return this.deferredAmount;
    }

    public void setDeferredAmount(SearchColumnDoubleField[] deferredAmount) {
        this.deferredAmount = deferredAmount;
    }

    public SearchColumnDoubleField getDeferredAmount(int i) {
        return this.deferredAmount[i];
    }

    public void setDeferredAmount(int i, SearchColumnDoubleField _value) {
        this.deferredAmount[i] = _value;
    }

    public SearchColumnStringField[] getDestAcct() {
        return this.destAcct;
    }

    public void setDestAcct(SearchColumnStringField[] destAcct) {
        this.destAcct = destAcct;
    }

    public SearchColumnStringField getDestAcct(int i) {
        return this.destAcct[i];
    }

    public void setDestAcct(int i, SearchColumnStringField _value) {
        this.destAcct[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnDoubleField[] getInitialAmt() {
        return this.initialAmt;
    }

    public void setInitialAmt(SearchColumnDoubleField[] initialAmt) {
        this.initialAmt = initialAmt;
    }

    public SearchColumnDoubleField getInitialAmt(int i) {
        return this.initialAmt[i];
    }

    public void setInitialAmt(int i, SearchColumnDoubleField _value) {
        this.initialAmt[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsRecognized() {
        return this.isRecognized;
    }

    public void setIsRecognized(SearchColumnBooleanField[] isRecognized) {
        this.isRecognized = isRecognized;
    }

    public SearchColumnBooleanField getIsRecognized(int i) {
        return this.isRecognized[i];
    }

    public void setIsRecognized(int i, SearchColumnBooleanField _value) {
        this.isRecognized[i] = _value;
    }

    public SearchColumnStringField[] getJeDoc() {
        return this.jeDoc;
    }

    public void setJeDoc(SearchColumnStringField[] jeDoc) {
        this.jeDoc = jeDoc;
    }

    public SearchColumnStringField getJeDoc(int i) {
        return this.jeDoc[i];
    }

    public void setJeDoc(int i, SearchColumnStringField _value) {
        this.jeDoc[i] = _value;
    }

    public SearchColumnLongField[] getLineSequenceNumber() {
        return this.lineSequenceNumber;
    }

    public void setLineSequenceNumber(SearchColumnLongField[] lineSequenceNumber) {
        this.lineSequenceNumber = lineSequenceNumber;
    }

    public SearchColumnLongField getLineSequenceNumber(int i) {
        return this.lineSequenceNumber[i];
    }

    public void setLineSequenceNumber(int i, SearchColumnLongField _value) {
        this.lineSequenceNumber[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnStringField[] getNameUrl() {
        return this.nameUrl;
    }

    public void setNameUrl(SearchColumnStringField[] nameUrl) {
        this.nameUrl = nameUrl;
    }

    public SearchColumnStringField getNameUrl(int i) {
        return this.nameUrl[i];
    }

    public void setNameUrl(int i, SearchColumnStringField _value) {
        this.nameUrl[i] = _value;
    }

    public SearchColumnDoubleField[] getPctComplete() {
        return this.pctComplete;
    }

    public void setPctComplete(SearchColumnDoubleField[] pctComplete) {
        this.pctComplete = pctComplete;
    }

    public SearchColumnDoubleField getPctComplete(int i) {
        return this.pctComplete[i];
    }

    public void setPctComplete(int i, SearchColumnDoubleField _value) {
        this.pctComplete[i] = _value;
    }

    public SearchColumnDoubleField[] getPctRecognition() {
        return this.pctRecognition;
    }

    public void setPctRecognition(SearchColumnDoubleField[] pctRecognition) {
        this.pctRecognition = pctRecognition;
    }

    public SearchColumnDoubleField getPctRecognition(int i) {
        return this.pctRecognition[i];
    }

    public void setPctRecognition(int i, SearchColumnDoubleField _value) {
        this.pctRecognition[i] = _value;
    }

    public SearchColumnLongField[] getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(SearchColumnLongField[] periodOffset) {
        this.periodOffset = periodOffset;
    }

    public SearchColumnLongField getPeriodOffset(int i) {
        return this.periodOffset[i];
    }

    public void setPeriodOffset(int i, SearchColumnLongField _value) {
        this.periodOffset[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurAmount() {
        return this.recurAmount;
    }

    public void setRecurAmount(SearchColumnDoubleField[] recurAmount) {
        this.recurAmount = recurAmount;
    }

    public SearchColumnDoubleField getRecurAmount(int i) {
        return this.recurAmount[i];
    }

    public void setRecurAmount(int i, SearchColumnDoubleField _value) {
        this.recurAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurFxAmount() {
        return this.recurFxAmount;
    }

    public void setRecurFxAmount(SearchColumnDoubleField[] recurFxAmount) {
        this.recurFxAmount = recurFxAmount;
    }

    public SearchColumnDoubleField getRecurFxAmount(int i) {
        return this.recurFxAmount[i];
    }

    public void setRecurFxAmount(int i, SearchColumnDoubleField _value) {
        this.recurFxAmount[i] = _value;
    }

    public SearchColumnDateField[] getSchedDate() {
        return this.schedDate;
    }

    public void setSchedDate(SearchColumnDateField[] schedDate) {
        this.schedDate = schedDate;
    }

    public SearchColumnDateField getSchedDate(int i) {
        return this.schedDate[i];
    }

    public void setSchedDate(int i, SearchColumnDateField _value) {
        this.schedDate[i] = _value;
    }

    public SearchColumnStringField[] getScheduleNumber() {
        return this.scheduleNumber;
    }

    public void setScheduleNumber(SearchColumnStringField[] scheduleNumber) {
        this.scheduleNumber = scheduleNumber;
    }

    public SearchColumnStringField getScheduleNumber(int i) {
        return this.scheduleNumber[i];
    }

    public void setScheduleNumber(int i, SearchColumnStringField _value) {
        this.scheduleNumber[i] = _value;
    }

    public SearchColumnStringField[] getSourceAcct() {
        return this.sourceAcct;
    }

    public void setSourceAcct(SearchColumnStringField[] sourceAcct) {
        this.sourceAcct = sourceAcct;
    }

    public SearchColumnStringField getSourceAcct(int i) {
        return this.sourceAcct[i];
    }

    public void setSourceAcct(int i, SearchColumnStringField _value) {
        this.sourceAcct[i] = _value;
    }

    public SearchColumnStringField[] getSrcDocLine() {
        return this.srcDocLine;
    }

    public void setSrcDocLine(SearchColumnStringField[] srcDocLine) {
        this.srcDocLine = srcDocLine;
    }

    public SearchColumnStringField getSrcDocLine(int i) {
        return this.srcDocLine[i];
    }

    public void setSrcDocLine(int i, SearchColumnStringField _value) {
        this.srcDocLine[i] = _value;
    }

    public SearchColumnStringField[] getSrcTran() {
        return this.srcTran;
    }

    public void setSrcTran(SearchColumnStringField[] srcTran) {
        this.srcTran = srcTran;
    }

    public SearchColumnStringField getSrcTran(int i) {
        return this.srcTran[i];
    }

    public void setSrcTran(int i, SearchColumnStringField _value) {
        this.srcTran[i] = _value;
    }

    public SearchColumnStringField[] getSrcTranPostPeriod() {
        return this.srcTranPostPeriod;
    }

    public void setSrcTranPostPeriod(SearchColumnStringField[] srcTranPostPeriod) {
        this.srcTranPostPeriod = srcTranPostPeriod;
    }

    public SearchColumnStringField getSrcTranPostPeriod(int i) {
        return this.srcTranPostPeriod[i];
    }

    public void setSrcTranPostPeriod(int i, SearchColumnStringField _value) {
        this.srcTranPostPeriod[i] = _value;
    }

    public SearchColumnLongField[] getStartOffset() {
        return this.startOffset;
    }

    public void setStartOffset(SearchColumnLongField[] startOffset) {
        this.startOffset = startOffset;
    }

    public SearchColumnLongField getStartOffset(int i) {
        return this.startOffset[i];
    }

    public void setStartOffset(int i, SearchColumnLongField _value) {
        this.startOffset[i] = _value;
    }

    public SearchColumnBooleanField[] getUseForeignAmounts() {
        return this.useForeignAmounts;
    }

    public void setUseForeignAmounts(SearchColumnBooleanField[] useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchColumnBooleanField getUseForeignAmounts(int i) {
        return this.useForeignAmounts[i];
    }

    public void setUseForeignAmounts(int i, SearchColumnBooleanField _value) {
        this.useForeignAmounts[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RevRecScheduleSearchRowBasic)) {
            return false;
        }
        RevRecScheduleSearchRowBasic other = (RevRecScheduleSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.amorStatus == null && other.getAmorStatus() == null || this.amorStatus != null && Arrays.equals(this.amorStatus, other.getAmorStatus())) && (this.amorTemplate == null && other.getAmorTemplate() == null || this.amorTemplate != null && Arrays.equals(this.amorTemplate, other.getAmorTemplate())) && (this.amortizedAmount == null && other.getAmortizedAmount() == null || this.amortizedAmount != null && Arrays.equals(this.amortizedAmount, other.getAmortizedAmount())) && (this.amorType == null && other.getAmorType() == null || this.amorType != null && Arrays.equals(this.amorType, other.getAmorType())) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.deferredAmount == null && other.getDeferredAmount() == null || this.deferredAmount != null && Arrays.equals(this.deferredAmount, other.getDeferredAmount())) && (this.destAcct == null && other.getDestAcct() == null || this.destAcct != null && Arrays.equals(this.destAcct, other.getDestAcct())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.initialAmt == null && other.getInitialAmt() == null || this.initialAmt != null && Arrays.equals(this.initialAmt, other.getInitialAmt())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isRecognized == null && other.getIsRecognized() == null || this.isRecognized != null && Arrays.equals(this.isRecognized, other.getIsRecognized())) && (this.jeDoc == null && other.getJeDoc() == null || this.jeDoc != null && Arrays.equals(this.jeDoc, other.getJeDoc())) && (this.lineSequenceNumber == null && other.getLineSequenceNumber() == null || this.lineSequenceNumber != null && Arrays.equals(this.lineSequenceNumber, other.getLineSequenceNumber())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.nameUrl == null && other.getNameUrl() == null || this.nameUrl != null && Arrays.equals(this.nameUrl, other.getNameUrl())) && (this.pctComplete == null && other.getPctComplete() == null || this.pctComplete != null && Arrays.equals(this.pctComplete, other.getPctComplete())) && (this.pctRecognition == null && other.getPctRecognition() == null || this.pctRecognition != null && Arrays.equals(this.pctRecognition, other.getPctRecognition())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && Arrays.equals(this.periodOffset, other.getPeriodOffset())) && (this.recurAmount == null && other.getRecurAmount() == null || this.recurAmount != null && Arrays.equals(this.recurAmount, other.getRecurAmount())) && (this.recurFxAmount == null && other.getRecurFxAmount() == null || this.recurFxAmount != null && Arrays.equals(this.recurFxAmount, other.getRecurFxAmount())) && (this.schedDate == null && other.getSchedDate() == null || this.schedDate != null && Arrays.equals(this.schedDate, other.getSchedDate())) && (this.scheduleNumber == null && other.getScheduleNumber() == null || this.scheduleNumber != null && Arrays.equals(this.scheduleNumber, other.getScheduleNumber())) && (this.sourceAcct == null && other.getSourceAcct() == null || this.sourceAcct != null && Arrays.equals(this.sourceAcct, other.getSourceAcct())) && (this.srcDocLine == null && other.getSrcDocLine() == null || this.srcDocLine != null && Arrays.equals(this.srcDocLine, other.getSrcDocLine())) && (this.srcTran == null && other.getSrcTran() == null || this.srcTran != null && Arrays.equals(this.srcTran, other.getSrcTran())) && (this.srcTranPostPeriod == null && other.getSrcTranPostPeriod() == null || this.srcTranPostPeriod != null && Arrays.equals(this.srcTranPostPeriod, other.getSrcTranPostPeriod())) && (this.startOffset == null && other.getStartOffset() == null || this.startOffset != null && Arrays.equals(this.startOffset, other.getStartOffset())) && (this.useForeignAmounts == null && other.getUseForeignAmounts() == null || this.useForeignAmounts != null && Arrays.equals(this.useForeignAmounts, other.getUseForeignAmounts()));
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
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorStatus() != null) {
            for (i = 0; i < Array.getLength(this.getAmorStatus()); ++i) {
                obj = Array.get(this.getAmorStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getAmorTemplate()); ++i) {
                obj = Array.get(this.getAmorTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmortizedAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmortizedAmount()); ++i) {
                obj = Array.get(this.getAmortizedAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorType() != null) {
            for (i = 0; i < Array.getLength(this.getAmorType()); ++i) {
                obj = Array.get(this.getAmorType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferredAmount() != null) {
            for (i = 0; i < Array.getLength(this.getDeferredAmount()); ++i) {
                obj = Array.get(this.getDeferredAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDestAcct() != null) {
            for (i = 0; i < Array.getLength(this.getDestAcct()); ++i) {
                obj = Array.get(this.getDestAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInitialAmt() != null) {
            for (i = 0; i < Array.getLength(this.getInitialAmt()); ++i) {
                obj = Array.get(this.getInitialAmt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsRecognized() != null) {
            for (i = 0; i < Array.getLength(this.getIsRecognized()); ++i) {
                obj = Array.get(this.getIsRecognized(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJeDoc() != null) {
            for (i = 0; i < Array.getLength(this.getJeDoc()); ++i) {
                obj = Array.get(this.getJeDoc(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLineSequenceNumber() != null) {
            for (i = 0; i < Array.getLength(this.getLineSequenceNumber()); ++i) {
                obj = Array.get(this.getLineSequenceNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNameUrl() != null) {
            for (i = 0; i < Array.getLength(this.getNameUrl()); ++i) {
                obj = Array.get(this.getNameUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPctComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPctComplete()); ++i) {
                obj = Array.get(this.getPctComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPctRecognition() != null) {
            for (i = 0; i < Array.getLength(this.getPctRecognition()); ++i) {
                obj = Array.get(this.getPctRecognition(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodOffset() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodOffset()); ++i) {
                obj = Array.get(this.getPeriodOffset(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurAmount() != null) {
            for (i = 0; i < Array.getLength(this.getRecurAmount()); ++i) {
                obj = Array.get(this.getRecurAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurFxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getRecurFxAmount()); ++i) {
                obj = Array.get(this.getRecurFxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSchedDate() != null) {
            for (i = 0; i < Array.getLength(this.getSchedDate()); ++i) {
                obj = Array.get(this.getSchedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduleNumber() != null) {
            for (i = 0; i < Array.getLength(this.getScheduleNumber()); ++i) {
                obj = Array.get(this.getScheduleNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSourceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getSourceAcct()); ++i) {
                obj = Array.get(this.getSourceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSrcDocLine() != null) {
            for (i = 0; i < Array.getLength(this.getSrcDocLine()); ++i) {
                obj = Array.get(this.getSrcDocLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSrcTran() != null) {
            for (i = 0; i < Array.getLength(this.getSrcTran()); ++i) {
                obj = Array.get(this.getSrcTran(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSrcTranPostPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getSrcTranPostPeriod()); ++i) {
                obj = Array.get(this.getSrcTranPostPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartOffset() != null) {
            for (i = 0; i < Array.getLength(this.getStartOffset()); ++i) {
                obj = Array.get(this.getStartOffset(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseForeignAmounts() != null) {
            for (i = 0; i < Array.getLength(this.getUseForeignAmounts()); ++i) {
                obj = Array.get(this.getUseForeignAmounts(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amortizedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "destAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialAmt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRecognized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isRecognized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jeDoc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jeDoc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineSequenceNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineSequenceNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nameUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pctRecognition");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pctRecognition"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurFxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurFxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("srcDocLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "srcDocLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("srcTran");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "srcTran"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("srcTranPostPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "srcTranPostPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

