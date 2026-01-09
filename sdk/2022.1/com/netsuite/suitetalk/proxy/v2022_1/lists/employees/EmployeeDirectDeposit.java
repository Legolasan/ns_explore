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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeDirectDepositAccountStatus;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EmployeeDirectDeposit
implements Serializable {
    private Long id;
    private Boolean netAccount;
    private Boolean savingsAccount;
    private Boolean accountPrenoted;
    private EmployeeDirectDepositAccountStatus accountStatus;
    private String bankName;
    private String bankId;
    private String bankNumber;
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private Double amount;
    private Boolean inactive;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeDirectDeposit.class, true);

    public EmployeeDirectDeposit() {
    }

    public EmployeeDirectDeposit(Long id, Boolean netAccount, Boolean savingsAccount, Boolean accountPrenoted, EmployeeDirectDepositAccountStatus accountStatus, String bankName, String bankId, String bankNumber, String bankRoutingNumber, String bankAccountNumber, Double amount, Boolean inactive) {
        this.id = id;
        this.netAccount = netAccount;
        this.savingsAccount = savingsAccount;
        this.accountPrenoted = accountPrenoted;
        this.accountStatus = accountStatus;
        this.bankName = bankName;
        this.bankId = bankId;
        this.bankNumber = bankNumber;
        this.bankRoutingNumber = bankRoutingNumber;
        this.bankAccountNumber = bankAccountNumber;
        this.amount = amount;
        this.inactive = inactive;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getNetAccount() {
        return this.netAccount;
    }

    public void setNetAccount(Boolean netAccount) {
        this.netAccount = netAccount;
    }

    public Boolean getSavingsAccount() {
        return this.savingsAccount;
    }

    public void setSavingsAccount(Boolean savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public Boolean getAccountPrenoted() {
        return this.accountPrenoted;
    }

    public void setAccountPrenoted(Boolean accountPrenoted) {
        this.accountPrenoted = accountPrenoted;
    }

    public EmployeeDirectDepositAccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public void setAccountStatus(EmployeeDirectDepositAccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankId() {
        return this.bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getBankRoutingNumber() {
        return this.bankRoutingNumber;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getInactive() {
        return this.inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeDirectDeposit)) {
            return false;
        }
        EmployeeDirectDeposit other = (EmployeeDirectDeposit)obj;
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
        boolean _equals = (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.netAccount == null && other.getNetAccount() == null || this.netAccount != null && this.netAccount.equals(other.getNetAccount())) && (this.savingsAccount == null && other.getSavingsAccount() == null || this.savingsAccount != null && this.savingsAccount.equals(other.getSavingsAccount())) && (this.accountPrenoted == null && other.getAccountPrenoted() == null || this.accountPrenoted != null && this.accountPrenoted.equals(other.getAccountPrenoted())) && (this.accountStatus == null && other.getAccountStatus() == null || this.accountStatus != null && this.accountStatus.equals(other.getAccountStatus())) && (this.bankName == null && other.getBankName() == null || this.bankName != null && this.bankName.equals(other.getBankName())) && (this.bankId == null && other.getBankId() == null || this.bankId != null && this.bankId.equals(other.getBankId())) && (this.bankNumber == null && other.getBankNumber() == null || this.bankNumber != null && this.bankNumber.equals(other.getBankNumber())) && (this.bankRoutingNumber == null && other.getBankRoutingNumber() == null || this.bankRoutingNumber != null && this.bankRoutingNumber.equals(other.getBankRoutingNumber())) && (this.bankAccountNumber == null && other.getBankAccountNumber() == null || this.bankAccountNumber != null && this.bankAccountNumber.equals(other.getBankAccountNumber())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getNetAccount() != null) {
            _hashCode += this.getNetAccount().hashCode();
        }
        if (this.getSavingsAccount() != null) {
            _hashCode += this.getSavingsAccount().hashCode();
        }
        if (this.getAccountPrenoted() != null) {
            _hashCode += this.getAccountPrenoted().hashCode();
        }
        if (this.getAccountStatus() != null) {
            _hashCode += this.getAccountStatus().hashCode();
        }
        if (this.getBankName() != null) {
            _hashCode += this.getBankName().hashCode();
        }
        if (this.getBankId() != null) {
            _hashCode += this.getBankId().hashCode();
        }
        if (this.getBankNumber() != null) {
            _hashCode += this.getBankNumber().hashCode();
        }
        if (this.getBankRoutingNumber() != null) {
            _hashCode += this.getBankRoutingNumber().hashCode();
        }
        if (this.getBankAccountNumber() != null) {
            _hashCode += this.getBankAccountNumber().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeDirectDeposit"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAccount");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "netAccount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("savingsAccount");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "savingsAccount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountPrenoted");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accountPrenoted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountStatus");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accountStatus"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeDirectDepositAccountStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bankName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankId");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bankId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bankNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankRoutingNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bankRoutingNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankAccountNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bankAccountNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

