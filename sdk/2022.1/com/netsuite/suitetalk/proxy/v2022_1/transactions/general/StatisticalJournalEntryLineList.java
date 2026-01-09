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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.general;

import com.netsuite.suitetalk.proxy.v2022_1.transactions.general.StatisticalJournalEntryLine;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class StatisticalJournalEntryLineList
implements Serializable {
    private StatisticalJournalEntryLine[] statisticalJournalEntryLine;
    private boolean replaceAll;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(StatisticalJournalEntryLineList.class, true);

    public StatisticalJournalEntryLineList() {
    }

    public StatisticalJournalEntryLineList(StatisticalJournalEntryLine[] statisticalJournalEntryLine, boolean replaceAll) {
        this.statisticalJournalEntryLine = statisticalJournalEntryLine;
        this.replaceAll = replaceAll;
    }

    public StatisticalJournalEntryLine[] getStatisticalJournalEntryLine() {
        return this.statisticalJournalEntryLine;
    }

    public void setStatisticalJournalEntryLine(StatisticalJournalEntryLine[] statisticalJournalEntryLine) {
        this.statisticalJournalEntryLine = statisticalJournalEntryLine;
    }

    public StatisticalJournalEntryLine getStatisticalJournalEntryLine(int i) {
        return this.statisticalJournalEntryLine[i];
    }

    public void setStatisticalJournalEntryLine(int i, StatisticalJournalEntryLine _value) {
        this.statisticalJournalEntryLine[i] = _value;
    }

    public boolean isReplaceAll() {
        return this.replaceAll;
    }

    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StatisticalJournalEntryLineList)) {
            return false;
        }
        StatisticalJournalEntryLineList other = (StatisticalJournalEntryLineList)obj;
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
        boolean _equals = (this.statisticalJournalEntryLine == null && other.getStatisticalJournalEntryLine() == null || this.statisticalJournalEntryLine != null && Arrays.equals(this.statisticalJournalEntryLine, other.getStatisticalJournalEntryLine())) && this.replaceAll == other.isReplaceAll();
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatisticalJournalEntryLine() != null) {
            for (int i = 0; i < Array.getLength(this.getStatisticalJournalEntryLine()); ++i) {
                Object obj = Array.get(this.getStatisticalJournalEntryLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        Boolean bl = this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE;
        this.__hashCodeCalc = false;
        return _hashCode += bl.hashCode();
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
        typeDesc.setXmlType(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLineList"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new QName("", "replaceAll"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("statisticalJournalEntryLine");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "statisticalJournalEntryLine"));
        elemField.setXmlType(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "StatisticalJournalEntryLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

