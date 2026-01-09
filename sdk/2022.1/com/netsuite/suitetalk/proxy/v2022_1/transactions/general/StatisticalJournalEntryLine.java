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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.general;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
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

public class StatisticalJournalEntryLine
implements Serializable {
    private RecordRef account;
    private Long line;
    private RecordRef location;
    private RecordRef scheduleNum;
    private Double debit;
    private String memo;
    private RecordRef entity;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef lineUnit;
    private String previewDebit;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(StatisticalJournalEntryLine.class, true);

    public StatisticalJournalEntryLine() {
    }

    public StatisticalJournalEntryLine(RecordRef account, Long line, RecordRef location, RecordRef scheduleNum, Double debit, String memo, RecordRef entity, RecordRef department, RecordRef _class, RecordRef lineUnit, String previewDebit, CustomFieldList customFieldList) {
        this.account = account;
        this.line = line;
        this.location = location;
        this.scheduleNum = scheduleNum;
        this.debit = debit;
        this.memo = memo;
        this.entity = entity;
        this.department = department;
        this._class = _class;
        this.lineUnit = lineUnit;
        this.previewDebit = previewDebit;
        this.customFieldList = customFieldList;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getScheduleNum() {
        return this.scheduleNum;
    }

    public void setScheduleNum(RecordRef scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public Double getDebit() {
        return this.debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLineUnit() {
        return this.lineUnit;
    }

    public void setLineUnit(RecordRef lineUnit) {
        this.lineUnit = lineUnit;
    }

    public String getPreviewDebit() {
        return this.previewDebit;
    }

    public void setPreviewDebit(String previewDebit) {
        this.previewDebit = previewDebit;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StatisticalJournalEntryLine)) {
            return false;
        }
        StatisticalJournalEntryLine other = (StatisticalJournalEntryLine)obj;
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
        boolean _equals = (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.scheduleNum == null && other.getScheduleNum() == null || this.scheduleNum != null && this.scheduleNum.equals(other.getScheduleNum())) && (this.debit == null && other.getDebit() == null || this.debit != null && this.debit.equals(other.getDebit())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.lineUnit == null && other.getLineUnit() == null || this.lineUnit != null && this.lineUnit.equals(other.getLineUnit())) && (this.previewDebit == null && other.getPreviewDebit() == null || this.previewDebit != null && this.previewDebit.equals(other.getPreviewDebit())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getScheduleNum() != null) {
            _hashCode += this.getScheduleNum().hashCode();
        }
        if (this.getDebit() != null) {
            _hashCode += this.getDebit().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLineUnit() != null) {
            _hashCode += this.getLineUnit().hashCode();
        }
        if (this.getPreviewDebit() != null) {
            _hashCode += this.getPreviewDebit().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLine"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleNum");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "scheduleNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debit");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "debit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineUnit");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "lineUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("previewDebit");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "previewDebit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

