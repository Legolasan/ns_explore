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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.financial;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.financial.types.BudgetBudgetType;
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

public class Budget
extends Record
implements Serializable {
    private RecordRef year;
    private RecordRef customer;
    private RecordRef item;
    private RecordRef _class;
    private RecordRef department;
    private RecordRef location;
    private RecordRef account;
    private RecordRef subsidiary;
    private RecordRef category;
    private BudgetBudgetType budgetType;
    private RecordRef currency;
    private Double periodAmount1;
    private Double periodAmount2;
    private Double periodAmount3;
    private Double periodAmount4;
    private Double periodAmount5;
    private Double periodAmount6;
    private Double periodAmount7;
    private Double periodAmount8;
    private Double periodAmount9;
    private Double periodAmount10;
    private Double periodAmount11;
    private Double periodAmount12;
    private Double periodAmount13;
    private Double periodAmount14;
    private Double periodAmount15;
    private Double periodAmount16;
    private Double periodAmount17;
    private Double periodAmount18;
    private Double periodAmount19;
    private Double periodAmount20;
    private Double periodAmount21;
    private Double periodAmount22;
    private Double periodAmount23;
    private Double periodAmount24;
    private Double amount;
    private RecordRef accountingBook;
    private CustomFieldList customFieldList;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Budget.class, true);

    public Budget() {
    }

    public Budget(NullField nullFieldList, String internalId, RecordRef year, RecordRef customer, RecordRef item, RecordRef _class, RecordRef department, RecordRef location, RecordRef account, RecordRef subsidiary, RecordRef category, BudgetBudgetType budgetType, RecordRef currency, Double periodAmount1, Double periodAmount2, Double periodAmount3, Double periodAmount4, Double periodAmount5, Double periodAmount6, Double periodAmount7, Double periodAmount8, Double periodAmount9, Double periodAmount10, Double periodAmount11, Double periodAmount12, Double periodAmount13, Double periodAmount14, Double periodAmount15, Double periodAmount16, Double periodAmount17, Double periodAmount18, Double periodAmount19, Double periodAmount20, Double periodAmount21, Double periodAmount22, Double periodAmount23, Double periodAmount24, Double amount, RecordRef accountingBook, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.year = year;
        this.customer = customer;
        this.item = item;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.account = account;
        this.subsidiary = subsidiary;
        this.category = category;
        this.budgetType = budgetType;
        this.currency = currency;
        this.periodAmount1 = periodAmount1;
        this.periodAmount2 = periodAmount2;
        this.periodAmount3 = periodAmount3;
        this.periodAmount4 = periodAmount4;
        this.periodAmount5 = periodAmount5;
        this.periodAmount6 = periodAmount6;
        this.periodAmount7 = periodAmount7;
        this.periodAmount8 = periodAmount8;
        this.periodAmount9 = periodAmount9;
        this.periodAmount10 = periodAmount10;
        this.periodAmount11 = periodAmount11;
        this.periodAmount12 = periodAmount12;
        this.periodAmount13 = periodAmount13;
        this.periodAmount14 = periodAmount14;
        this.periodAmount15 = periodAmount15;
        this.periodAmount16 = periodAmount16;
        this.periodAmount17 = periodAmount17;
        this.periodAmount18 = periodAmount18;
        this.periodAmount19 = periodAmount19;
        this.periodAmount20 = periodAmount20;
        this.periodAmount21 = periodAmount21;
        this.periodAmount22 = periodAmount22;
        this.periodAmount23 = periodAmount23;
        this.periodAmount24 = periodAmount24;
        this.amount = amount;
        this.accountingBook = accountingBook;
        this.customFieldList = customFieldList;
    }

    public RecordRef getYear() {
        return this.year;
    }

    public void setYear(RecordRef year) {
        this.year = year;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public BudgetBudgetType getBudgetType() {
        return this.budgetType;
    }

    public void setBudgetType(BudgetBudgetType budgetType) {
        this.budgetType = budgetType;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getPeriodAmount1() {
        return this.periodAmount1;
    }

    public void setPeriodAmount1(Double periodAmount1) {
        this.periodAmount1 = periodAmount1;
    }

    public Double getPeriodAmount2() {
        return this.periodAmount2;
    }

    public void setPeriodAmount2(Double periodAmount2) {
        this.periodAmount2 = periodAmount2;
    }

    public Double getPeriodAmount3() {
        return this.periodAmount3;
    }

    public void setPeriodAmount3(Double periodAmount3) {
        this.periodAmount3 = periodAmount3;
    }

    public Double getPeriodAmount4() {
        return this.periodAmount4;
    }

    public void setPeriodAmount4(Double periodAmount4) {
        this.periodAmount4 = periodAmount4;
    }

    public Double getPeriodAmount5() {
        return this.periodAmount5;
    }

    public void setPeriodAmount5(Double periodAmount5) {
        this.periodAmount5 = periodAmount5;
    }

    public Double getPeriodAmount6() {
        return this.periodAmount6;
    }

    public void setPeriodAmount6(Double periodAmount6) {
        this.periodAmount6 = periodAmount6;
    }

    public Double getPeriodAmount7() {
        return this.periodAmount7;
    }

    public void setPeriodAmount7(Double periodAmount7) {
        this.periodAmount7 = periodAmount7;
    }

    public Double getPeriodAmount8() {
        return this.periodAmount8;
    }

    public void setPeriodAmount8(Double periodAmount8) {
        this.periodAmount8 = periodAmount8;
    }

    public Double getPeriodAmount9() {
        return this.periodAmount9;
    }

    public void setPeriodAmount9(Double periodAmount9) {
        this.periodAmount9 = periodAmount9;
    }

    public Double getPeriodAmount10() {
        return this.periodAmount10;
    }

    public void setPeriodAmount10(Double periodAmount10) {
        this.periodAmount10 = periodAmount10;
    }

    public Double getPeriodAmount11() {
        return this.periodAmount11;
    }

    public void setPeriodAmount11(Double periodAmount11) {
        this.periodAmount11 = periodAmount11;
    }

    public Double getPeriodAmount12() {
        return this.periodAmount12;
    }

    public void setPeriodAmount12(Double periodAmount12) {
        this.periodAmount12 = periodAmount12;
    }

    public Double getPeriodAmount13() {
        return this.periodAmount13;
    }

    public void setPeriodAmount13(Double periodAmount13) {
        this.periodAmount13 = periodAmount13;
    }

    public Double getPeriodAmount14() {
        return this.periodAmount14;
    }

    public void setPeriodAmount14(Double periodAmount14) {
        this.periodAmount14 = periodAmount14;
    }

    public Double getPeriodAmount15() {
        return this.periodAmount15;
    }

    public void setPeriodAmount15(Double periodAmount15) {
        this.periodAmount15 = periodAmount15;
    }

    public Double getPeriodAmount16() {
        return this.periodAmount16;
    }

    public void setPeriodAmount16(Double periodAmount16) {
        this.periodAmount16 = periodAmount16;
    }

    public Double getPeriodAmount17() {
        return this.periodAmount17;
    }

    public void setPeriodAmount17(Double periodAmount17) {
        this.periodAmount17 = periodAmount17;
    }

    public Double getPeriodAmount18() {
        return this.periodAmount18;
    }

    public void setPeriodAmount18(Double periodAmount18) {
        this.periodAmount18 = periodAmount18;
    }

    public Double getPeriodAmount19() {
        return this.periodAmount19;
    }

    public void setPeriodAmount19(Double periodAmount19) {
        this.periodAmount19 = periodAmount19;
    }

    public Double getPeriodAmount20() {
        return this.periodAmount20;
    }

    public void setPeriodAmount20(Double periodAmount20) {
        this.periodAmount20 = periodAmount20;
    }

    public Double getPeriodAmount21() {
        return this.periodAmount21;
    }

    public void setPeriodAmount21(Double periodAmount21) {
        this.periodAmount21 = periodAmount21;
    }

    public Double getPeriodAmount22() {
        return this.periodAmount22;
    }

    public void setPeriodAmount22(Double periodAmount22) {
        this.periodAmount22 = periodAmount22;
    }

    public Double getPeriodAmount23() {
        return this.periodAmount23;
    }

    public void setPeriodAmount23(Double periodAmount23) {
        this.periodAmount23 = periodAmount23;
    }

    public Double getPeriodAmount24() {
        return this.periodAmount24;
    }

    public void setPeriodAmount24(Double periodAmount24) {
        this.periodAmount24 = periodAmount24;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public RecordRef getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(RecordRef accountingBook) {
        this.accountingBook = accountingBook;
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

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Budget)) {
            return false;
        }
        Budget other = (Budget)obj;
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
        boolean _equals = super.equals(obj) && (this.year == null && other.getYear() == null || this.year != null && this.year.equals(other.getYear())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.budgetType == null && other.getBudgetType() == null || this.budgetType != null && this.budgetType.equals(other.getBudgetType())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.periodAmount1 == null && other.getPeriodAmount1() == null || this.periodAmount1 != null && this.periodAmount1.equals(other.getPeriodAmount1())) && (this.periodAmount2 == null && other.getPeriodAmount2() == null || this.periodAmount2 != null && this.periodAmount2.equals(other.getPeriodAmount2())) && (this.periodAmount3 == null && other.getPeriodAmount3() == null || this.periodAmount3 != null && this.periodAmount3.equals(other.getPeriodAmount3())) && (this.periodAmount4 == null && other.getPeriodAmount4() == null || this.periodAmount4 != null && this.periodAmount4.equals(other.getPeriodAmount4())) && (this.periodAmount5 == null && other.getPeriodAmount5() == null || this.periodAmount5 != null && this.periodAmount5.equals(other.getPeriodAmount5())) && (this.periodAmount6 == null && other.getPeriodAmount6() == null || this.periodAmount6 != null && this.periodAmount6.equals(other.getPeriodAmount6())) && (this.periodAmount7 == null && other.getPeriodAmount7() == null || this.periodAmount7 != null && this.periodAmount7.equals(other.getPeriodAmount7())) && (this.periodAmount8 == null && other.getPeriodAmount8() == null || this.periodAmount8 != null && this.periodAmount8.equals(other.getPeriodAmount8())) && (this.periodAmount9 == null && other.getPeriodAmount9() == null || this.periodAmount9 != null && this.periodAmount9.equals(other.getPeriodAmount9())) && (this.periodAmount10 == null && other.getPeriodAmount10() == null || this.periodAmount10 != null && this.periodAmount10.equals(other.getPeriodAmount10())) && (this.periodAmount11 == null && other.getPeriodAmount11() == null || this.periodAmount11 != null && this.periodAmount11.equals(other.getPeriodAmount11())) && (this.periodAmount12 == null && other.getPeriodAmount12() == null || this.periodAmount12 != null && this.periodAmount12.equals(other.getPeriodAmount12())) && (this.periodAmount13 == null && other.getPeriodAmount13() == null || this.periodAmount13 != null && this.periodAmount13.equals(other.getPeriodAmount13())) && (this.periodAmount14 == null && other.getPeriodAmount14() == null || this.periodAmount14 != null && this.periodAmount14.equals(other.getPeriodAmount14())) && (this.periodAmount15 == null && other.getPeriodAmount15() == null || this.periodAmount15 != null && this.periodAmount15.equals(other.getPeriodAmount15())) && (this.periodAmount16 == null && other.getPeriodAmount16() == null || this.periodAmount16 != null && this.periodAmount16.equals(other.getPeriodAmount16())) && (this.periodAmount17 == null && other.getPeriodAmount17() == null || this.periodAmount17 != null && this.periodAmount17.equals(other.getPeriodAmount17())) && (this.periodAmount18 == null && other.getPeriodAmount18() == null || this.periodAmount18 != null && this.periodAmount18.equals(other.getPeriodAmount18())) && (this.periodAmount19 == null && other.getPeriodAmount19() == null || this.periodAmount19 != null && this.periodAmount19.equals(other.getPeriodAmount19())) && (this.periodAmount20 == null && other.getPeriodAmount20() == null || this.periodAmount20 != null && this.periodAmount20.equals(other.getPeriodAmount20())) && (this.periodAmount21 == null && other.getPeriodAmount21() == null || this.periodAmount21 != null && this.periodAmount21.equals(other.getPeriodAmount21())) && (this.periodAmount22 == null && other.getPeriodAmount22() == null || this.periodAmount22 != null && this.periodAmount22.equals(other.getPeriodAmount22())) && (this.periodAmount23 == null && other.getPeriodAmount23() == null || this.periodAmount23 != null && this.periodAmount23.equals(other.getPeriodAmount23())) && (this.periodAmount24 == null && other.getPeriodAmount24() == null || this.periodAmount24 != null && this.periodAmount24.equals(other.getPeriodAmount24())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getYear() != null) {
            _hashCode += this.getYear().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getBudgetType() != null) {
            _hashCode += this.getBudgetType().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getPeriodAmount1() != null) {
            _hashCode += this.getPeriodAmount1().hashCode();
        }
        if (this.getPeriodAmount2() != null) {
            _hashCode += this.getPeriodAmount2().hashCode();
        }
        if (this.getPeriodAmount3() != null) {
            _hashCode += this.getPeriodAmount3().hashCode();
        }
        if (this.getPeriodAmount4() != null) {
            _hashCode += this.getPeriodAmount4().hashCode();
        }
        if (this.getPeriodAmount5() != null) {
            _hashCode += this.getPeriodAmount5().hashCode();
        }
        if (this.getPeriodAmount6() != null) {
            _hashCode += this.getPeriodAmount6().hashCode();
        }
        if (this.getPeriodAmount7() != null) {
            _hashCode += this.getPeriodAmount7().hashCode();
        }
        if (this.getPeriodAmount8() != null) {
            _hashCode += this.getPeriodAmount8().hashCode();
        }
        if (this.getPeriodAmount9() != null) {
            _hashCode += this.getPeriodAmount9().hashCode();
        }
        if (this.getPeriodAmount10() != null) {
            _hashCode += this.getPeriodAmount10().hashCode();
        }
        if (this.getPeriodAmount11() != null) {
            _hashCode += this.getPeriodAmount11().hashCode();
        }
        if (this.getPeriodAmount12() != null) {
            _hashCode += this.getPeriodAmount12().hashCode();
        }
        if (this.getPeriodAmount13() != null) {
            _hashCode += this.getPeriodAmount13().hashCode();
        }
        if (this.getPeriodAmount14() != null) {
            _hashCode += this.getPeriodAmount14().hashCode();
        }
        if (this.getPeriodAmount15() != null) {
            _hashCode += this.getPeriodAmount15().hashCode();
        }
        if (this.getPeriodAmount16() != null) {
            _hashCode += this.getPeriodAmount16().hashCode();
        }
        if (this.getPeriodAmount17() != null) {
            _hashCode += this.getPeriodAmount17().hashCode();
        }
        if (this.getPeriodAmount18() != null) {
            _hashCode += this.getPeriodAmount18().hashCode();
        }
        if (this.getPeriodAmount19() != null) {
            _hashCode += this.getPeriodAmount19().hashCode();
        }
        if (this.getPeriodAmount20() != null) {
            _hashCode += this.getPeriodAmount20().hashCode();
        }
        if (this.getPeriodAmount21() != null) {
            _hashCode += this.getPeriodAmount21().hashCode();
        }
        if (this.getPeriodAmount22() != null) {
            _hashCode += this.getPeriodAmount22().hashCode();
        }
        if (this.getPeriodAmount23() != null) {
            _hashCode += this.getPeriodAmount23().hashCode();
        }
        if (this.getPeriodAmount24() != null) {
            _hashCode += this.getPeriodAmount24().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "Budget"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "year"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("budgetType");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "budgetType"));
        elemField.setXmlType(new QName("urn:types.financial_2022_1.transactions.webservices.netsuite.com", "BudgetBudgetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount1");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount2");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount3");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount3"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount4");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount4"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount5");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount5"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount6");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount6"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount7");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount7"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount8");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount8"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount9");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount9"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount10");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount10"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount11");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount11"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount12");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount12"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount13");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount13"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount14");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount14"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount15");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount15"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount16");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount16"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount17");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount17"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount18");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount18"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount19");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount19"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount20");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount20"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount21");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount21"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount22");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount22"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount23");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount23"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodAmount24");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "periodAmount24"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:financial_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

