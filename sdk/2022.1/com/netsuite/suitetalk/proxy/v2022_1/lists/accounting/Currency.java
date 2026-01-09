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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.CurrencyCurrencyPrecision;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.CurrencyFxRateUpdateTimezone;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.CurrencyLocale;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.CurrencySymbolPlacement;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Currency
extends Record
implements Serializable {
    private String name;
    private String symbol;
    private Boolean isBaseCurrency;
    private Boolean isInactive;
    private Boolean overrideCurrencyFormat;
    private String displaySymbol;
    private CurrencySymbolPlacement symbolPlacement;
    private CurrencyLocale locale;
    private String formatSample;
    private Double exchangeRate;
    private CurrencyFxRateUpdateTimezone fxRateUpdateTimezone;
    private Boolean inclInFxRateUpdates;
    private CurrencyCurrencyPrecision currencyPrecision;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Currency.class, true);

    public Currency() {
    }

    public Currency(NullField nullFieldList, String internalId, String externalId, String name, String symbol, Boolean isBaseCurrency, Boolean isInactive, Boolean overrideCurrencyFormat, String displaySymbol, CurrencySymbolPlacement symbolPlacement, CurrencyLocale locale, String formatSample, Double exchangeRate, CurrencyFxRateUpdateTimezone fxRateUpdateTimezone, Boolean inclInFxRateUpdates, CurrencyCurrencyPrecision currencyPrecision) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.symbol = symbol;
        this.isBaseCurrency = isBaseCurrency;
        this.isInactive = isInactive;
        this.overrideCurrencyFormat = overrideCurrencyFormat;
        this.displaySymbol = displaySymbol;
        this.symbolPlacement = symbolPlacement;
        this.locale = locale;
        this.formatSample = formatSample;
        this.exchangeRate = exchangeRate;
        this.fxRateUpdateTimezone = fxRateUpdateTimezone;
        this.inclInFxRateUpdates = inclInFxRateUpdates;
        this.currencyPrecision = currencyPrecision;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Boolean getIsBaseCurrency() {
        return this.isBaseCurrency;
    }

    public void setIsBaseCurrency(Boolean isBaseCurrency) {
        this.isBaseCurrency = isBaseCurrency;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
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

    public CurrencyLocale getLocale() {
        return this.locale;
    }

    public void setLocale(CurrencyLocale locale) {
        this.locale = locale;
    }

    public String getFormatSample() {
        return this.formatSample;
    }

    public void setFormatSample(String formatSample) {
        this.formatSample = formatSample;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public CurrencyFxRateUpdateTimezone getFxRateUpdateTimezone() {
        return this.fxRateUpdateTimezone;
    }

    public void setFxRateUpdateTimezone(CurrencyFxRateUpdateTimezone fxRateUpdateTimezone) {
        this.fxRateUpdateTimezone = fxRateUpdateTimezone;
    }

    public Boolean getInclInFxRateUpdates() {
        return this.inclInFxRateUpdates;
    }

    public void setInclInFxRateUpdates(Boolean inclInFxRateUpdates) {
        this.inclInFxRateUpdates = inclInFxRateUpdates;
    }

    public CurrencyCurrencyPrecision getCurrencyPrecision() {
        return this.currencyPrecision;
    }

    public void setCurrencyPrecision(CurrencyCurrencyPrecision currencyPrecision) {
        this.currencyPrecision = currencyPrecision;
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
        if (!(obj instanceof Currency)) {
            return false;
        }
        Currency other = (Currency)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.symbol == null && other.getSymbol() == null || this.symbol != null && this.symbol.equals(other.getSymbol())) && (this.isBaseCurrency == null && other.getIsBaseCurrency() == null || this.isBaseCurrency != null && this.isBaseCurrency.equals(other.getIsBaseCurrency())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.overrideCurrencyFormat == null && other.getOverrideCurrencyFormat() == null || this.overrideCurrencyFormat != null && this.overrideCurrencyFormat.equals(other.getOverrideCurrencyFormat())) && (this.displaySymbol == null && other.getDisplaySymbol() == null || this.displaySymbol != null && this.displaySymbol.equals(other.getDisplaySymbol())) && (this.symbolPlacement == null && other.getSymbolPlacement() == null || this.symbolPlacement != null && this.symbolPlacement.equals(other.getSymbolPlacement())) && (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.formatSample == null && other.getFormatSample() == null || this.formatSample != null && this.formatSample.equals(other.getFormatSample())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.fxRateUpdateTimezone == null && other.getFxRateUpdateTimezone() == null || this.fxRateUpdateTimezone != null && this.fxRateUpdateTimezone.equals(other.getFxRateUpdateTimezone())) && (this.inclInFxRateUpdates == null && other.getInclInFxRateUpdates() == null || this.inclInFxRateUpdates != null && this.inclInFxRateUpdates.equals(other.getInclInFxRateUpdates())) && (this.currencyPrecision == null && other.getCurrencyPrecision() == null || this.currencyPrecision != null && this.currencyPrecision.equals(other.getCurrencyPrecision())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getSymbol() != null) {
            _hashCode += this.getSymbol().hashCode();
        }
        if (this.getIsBaseCurrency() != null) {
            _hashCode += this.getIsBaseCurrency().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
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
        if (this.getLocale() != null) {
            _hashCode += this.getLocale().hashCode();
        }
        if (this.getFormatSample() != null) {
            _hashCode += this.getFormatSample().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getFxRateUpdateTimezone() != null) {
            _hashCode += this.getFxRateUpdateTimezone().hashCode();
        }
        if (this.getInclInFxRateUpdates() != null) {
            _hashCode += this.getInclInFxRateUpdates().hashCode();
        }
        if (this.getCurrencyPrecision() != null) {
            _hashCode += this.getCurrencyPrecision().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Currency"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "symbol"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBaseCurrency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isBaseCurrency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("overrideCurrencyFormat");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "overrideCurrencyFormat"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "displaySymbol"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("symbolPlacement");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "symbolPlacement"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "CurrencyLocale"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("formatSample");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "formatSample"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxRateUpdateTimezone");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fxRateUpdateTimezone"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "CurrencyFxRateUpdateTimezone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inclInFxRateUpdates");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inclInFxRateUpdates"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyPrecision");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currencyPrecision"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "CurrencyCurrencyPrecision"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

