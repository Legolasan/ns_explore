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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntityGroupSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.IssueSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchRowBasic;
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

public class IssueSearchRow
extends SearchRow
implements Serializable {
    private IssueSearchRowBasic basic;
    private SupportCaseSearchRowBasic caseJoin;
    private EmployeeSearchRowBasic employeeJoin;
    private FileSearchRowBasic fileJoin;
    private EntityGroupSearchRowBasic productTeamJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(IssueSearchRow.class, true);

    public IssueSearchRow() {
    }

    public IssueSearchRow(IssueSearchRowBasic basic, SupportCaseSearchRowBasic caseJoin, EmployeeSearchRowBasic employeeJoin, FileSearchRowBasic fileJoin, EntityGroupSearchRowBasic productTeamJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.employeeJoin = employeeJoin;
        this.fileJoin = fileJoin;
        this.productTeamJoin = productTeamJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public IssueSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(IssueSearchRowBasic basic) {
        this.basic = basic;
    }

    public SupportCaseSearchRowBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
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

    public EntityGroupSearchRowBasic getProductTeamJoin() {
        return this.productTeamJoin;
    }

    public void setProductTeamJoin(EntityGroupSearchRowBasic productTeamJoin) {
        this.productTeamJoin = productTeamJoin;
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
        if (!(obj instanceof IssueSearchRow)) {
            return false;
        }
        IssueSearchRow other = (IssueSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.productTeamJoin == null && other.getProductTeamJoin() == null || this.productTeamJoin != null && this.productTeamJoin.equals(other.getProductTeamJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getProductTeamJoin() != null) {
            _hashCode += this.getProductTeamJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "IssueSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productTeamJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "productTeamJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityGroupSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

