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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PhoneCallSearchRow
extends SearchRow
implements Serializable {
    private PhoneCallSearchRowBasic basic;
    private SupportCaseSearchRowBasic caseJoin;
    private CustomerSearchRowBasic companyCustomerJoin;
    private ContactSearchRowBasic contactJoin;
    private EmployeeSearchRowBasic employeeJoin;
    private FileSearchRowBasic fileJoin;
    private OpportunitySearchRowBasic opportunityJoin;
    private OriginatingLeadSearchRowBasic originatingLeadJoin;
    private EntitySearchRowBasic participantJoin;
    private TransactionSearchRowBasic transactionJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PhoneCallSearchRow.class, true);

    public PhoneCallSearchRow() {
    }

    public PhoneCallSearchRow(PhoneCallSearchRowBasic basic, SupportCaseSearchRowBasic caseJoin, CustomerSearchRowBasic companyCustomerJoin, ContactSearchRowBasic contactJoin, EmployeeSearchRowBasic employeeJoin, FileSearchRowBasic fileJoin, OpportunitySearchRowBasic opportunityJoin, OriginatingLeadSearchRowBasic originatingLeadJoin, EntitySearchRowBasic participantJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.companyCustomerJoin = companyCustomerJoin;
        this.contactJoin = contactJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.participantJoin = participantJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public PhoneCallSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(PhoneCallSearchRowBasic basic) {
        this.basic = basic;
    }

    public SupportCaseSearchRowBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public CustomerSearchRowBasic getCompanyCustomerJoin() {
        return this.companyCustomerJoin;
    }

    public void setCompanyCustomerJoin(CustomerSearchRowBasic companyCustomerJoin) {
        this.companyCustomerJoin = companyCustomerJoin;
    }

    public ContactSearchRowBasic getContactJoin() {
        return this.contactJoin;
    }

    public void setContactJoin(ContactSearchRowBasic contactJoin) {
        this.contactJoin = contactJoin;
    }

    public EmployeeSearchRowBasic getEmployeeJoin() {
        return this.employeeJoin;
    }

    public void setEmployeeJoin(EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }

    public FileSearchRowBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public OpportunitySearchRowBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return this.originatingLeadJoin;
    }

    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }

    public EntitySearchRowBasic getParticipantJoin() {
        return this.participantJoin;
    }

    public void setParticipantJoin(EntitySearchRowBasic participantJoin) {
        this.participantJoin = participantJoin;
    }

    public TransactionSearchRowBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public EmployeeSearchRowBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    public NoteSearchRowBasic getUserNotesJoin() {
        return this.userNotesJoin;
    }

    public void setUserNotesJoin(NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    public CustomSearchRowBasic[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PhoneCallSearchRow)) {
            return false;
        }
        PhoneCallSearchRow other = (PhoneCallSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.companyCustomerJoin == null && other.getCompanyCustomerJoin() == null || this.companyCustomerJoin != null && this.companyCustomerJoin.equals(other.getCompanyCustomerJoin())) && (this.contactJoin == null && other.getContactJoin() == null || this.contactJoin != null && this.contactJoin.equals(other.getContactJoin())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.originatingLeadJoin == null && other.getOriginatingLeadJoin() == null || this.originatingLeadJoin != null && this.originatingLeadJoin.equals(other.getOriginatingLeadJoin())) && (this.participantJoin == null && other.getParticipantJoin() == null || this.participantJoin != null && this.participantJoin.equals(other.getParticipantJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getCaseJoin() != null) {
            _hashCode += this.getCaseJoin().hashCode();
        }
        if (this.getCompanyCustomerJoin() != null) {
            _hashCode += this.getCompanyCustomerJoin().hashCode();
        }
        if (this.getContactJoin() != null) {
            _hashCode += this.getContactJoin().hashCode();
        }
        if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
        }
        if (this.getOriginatingLeadJoin() != null) {
            _hashCode += this.getOriginatingLeadJoin().hashCode();
        }
        if (this.getParticipantJoin() != null) {
            _hashCode += this.getParticipantJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
        }
        if (this.getCustomSearchJoin() != null) {
            for (int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
                Object obj = Array.get(this.getCustomSearchJoin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "PhoneCallSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyCustomerJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "companyCustomerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("participantJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "participantJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

