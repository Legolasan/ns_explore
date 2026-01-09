/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.BillingScheduleMilestoneList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.BillingScheduleRecurrenceList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleFrequency;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleMonthDow;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleMonthDowim;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleRecurrenceMode;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleRecurrencePattern;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleRepeatEvery;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleYearDow;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleYearDowim;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleYearDowimMonth;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleYearMonth;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RecurrenceDowMaskList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class BillingSchedule
extends Record
implements Serializable {
    private BillingScheduleType scheduleType;
    private String name;
    private BillingScheduleRecurrencePattern recurrencePattern;
    private RecordRef project;
    private String initialAmount;
    private RecordRef initialTerms;
    private BillingScheduleFrequency frequency;
    private RecurrenceDowMaskList recurrenceDowMaskList;
    private BillingScheduleRecurrenceMode yearMode;
    private BillingScheduleYearDowim yearDowim;
    private BillingScheduleYearDow yearDow;
    private BillingScheduleYearDowimMonth yearDowimMonth;
    private BillingScheduleYearMonth yearMonth;
    private Long yearDom;
    private BillingScheduleRecurrenceMode monthMode;
    private BillingScheduleMonthDowim monthDowim;
    private BillingScheduleMonthDow monthDow;
    private Long monthDom;
    private Long dayPeriod;
    private BillingScheduleRepeatEvery repeatEvery;
    private Boolean billForActuals;
    private Long numberRemaining;
    private Boolean inArrears;
    private RecordRef recurrenceTerms;
    private Boolean isPublic;
    private Boolean applyToSubtotal;
    private RecordRef transaction;
    private Boolean isInactive;
    private Calendar seriesStartDate;
    private BillingScheduleRecurrenceList recurrenceList;
    private BillingScheduleMilestoneList milestoneList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingSchedule.class, true);

    public BillingSchedule() {
    }

    public BillingSchedule(NullField nullFieldList, String internalId, String externalId, BillingScheduleType scheduleType, String name, BillingScheduleRecurrencePattern recurrencePattern, RecordRef project, String initialAmount, RecordRef initialTerms, BillingScheduleFrequency frequency, RecurrenceDowMaskList recurrenceDowMaskList, BillingScheduleRecurrenceMode yearMode, BillingScheduleYearDowim yearDowim, BillingScheduleYearDow yearDow, BillingScheduleYearDowimMonth yearDowimMonth, BillingScheduleYearMonth yearMonth, Long yearDom, BillingScheduleRecurrenceMode monthMode, BillingScheduleMonthDowim monthDowim, BillingScheduleMonthDow monthDow, Long monthDom, Long dayPeriod, BillingScheduleRepeatEvery repeatEvery, Boolean billForActuals, Long numberRemaining, Boolean inArrears, RecordRef recurrenceTerms, Boolean isPublic, Boolean applyToSubtotal, RecordRef transaction, Boolean isInactive, Calendar seriesStartDate, BillingScheduleRecurrenceList recurrenceList, BillingScheduleMilestoneList milestoneList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.scheduleType = scheduleType;
        this.name = name;
        this.recurrencePattern = recurrencePattern;
        this.project = project;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.frequency = frequency;
        this.recurrenceDowMaskList = recurrenceDowMaskList;
        this.yearMode = yearMode;
        this.yearDowim = yearDowim;
        this.yearDow = yearDow;
        this.yearDowimMonth = yearDowimMonth;
        this.yearMonth = yearMonth;
        this.yearDom = yearDom;
        this.monthMode = monthMode;
        this.monthDowim = monthDowim;
        this.monthDow = monthDow;
        this.monthDom = monthDom;
        this.dayPeriod = dayPeriod;
        this.repeatEvery = repeatEvery;
        this.billForActuals = billForActuals;
        this.numberRemaining = numberRemaining;
        this.inArrears = inArrears;
        this.recurrenceTerms = recurrenceTerms;
        this.isPublic = isPublic;
        this.applyToSubtotal = applyToSubtotal;
        this.transaction = transaction;
        this.isInactive = isInactive;
        this.seriesStartDate = seriesStartDate;
        this.recurrenceList = recurrenceList;
        this.milestoneList = milestoneList;
    }

    public BillingScheduleType getScheduleType() {
        return this.scheduleType;
    }

    public void setScheduleType(BillingScheduleType scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BillingScheduleRecurrencePattern getRecurrencePattern() {
        return this.recurrencePattern;
    }

    public void setRecurrencePattern(BillingScheduleRecurrencePattern recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public RecordRef getProject() {
        return this.project;
    }

    public void setProject(RecordRef project) {
        this.project = project;
    }

    public String getInitialAmount() {
        return this.initialAmount;
    }

    public void setInitialAmount(String initialAmount) {
        this.initialAmount = initialAmount;
    }

    public RecordRef getInitialTerms() {
        return this.initialTerms;
    }

    public void setInitialTerms(RecordRef initialTerms) {
        this.initialTerms = initialTerms;
    }

    public BillingScheduleFrequency getFrequency() {
        return this.frequency;
    }

    public void setFrequency(BillingScheduleFrequency frequency) {
        this.frequency = frequency;
    }

    public RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return this.recurrenceDowMaskList;
    }

    public void setRecurrenceDowMaskList(RecurrenceDowMaskList recurrenceDowMaskList) {
        this.recurrenceDowMaskList = recurrenceDowMaskList;
    }

    public BillingScheduleRecurrenceMode getYearMode() {
        return this.yearMode;
    }

    public void setYearMode(BillingScheduleRecurrenceMode yearMode) {
        this.yearMode = yearMode;
    }

    public BillingScheduleYearDowim getYearDowim() {
        return this.yearDowim;
    }

    public void setYearDowim(BillingScheduleYearDowim yearDowim) {
        this.yearDowim = yearDowim;
    }

    public BillingScheduleYearDow getYearDow() {
        return this.yearDow;
    }

    public void setYearDow(BillingScheduleYearDow yearDow) {
        this.yearDow = yearDow;
    }

    public BillingScheduleYearDowimMonth getYearDowimMonth() {
        return this.yearDowimMonth;
    }

    public void setYearDowimMonth(BillingScheduleYearDowimMonth yearDowimMonth) {
        this.yearDowimMonth = yearDowimMonth;
    }

    public BillingScheduleYearMonth getYearMonth() {
        return this.yearMonth;
    }

    public void setYearMonth(BillingScheduleYearMonth yearMonth) {
        this.yearMonth = yearMonth;
    }

    public Long getYearDom() {
        return this.yearDom;
    }

    public void setYearDom(Long yearDom) {
        this.yearDom = yearDom;
    }

    public BillingScheduleRecurrenceMode getMonthMode() {
        return this.monthMode;
    }

    public void setMonthMode(BillingScheduleRecurrenceMode monthMode) {
        this.monthMode = monthMode;
    }

    public BillingScheduleMonthDowim getMonthDowim() {
        return this.monthDowim;
    }

    public void setMonthDowim(BillingScheduleMonthDowim monthDowim) {
        this.monthDowim = monthDowim;
    }

    public BillingScheduleMonthDow getMonthDow() {
        return this.monthDow;
    }

    public void setMonthDow(BillingScheduleMonthDow monthDow) {
        this.monthDow = monthDow;
    }

    public Long getMonthDom() {
        return this.monthDom;
    }

    public void setMonthDom(Long monthDom) {
        this.monthDom = monthDom;
    }

    public Long getDayPeriod() {
        return this.dayPeriod;
    }

    public void setDayPeriod(Long dayPeriod) {
        this.dayPeriod = dayPeriod;
    }

    public BillingScheduleRepeatEvery getRepeatEvery() {
        return this.repeatEvery;
    }

    public void setRepeatEvery(BillingScheduleRepeatEvery repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public Boolean getBillForActuals() {
        return this.billForActuals;
    }

    public void setBillForActuals(Boolean billForActuals) {
        this.billForActuals = billForActuals;
    }

    public Long getNumberRemaining() {
        return this.numberRemaining;
    }

    public void setNumberRemaining(Long numberRemaining) {
        this.numberRemaining = numberRemaining;
    }

    public Boolean getInArrears() {
        return this.inArrears;
    }

    public void setInArrears(Boolean inArrears) {
        this.inArrears = inArrears;
    }

    public RecordRef getRecurrenceTerms() {
        return this.recurrenceTerms;
    }

    public void setRecurrenceTerms(RecordRef recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getApplyToSubtotal() {
        return this.applyToSubtotal;
    }

    public void setApplyToSubtotal(Boolean applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Calendar getSeriesStartDate() {
        return this.seriesStartDate;
    }

    public void setSeriesStartDate(Calendar seriesStartDate) {
        this.seriesStartDate = seriesStartDate;
    }

    public BillingScheduleRecurrenceList getRecurrenceList() {
        return this.recurrenceList;
    }

    public void setRecurrenceList(BillingScheduleRecurrenceList recurrenceList) {
        this.recurrenceList = recurrenceList;
    }

    public BillingScheduleMilestoneList getMilestoneList() {
        return this.milestoneList;
    }

    public void setMilestoneList(BillingScheduleMilestoneList milestoneList) {
        this.milestoneList = milestoneList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingSchedule)) {
            return false;
        }
        BillingSchedule other = (BillingSchedule)obj;
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
        boolean _equals = super.equals(obj) && (this.scheduleType == null && other.getScheduleType() == null || this.scheduleType != null && this.scheduleType.equals(other.getScheduleType())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.recurrencePattern == null && other.getRecurrencePattern() == null || this.recurrencePattern != null && this.recurrencePattern.equals(other.getRecurrencePattern())) && (this.project == null && other.getProject() == null || this.project != null && this.project.equals(other.getProject())) && (this.initialAmount == null && other.getInitialAmount() == null || this.initialAmount != null && this.initialAmount.equals(other.getInitialAmount())) && (this.initialTerms == null && other.getInitialTerms() == null || this.initialTerms != null && this.initialTerms.equals(other.getInitialTerms())) && (this.frequency == null && other.getFrequency() == null || this.frequency != null && this.frequency.equals(other.getFrequency())) && (this.recurrenceDowMaskList == null && other.getRecurrenceDowMaskList() == null || this.recurrenceDowMaskList != null && this.recurrenceDowMaskList.equals(other.getRecurrenceDowMaskList())) && (this.yearMode == null && other.getYearMode() == null || this.yearMode != null && this.yearMode.equals(other.getYearMode())) && (this.yearDowim == null && other.getYearDowim() == null || this.yearDowim != null && this.yearDowim.equals(other.getYearDowim())) && (this.yearDow == null && other.getYearDow() == null || this.yearDow != null && this.yearDow.equals(other.getYearDow())) && (this.yearDowimMonth == null && other.getYearDowimMonth() == null || this.yearDowimMonth != null && this.yearDowimMonth.equals(other.getYearDowimMonth())) && (this.yearMonth == null && other.getYearMonth() == null || this.yearMonth != null && this.yearMonth.equals(other.getYearMonth())) && (this.yearDom == null && other.getYearDom() == null || this.yearDom != null && this.yearDom.equals(other.getYearDom())) && (this.monthMode == null && other.getMonthMode() == null || this.monthMode != null && this.monthMode.equals(other.getMonthMode())) && (this.monthDowim == null && other.getMonthDowim() == null || this.monthDowim != null && this.monthDowim.equals(other.getMonthDowim())) && (this.monthDow == null && other.getMonthDow() == null || this.monthDow != null && this.monthDow.equals(other.getMonthDow())) && (this.monthDom == null && other.getMonthDom() == null || this.monthDom != null && this.monthDom.equals(other.getMonthDom())) && (this.dayPeriod == null && other.getDayPeriod() == null || this.dayPeriod != null && this.dayPeriod.equals(other.getDayPeriod())) && (this.repeatEvery == null && other.getRepeatEvery() == null || this.repeatEvery != null && this.repeatEvery.equals(other.getRepeatEvery())) && (this.billForActuals == null && other.getBillForActuals() == null || this.billForActuals != null && this.billForActuals.equals(other.getBillForActuals())) && (this.numberRemaining == null && other.getNumberRemaining() == null || this.numberRemaining != null && this.numberRemaining.equals(other.getNumberRemaining())) && (this.inArrears == null && other.getInArrears() == null || this.inArrears != null && this.inArrears.equals(other.getInArrears())) && (this.recurrenceTerms == null && other.getRecurrenceTerms() == null || this.recurrenceTerms != null && this.recurrenceTerms.equals(other.getRecurrenceTerms())) && (this.isPublic == null && other.getIsPublic() == null || this.isPublic != null && this.isPublic.equals(other.getIsPublic())) && (this.applyToSubtotal == null && other.getApplyToSubtotal() == null || this.applyToSubtotal != null && this.applyToSubtotal.equals(other.getApplyToSubtotal())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.seriesStartDate == null && other.getSeriesStartDate() == null || this.seriesStartDate != null && this.seriesStartDate.equals(other.getSeriesStartDate())) && (this.recurrenceList == null && other.getRecurrenceList() == null || this.recurrenceList != null && this.recurrenceList.equals(other.getRecurrenceList())) && (this.milestoneList == null && other.getMilestoneList() == null || this.milestoneList != null && this.milestoneList.equals(other.getMilestoneList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getScheduleType() != null) {
            _hashCode += this.getScheduleType().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getRecurrencePattern() != null) {
            _hashCode += this.getRecurrencePattern().hashCode();
        }
        if (this.getProject() != null) {
            _hashCode += this.getProject().hashCode();
        }
        if (this.getInitialAmount() != null) {
            _hashCode += this.getInitialAmount().hashCode();
        }
        if (this.getInitialTerms() != null) {
            _hashCode += this.getInitialTerms().hashCode();
        }
        if (this.getFrequency() != null) {
            _hashCode += this.getFrequency().hashCode();
        }
        if (this.getRecurrenceDowMaskList() != null) {
            _hashCode += this.getRecurrenceDowMaskList().hashCode();
        }
        if (this.getYearMode() != null) {
            _hashCode += this.getYearMode().hashCode();
        }
        if (this.getYearDowim() != null) {
            _hashCode += this.getYearDowim().hashCode();
        }
        if (this.getYearDow() != null) {
            _hashCode += this.getYearDow().hashCode();
        }
        if (this.getYearDowimMonth() != null) {
            _hashCode += this.getYearDowimMonth().hashCode();
        }
        if (this.getYearMonth() != null) {
            _hashCode += this.getYearMonth().hashCode();
        }
        if (this.getYearDom() != null) {
            _hashCode += this.getYearDom().hashCode();
        }
        if (this.getMonthMode() != null) {
            _hashCode += this.getMonthMode().hashCode();
        }
        if (this.getMonthDowim() != null) {
            _hashCode += this.getMonthDowim().hashCode();
        }
        if (this.getMonthDow() != null) {
            _hashCode += this.getMonthDow().hashCode();
        }
        if (this.getMonthDom() != null) {
            _hashCode += this.getMonthDom().hashCode();
        }
        if (this.getDayPeriod() != null) {
            _hashCode += this.getDayPeriod().hashCode();
        }
        if (this.getRepeatEvery() != null) {
            _hashCode += this.getRepeatEvery().hashCode();
        }
        if (this.getBillForActuals() != null) {
            _hashCode += this.getBillForActuals().hashCode();
        }
        if (this.getNumberRemaining() != null) {
            _hashCode += this.getNumberRemaining().hashCode();
        }
        if (this.getInArrears() != null) {
            _hashCode += this.getInArrears().hashCode();
        }
        if (this.getRecurrenceTerms() != null) {
            _hashCode += this.getRecurrenceTerms().hashCode();
        }
        if (this.getIsPublic() != null) {
            _hashCode += this.getIsPublic().hashCode();
        }
        if (this.getApplyToSubtotal() != null) {
            _hashCode += this.getApplyToSubtotal().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getSeriesStartDate() != null) {
            _hashCode += this.getSeriesStartDate().hashCode();
        }
        if (this.getRecurrenceList() != null) {
            _hashCode += this.getRecurrenceList().hashCode();
        }
        if (this.getMilestoneList() != null) {
            _hashCode += this.getMilestoneList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BillingSchedule"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("scheduleType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "scheduleType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrencePattern"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "project"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDowMaskList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceDowMaskList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearMode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearMode"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearDowim");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearDowim"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearDow");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearDow"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearDowimMonth");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearDowimMonth"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearDowimMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearMonth");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearMonth"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearMonth"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yearDom");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "yearDom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthMode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "monthMode"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthDowim");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "monthDowim"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleMonthDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthDow");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "monthDow"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleMonthDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthDom");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "monthDom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dayPeriod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "dayPeriod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRepeatEvery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billForActuals");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billForActuals"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberRemaining");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "numberRemaining"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "applyToSubtotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seriesStartDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "seriesStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleMilestoneList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

