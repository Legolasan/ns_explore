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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.CurrencySymbolPlacement;
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

public class CustomerCurrency
implements Serializable {
    private RecordRef currency;
    private Double balance;
    private Double consolBalance;
    private Double depositBalance;
    private Double consolDepositBalance;
    private Double overdueBalance;
    private Double consolOverdueBalance;
    private Double unbilledOrders;
    private Double consolUnbilledOrders;
    private Boolean overrideCurrencyFormat;
    private String displaySymbol;
    private CurrencySymbolPlacement symbolPlacement;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerCurrency.class, true);

    public CustomerCurrency() {
    }

    public CustomerCurrency(RecordRef currency, Double balance, Double consolBalance, Double depositBalance, Double consolDepositBalance, Double overdueBalance, Double consolOverdueBalance, Double unbilledOrders, Double consolUnbilledOrders, Boolean overrideCurrencyFormat, String displaySymbol, CurrencySymbolPlacement symbolPlacement) {
        this.currency = currency;
        this.balance = balance;
        this.consolBalance = consolBalance;
        this.depositBalance = depositBalance;
        this.consolDepositBalance = consolDepositBalance;
        this.overdueBalance = overdueBalance;
        this.consolOverdueBalance = consolOverdueBalance;
        this.unbilledOrders = unbilledOrders;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.overrideCurrencyFormat = overrideCurrencyFormat;
        this.displaySymbol = displaySymbol;
        this.symbolPlacement = symbolPlacement;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getConsolBalance() {
        return this.consolBalance;
    }

    public void setConsolBalance(Double consolBalance) {
        this.consolBalance = consolBalance;
    }

    public Double getDepositBalance() {
        return this.depositBalance;
    }

    public void setDepositBalance(Double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Double getConsolDepositBalance() {
        return this.consolDepositBalance;
    }

    public void setConsolDepositBalance(Double consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }

    public Double getOverdueBalance() {
        return this.overdueBalance;
    }

    public void setOverdueBalance(Double overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public Double getConsolOverdueBalance() {
        return this.consolOverdueBalance;
    }

    public void setConsolOverdueBalance(Double consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }

    public Double getUnbilledOrders() {
        return this.unbilledOrders;
    }

    public void setUnbilledOrders(Double unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public Double getConsolUnbilledOrders() {
        return this.consolUnbilledOrders;
    }

    public void setConsolUnbilledOrders(Double consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }

    public Boolean getOverrideCurrencyFormat() {
        return this.overrideCurrencyFormat;
    }

    public void setOverrideCurrencyFormat(Boolean overrideCurrencyFormat) {
        this.overrideCurrencyFormat = overrideCurrencyFormat;
    }

    public String getDisplaySymbol() {
        return this.displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public CurrencySymbolPlacement getSymbolPlacement() {
        return this.symbolPlacement;
    }

    public void setSymbolPlacement(CurrencySymbolPlacement symbolPlacement) {
        this.symbolPlacement = symbolPlacement;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomerCurrency)) {
            return false;
        }
        CustomerCurrency other = (CustomerCurrency)obj;
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
        boolean _equals = (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.consolBalance == null && other.getConsolBalance() == null || this.consolBalance != null && this.consolBalance.equals(other.getConsolBalance())) && (this.depositBalance == null && other.getDepositBalance() == null || this.depositBalance != null && this.depositBalance.equals(other.getDepositBalance())) && (this.consolDepositBalance == null && other.getConsolDepositBalance() == null || this.consolDepositBalance != null && this.consolDepositBalance.equals(other.getConsolDepositBalance())) && (this.overdueBalance == null && other.getOverdueBalance() == null || this.overdueBalance != null && this.overdueBalance.equals(other.getOverdueBalance())) && (this.consolOverdueBalance == null && other.getConsolOverdueBalance() == null || this.consolOverdueBalance != null && this.consolOverdueBalance.equals(other.getConsolOverdueBalance())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && this.unbilledOrders.equals(other.getUnbilledOrders())) && (this.consolUnbilledOrders == null && other.getConsolUnbilledOrders() == null || this.consolUnbilledOrders != null && this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders())) && (this.overrideCurrencyFormat == null && other.getOverrideCurrencyFormat() == null || this.overrideCurrencyFormat != null && this.overrideCurrencyFormat.equals(other.getOverrideCurrencyFormat())) && (this.displaySymbol == null && other.getDisplaySymbol() == null || this.displaySymbol != null && this.displaySymbol.equals(other.getDisplaySymbol())) && (this.symbolPlacement == null && other.getSymbolPlacement() == null || this.symbolPlacement != null && this.symbolPlacement.equals(other.getSymbolPlacement()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getConsolBalance() != null) {
            _hashCode += this.getConsolBalance().hashCode();
        }
        if (this.getDepositBalance() != null) {
            _hashCode += this.getDepositBalance().hashCode();
        }
        if (this.getConsolDepositBalance() != null) {
            _hashCode += this.getConsolDepositBalance().hashCode();
        }
        if (this.getOverdueBalance() != null) {
            _hashCode += this.getOverdueBalance().hashCode();
        }
        if (this.getConsolOverdueBalance() != null) {
            _hashCode += this.getConsolOverdueBalance().hashCode();
        }
        if (this.getUnbilledOrders() != null) {
            _hashCode += this.getUnbilledOrders().hashCode();
        }
        if (this.getConsolUnbilledOrders() != null) {
            _hashCode += this.getConsolUnbilledOrders().hashCode();
        }
        if (this.getOverrideCurrencyFormat() != null) {
            _hashCode += this.getOverrideCurrencyFormat().hashCode();
        }
        if (this.getDisplaySymbol() != null) {
            _hashCode += this.getDisplaySymbol().hashCode();
        }
        if (this.getSymbolPlacement() != null) {
            _hashCode += this.getSymbolPlacement().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerCurrency"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideCurrencyFormat");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "overrideCurrencyFormat"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "displaySymbol"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("symbolPlacement");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "symbolPlacement"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

