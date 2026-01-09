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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InvoiceTime
implements Serializable {
    private Boolean apply;
    private Long doc;
    private Long line;
    private Calendar billedDate;
    private String employeeDisp;
    private String itemDisp;
    private String jobDisp;
    private String department;
    private String _class;
    private String location;
    private String quantity;
    private Double rate;
    private String unitDisp;
    private Double amount;
    private String memo;
    private Double taxAmount;
    private RecordRef revRecSchedule;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private Double grossAmt;
    private String taxDetailsReference;
    private Double tax1Amt;
    private RecordRef taxCode;
    private Double taxRate1;
    private Double taxRate2;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InvoiceTime.class, true);

    public InvoiceTime() {
    }

    public InvoiceTime(Boolean apply, Long doc, Long line, Calendar billedDate, String employeeDisp, String itemDisp, String jobDisp, String department, String _class, String location, String quantity, Double rate, String unitDisp, Double amount, String memo, Double taxAmount, RecordRef revRecSchedule, Calendar revRecStartDate, Calendar revRecEndDate, Double grossAmt, String taxDetailsReference, Double tax1Amt, RecordRef taxCode, Double taxRate1, Double taxRate2) {
        this.apply = apply;
        this.doc = doc;
        this.line = line;
        this.billedDate = billedDate;
        this.employeeDisp = employeeDisp;
        this.itemDisp = itemDisp;
        this.jobDisp = jobDisp;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.quantity = quantity;
        this.rate = rate;
        this.unitDisp = unitDisp;
        this.amount = amount;
        this.memo = memo;
        this.taxAmount = taxAmount;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.grossAmt = grossAmt;
        this.taxDetailsReference = taxDetailsReference;
        this.tax1Amt = tax1Amt;
        this.taxCode = taxCode;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
    }

    public Boolean getApply() {
        return this.apply;
    }

    public void setApply(Boolean apply) {
        this.apply = apply;
    }

    public Long getDoc() {
        return this.doc;
    }

    public void setDoc(Long doc) {
        this.doc = doc;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Calendar getBilledDate() {
        return this.billedDate;
    }

    public void setBilledDate(Calendar billedDate) {
        this.billedDate = billedDate;
    }

    public String getEmployeeDisp() {
        return this.employeeDisp;
    }

    public void setEmployeeDisp(String employeeDisp) {
        this.employeeDisp = employeeDisp;
    }

    public String getItemDisp() {
        return this.itemDisp;
    }

    public void setItemDisp(String itemDisp) {
        this.itemDisp = itemDisp;
    }

    public String getJobDisp() {
        return this.jobDisp;
    }

    public void setJobDisp(String jobDisp) {
        this.jobDisp = jobDisp;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String get_class() {
        return this._class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getUnitDisp() {
        return this.unitDisp;
    }

    public void setUnitDisp(String unitDisp) {
        this.unitDisp = unitDisp;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public Calendar getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public Calendar getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxRate1() {
        return this.taxRate1;
    }

    public void setTaxRate1(Double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public Double getTaxRate2() {
        return this.taxRate2;
    }

    public void setTaxRate2(Double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoiceTime)) {
            return false;
        }
        InvoiceTime other = (InvoiceTime)obj;
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
        boolean _equals = (this.apply == null && other.getApply() == null || this.apply != null && this.apply.equals(other.getApply())) && (this.doc == null && other.getDoc() == null || this.doc != null && this.doc.equals(other.getDoc())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.billedDate == null && other.getBilledDate() == null || this.billedDate != null && this.billedDate.equals(other.getBilledDate())) && (this.employeeDisp == null && other.getEmployeeDisp() == null || this.employeeDisp != null && this.employeeDisp.equals(other.getEmployeeDisp())) && (this.itemDisp == null && other.getItemDisp() == null || this.itemDisp != null && this.itemDisp.equals(other.getItemDisp())) && (this.jobDisp == null && other.getJobDisp() == null || this.jobDisp != null && this.jobDisp.equals(other.getJobDisp())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.unitDisp == null && other.getUnitDisp() == null || this.unitDisp != null && this.unitDisp.equals(other.getUnitDisp())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getApply() != null) {
            _hashCode += this.getApply().hashCode();
        }
        if (this.getDoc() != null) {
            _hashCode += this.getDoc().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getBilledDate() != null) {
            _hashCode += this.getBilledDate().hashCode();
        }
        if (this.getEmployeeDisp() != null) {
            _hashCode += this.getEmployeeDisp().hashCode();
        }
        if (this.getItemDisp() != null) {
            _hashCode += this.getItemDisp().hashCode();
        }
        if (this.getJobDisp() != null) {
            _hashCode += this.getJobDisp().hashCode();
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
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getUnitDisp() != null) {
            _hashCode += this.getUnitDisp().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
        }
        if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "InvoiceTime"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("doc");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "doc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeDisp");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "employeeDisp"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemDisp");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemDisp"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobDisp");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobDisp"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitDisp");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "unitDisp"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

