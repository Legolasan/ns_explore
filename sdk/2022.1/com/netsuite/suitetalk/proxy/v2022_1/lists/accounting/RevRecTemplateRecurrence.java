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

public class RevRecTemplateRecurrence
implements Serializable {
    private RecordRef incomeaccount;
    private Long periodOffset;
    private String recamount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecTemplateRecurrence.class, true);

    public RevRecTemplateRecurrence() {
    }

    public RevRecTemplateRecurrence(RecordRef incomeaccount, Long periodOffset, String recamount) {
        this.incomeaccount = incomeaccount;
        this.periodOffset = periodOffset;
        this.recamount = recamount;
    }

    public RecordRef getIncomeaccount() {
        return this.incomeaccount;
    }

    public void setIncomeaccount(RecordRef incomeaccount) {
        this.incomeaccount = incomeaccount;
    }

    public Long getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(Long periodOffset) {
        this.periodOffset = periodOffset;
    }

    public String getRecamount() {
        return this.recamount;
    }

    public void setRecamount(String recamount) {
        this.recamount = recamount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RevRecTemplateRecurrence)) {
            return false;
        }
        RevRecTemplateRecurrence other = (RevRecTemplateRecurrence)obj;
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
        boolean _equals = (this.incomeaccount == null && other.getIncomeaccount() == null || this.incomeaccount != null && this.incomeaccount.equals(other.getIncomeaccount())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && this.periodOffset.equals(other.getPeriodOffset())) && (this.recamount == null && other.getRecamount() == null || this.recamount != null && this.recamount.equals(other.getRecamount()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getIncomeaccount() != null) {
            _hashCode += this.getIncomeaccount().hashCode();
        }
        if (this.getPeriodOffset() != null) {
            _hashCode += this.getPeriodOffset().hashCode();
        }
        if (this.getRecamount() != null) {
            _hashCode += this.getRecamount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "RevRecTemplateRecurrence"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("incomeaccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "incomeaccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recamount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recamount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

