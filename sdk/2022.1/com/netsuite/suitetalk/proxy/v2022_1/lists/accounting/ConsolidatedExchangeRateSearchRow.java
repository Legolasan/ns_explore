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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingPeriodSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ConsolidatedExchangeRateSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SubsidiarySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ConsolidatedExchangeRateSearchRow
extends SearchRow
implements Serializable {
    private ConsolidatedExchangeRateSearchRowBasic basic;
    private SubsidiarySearchRowBasic fromSubsidiaryJoin;
    private AccountingPeriodSearchRowBasic periodJoin;
    private SubsidiarySearchRowBasic toSubsidiaryJoin;
    private EmployeeSearchRowBasic userJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ConsolidatedExchangeRateSearchRow.class, true);

    public ConsolidatedExchangeRateSearchRow() {
    }

    public ConsolidatedExchangeRateSearchRow(ConsolidatedExchangeRateSearchRowBasic basic, SubsidiarySearchRowBasic fromSubsidiaryJoin, AccountingPeriodSearchRowBasic periodJoin, SubsidiarySearchRowBasic toSubsidiaryJoin, EmployeeSearchRowBasic userJoin) {
        this.basic = basic;
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
        this.periodJoin = periodJoin;
        this.toSubsidiaryJoin = toSubsidiaryJoin;
        this.userJoin = userJoin;
    }

    public ConsolidatedExchangeRateSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ConsolidatedExchangeRateSearchRowBasic basic) {
        this.basic = basic;
    }

    public SubsidiarySearchRowBasic getFromSubsidiaryJoin() {
        return this.fromSubsidiaryJoin;
    }

    public void setFromSubsidiaryJoin(SubsidiarySearchRowBasic fromSubsidiaryJoin) {
        this.fromSubsidiaryJoin = fromSubsidiaryJoin;
    }

    public AccountingPeriodSearchRowBasic getPeriodJoin() {
        return this.periodJoin;
    }

    public void setPeriodJoin(AccountingPeriodSearchRowBasic periodJoin) {
        this.periodJoin = periodJoin;
    }

    public SubsidiarySearchRowBasic getToSubsidiaryJoin() {
        return this.toSubsidiaryJoin;
    }

    public void setToSubsidiaryJoin(SubsidiarySearchRowBasic toSubsidiaryJoin) {
        this.toSubsidiaryJoin = toSubsidiaryJoin;
    }

    public EmployeeSearchRowBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchRow)) {
            return false;
        }
        ConsolidatedExchangeRateSearchRow other = (ConsolidatedExchangeRateSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.fromSubsidiaryJoin == null && other.getFromSubsidiaryJoin() == null || this.fromSubsidiaryJoin != null && this.fromSubsidiaryJoin.equals(other.getFromSubsidiaryJoin())) && (this.periodJoin == null && other.getPeriodJoin() == null || this.periodJoin != null && this.periodJoin.equals(other.getPeriodJoin())) && (this.toSubsidiaryJoin == null && other.getToSubsidiaryJoin() == null || this.toSubsidiaryJoin != null && this.toSubsidiaryJoin.equals(other.getToSubsidiaryJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin()));
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
        if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
        }
        if (this.getFromSubsidiaryJoin() != null) {
            _hashCode += this.getFromSubsidiaryJoin().hashCode();
        }
        if (this.getPeriodJoin() != null) {
            _hashCode += this.getPeriodJoin().hashCode();
        }
        if (this.getToSubsidiaryJoin() != null) {
            _hashCode += this.getToSubsidiaryJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromSubsidiaryJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fromSubsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiaryJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "toSubsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

