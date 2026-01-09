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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.AccountLocalizationsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.AccountType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ConsolidatedRate;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class Account
extends Record
implements Serializable {
    private AccountType acctType;
    private RecordRef unitsType;
    private RecordRef unit;
    private String acctNumber;
    private String acctName;
    private String legalName;
    private Boolean includeChildren;
    private RecordRef currency;
    private String exchangeRate;
    private ConsolidatedRate generalRate;
    private RecordRef parent;
    private ConsolidatedRate cashFlowRate;
    private RecordRef billableExpensesAcct;
    private RecordRef deferralAcct;
    private String description;
    private Long curDocNum;
    private Boolean isInactive;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRefList restrictToAccountingBookList;
    private Boolean inventory;
    private Boolean eliminate;
    private RecordRefList subsidiaryList;
    private RecordRef category1099Misc;
    private AccountLocalizationsList localizationsList;
    private Double openingBalance;
    private Calendar tranDate;
    private Boolean revalue;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Account.class, true);

    public Account() {
    }

    public Account(NullField nullFieldList, String internalId, String externalId, AccountType acctType, RecordRef unitsType, RecordRef unit, String acctNumber, String acctName, String legalName, Boolean includeChildren, RecordRef currency, String exchangeRate, ConsolidatedRate generalRate, RecordRef parent, ConsolidatedRate cashFlowRate, RecordRef billableExpensesAcct, RecordRef deferralAcct, String description, Long curDocNum, Boolean isInactive, RecordRef department, RecordRef _class, RecordRef location, RecordRefList restrictToAccountingBookList, Boolean inventory, Boolean eliminate, RecordRefList subsidiaryList, RecordRef category1099Misc, AccountLocalizationsList localizationsList, Double openingBalance, Calendar tranDate, Boolean revalue, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.acctType = acctType;
        this.unitsType = unitsType;
        this.unit = unit;
        this.acctNumber = acctNumber;
        this.acctName = acctName;
        this.legalName = legalName;
        this.includeChildren = includeChildren;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.generalRate = generalRate;
        this.parent = parent;
        this.cashFlowRate = cashFlowRate;
        this.billableExpensesAcct = billableExpensesAcct;
        this.deferralAcct = deferralAcct;
        this.description = description;
        this.curDocNum = curDocNum;
        this.isInactive = isInactive;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.restrictToAccountingBookList = restrictToAccountingBookList;
        this.inventory = inventory;
        this.eliminate = eliminate;
        this.subsidiaryList = subsidiaryList;
        this.category1099Misc = category1099Misc;
        this.localizationsList = localizationsList;
        this.openingBalance = openingBalance;
        this.tranDate = tranDate;
        this.revalue = revalue;
        this.customFieldList = customFieldList;
    }

    public AccountType getAcctType() {
        return this.acctType;
    }

    public void setAcctType(AccountType acctType) {
        this.acctType = acctType;
    }

    public RecordRef getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(RecordRef unitsType) {
        this.unitsType = unitsType;
    }

    public RecordRef getUnit() {
        return this.unit;
    }

    public void setUnit(RecordRef unit) {
        this.unit = unit;
    }

    public String getAcctNumber() {
        return this.acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getAcctName() {
        return this.acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getLegalName() {
        return this.legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public String getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public ConsolidatedRate getGeneralRate() {
        return this.generalRate;
    }

    public void setGeneralRate(ConsolidatedRate generalRate) {
        this.generalRate = generalRate;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public ConsolidatedRate getCashFlowRate() {
        return this.cashFlowRate;
    }

    public void setCashFlowRate(ConsolidatedRate cashFlowRate) {
        this.cashFlowRate = cashFlowRate;
    }

    public RecordRef getBillableExpensesAcct() {
        return this.billableExpensesAcct;
    }

    public void setBillableExpensesAcct(RecordRef billableExpensesAcct) {
        this.billableExpensesAcct = billableExpensesAcct;
    }

    public RecordRef getDeferralAcct() {
        return this.deferralAcct;
    }

    public void setDeferralAcct(RecordRef deferralAcct) {
        this.deferralAcct = deferralAcct;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCurDocNum() {
        return this.curDocNum;
    }

    public void setCurDocNum(Long curDocNum) {
        this.curDocNum = curDocNum;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
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

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRefList getRestrictToAccountingBookList() {
        return this.restrictToAccountingBookList;
    }

    public void setRestrictToAccountingBookList(RecordRefList restrictToAccountingBookList) {
        this.restrictToAccountingBookList = restrictToAccountingBookList;
    }

    public Boolean getInventory() {
        return this.inventory;
    }

    public void setInventory(Boolean inventory) {
        this.inventory = inventory;
    }

    public Boolean getEliminate() {
        return this.eliminate;
    }

    public void setEliminate(Boolean eliminate) {
        this.eliminate = eliminate;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public RecordRef getCategory1099Misc() {
        return this.category1099Misc;
    }

    public void setCategory1099Misc(RecordRef category1099Misc) {
        this.category1099Misc = category1099Misc;
    }

    public AccountLocalizationsList getLocalizationsList() {
        return this.localizationsList;
    }

    public void setLocalizationsList(AccountLocalizationsList localizationsList) {
        this.localizationsList = localizationsList;
    }

    public Double getOpeningBalance() {
        return this.openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public Boolean getRevalue() {
        return this.revalue;
    }

    public void setRevalue(Boolean revalue) {
        this.revalue = revalue;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
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
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account)obj;
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
        boolean _equals = super.equals(obj) && (this.acctType == null && other.getAcctType() == null || this.acctType != null && this.acctType.equals(other.getAcctType())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.unit == null && other.getUnit() == null || this.unit != null && this.unit.equals(other.getUnit())) && (this.acctNumber == null && other.getAcctNumber() == null || this.acctNumber != null && this.acctNumber.equals(other.getAcctNumber())) && (this.acctName == null && other.getAcctName() == null || this.acctName != null && this.acctName.equals(other.getAcctName())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && this.legalName.equals(other.getLegalName())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.generalRate == null && other.getGeneralRate() == null || this.generalRate != null && this.generalRate.equals(other.getGeneralRate())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.cashFlowRate == null && other.getCashFlowRate() == null || this.cashFlowRate != null && this.cashFlowRate.equals(other.getCashFlowRate())) && (this.billableExpensesAcct == null && other.getBillableExpensesAcct() == null || this.billableExpensesAcct != null && this.billableExpensesAcct.equals(other.getBillableExpensesAcct())) && (this.deferralAcct == null && other.getDeferralAcct() == null || this.deferralAcct != null && this.deferralAcct.equals(other.getDeferralAcct())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.curDocNum == null && other.getCurDocNum() == null || this.curDocNum != null && this.curDocNum.equals(other.getCurDocNum())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.restrictToAccountingBookList == null && other.getRestrictToAccountingBookList() == null || this.restrictToAccountingBookList != null && this.restrictToAccountingBookList.equals(other.getRestrictToAccountingBookList())) && (this.inventory == null && other.getInventory() == null || this.inventory != null && this.inventory.equals(other.getInventory())) && (this.eliminate == null && other.getEliminate() == null || this.eliminate != null && this.eliminate.equals(other.getEliminate())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.category1099Misc == null && other.getCategory1099Misc() == null || this.category1099Misc != null && this.category1099Misc.equals(other.getCategory1099Misc())) && (this.localizationsList == null && other.getLocalizationsList() == null || this.localizationsList != null && this.localizationsList.equals(other.getLocalizationsList())) && (this.openingBalance == null && other.getOpeningBalance() == null || this.openingBalance != null && this.openingBalance.equals(other.getOpeningBalance())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.revalue == null && other.getRevalue() == null || this.revalue != null && this.revalue.equals(other.getRevalue())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getAcctType() != null) {
            _hashCode += this.getAcctType().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getUnit() != null) {
            _hashCode += this.getUnit().hashCode();
        }
        if (this.getAcctNumber() != null) {
            _hashCode += this.getAcctNumber().hashCode();
        }
        if (this.getAcctName() != null) {
            _hashCode += this.getAcctName().hashCode();
        }
        if (this.getLegalName() != null) {
            _hashCode += this.getLegalName().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getGeneralRate() != null) {
            _hashCode += this.getGeneralRate().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getCashFlowRate() != null) {
            _hashCode += this.getCashFlowRate().hashCode();
        }
        if (this.getBillableExpensesAcct() != null) {
            _hashCode += this.getBillableExpensesAcct().hashCode();
        }
        if (this.getDeferralAcct() != null) {
            _hashCode += this.getDeferralAcct().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getCurDocNum() != null) {
            _hashCode += this.getCurDocNum().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getRestrictToAccountingBookList() != null) {
            _hashCode += this.getRestrictToAccountingBookList().hashCode();
        }
        if (this.getInventory() != null) {
            _hashCode += this.getInventory().hashCode();
        }
        if (this.getEliminate() != null) {
            _hashCode += this.getEliminate().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getCategory1099Misc() != null) {
            _hashCode += this.getCategory1099Misc().hashCode();
        }
        if (this.getLocalizationsList() != null) {
            _hashCode += this.getLocalizationsList().hashCode();
        }
        if (this.getOpeningBalance() != null) {
            _hashCode += this.getOpeningBalance().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getRevalue() != null) {
            _hashCode += this.getRevalue().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Account"));
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
        elemField.setFieldName("acctType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "acctType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "AccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "acctNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "acctName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generalRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "generalRate"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ConsolidatedRate"));
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
        elemField = new ElementDesc();
        elemField.setFieldName("cashFlowRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cashFlowRate"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ConsolidatedRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billableExpensesAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billableExpensesAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferralAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferralAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("curDocNum");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "curDocNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToAccountingBookList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "restrictToAccountingBookList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eliminate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "eliminate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "category1099misc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "localizationsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AccountLocalizationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "openingBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revalue");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revalue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

