/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class AccountType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __accountsPayable = "_accountsPayable";
    public static final String __accountsReceivable = "_accountsReceivable";
    public static final String __bank = "_bank";
    public static final String __costOfGoodsSold = "_costOfGoodsSold";
    public static final String __creditCard = "_creditCard";
    public static final String __deferredExpense = "_deferredExpense";
    public static final String __deferredRevenue = "_deferredRevenue";
    public static final String __equity = "_equity";
    public static final String __expense = "_expense";
    public static final String __fixedAsset = "_fixedAsset";
    public static final String __income = "_income";
    public static final String __longTermLiability = "_longTermLiability";
    public static final String __nonPosting = "_nonPosting";
    public static final String __otherAsset = "_otherAsset";
    public static final String __otherCurrentAsset = "_otherCurrentAsset";
    public static final String __otherCurrentLiability = "_otherCurrentLiability";
    public static final String __otherExpense = "_otherExpense";
    public static final String __otherIncome = "_otherIncome";
    public static final String __statistical = "_statistical";
    public static final String __unbilledReceivable = "_unbilledReceivable";
    public static final AccountType _accountsPayable = new AccountType("_accountsPayable");
    public static final AccountType _accountsReceivable = new AccountType("_accountsReceivable");
    public static final AccountType _bank = new AccountType("_bank");
    public static final AccountType _costOfGoodsSold = new AccountType("_costOfGoodsSold");
    public static final AccountType _creditCard = new AccountType("_creditCard");
    public static final AccountType _deferredExpense = new AccountType("_deferredExpense");
    public static final AccountType _deferredRevenue = new AccountType("_deferredRevenue");
    public static final AccountType _equity = new AccountType("_equity");
    public static final AccountType _expense = new AccountType("_expense");
    public static final AccountType _fixedAsset = new AccountType("_fixedAsset");
    public static final AccountType _income = new AccountType("_income");
    public static final AccountType _longTermLiability = new AccountType("_longTermLiability");
    public static final AccountType _nonPosting = new AccountType("_nonPosting");
    public static final AccountType _otherAsset = new AccountType("_otherAsset");
    public static final AccountType _otherCurrentAsset = new AccountType("_otherCurrentAsset");
    public static final AccountType _otherCurrentLiability = new AccountType("_otherCurrentLiability");
    public static final AccountType _otherExpense = new AccountType("_otherExpense");
    public static final AccountType _otherIncome = new AccountType("_otherIncome");
    public static final AccountType _statistical = new AccountType("_statistical");
    public static final AccountType _unbilledReceivable = new AccountType("_unbilledReceivable");
    private static TypeDesc typeDesc = new TypeDesc(AccountType.class);

    protected AccountType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static AccountType fromValue(String value) throws IllegalArgumentException {
        AccountType enumeration = (AccountType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static AccountType fromString(String value) throws IllegalArgumentException {
        return AccountType.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return AccountType.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "AccountType"));
    }
}

