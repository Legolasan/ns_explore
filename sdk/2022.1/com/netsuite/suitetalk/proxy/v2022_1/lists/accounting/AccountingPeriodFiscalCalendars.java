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

public class AccountingPeriodFiscalCalendars
implements Serializable {
    private RecordRef fiscalCalendar;
    private RecordRef parent;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingPeriodFiscalCalendars.class, true);

    public AccountingPeriodFiscalCalendars() {
    }

    public AccountingPeriodFiscalCalendars(RecordRef fiscalCalendar, RecordRef parent) {
        this.fiscalCalendar = fiscalCalendar;
        this.parent = parent;
    }

    public RecordRef getFiscalCalendar() {
        return this.fiscalCalendar;
    }

    public void setFiscalCalendar(RecordRef fiscalCalendar) {
        this.fiscalCalendar = fiscalCalendar;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingPeriodFiscalCalendars)) {
            return false;
        }
        AccountingPeriodFiscalCalendars other = (AccountingPeriodFiscalCalendars)obj;
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
        boolean _equals = (this.fiscalCalendar == null && other.getFiscalCalendar() == null || this.fiscalCalendar != null && this.fiscalCalendar.equals(other.getFiscalCalendar())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getFiscalCalendar() != null) {
            _hashCode += this.getFiscalCalendar().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendars"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("fiscalCalendar");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fiscalCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

