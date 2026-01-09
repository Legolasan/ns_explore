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

import com.netsuite.suitetalk.proxy.v2022_1.lists.support.types.IssueRelationship;
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

public class IssueRelatedIssues
implements Serializable {
    private IssueRelationship relationship;
    private RecordRef issueNumber;
    private String relationshipComment;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(IssueRelatedIssues.class, true);

    public IssueRelatedIssues() {
    }

    public IssueRelatedIssues(IssueRelationship relationship, RecordRef issueNumber, String relationshipComment) {
        this.relationship = relationship;
        this.issueNumber = issueNumber;
        this.relationshipComment = relationshipComment;
    }

    public IssueRelationship getRelationship() {
        return this.relationship;
    }

    public void setRelationship(IssueRelationship relationship) {
        this.relationship = relationship;
    }

    public RecordRef getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(RecordRef issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getRelationshipComment() {
        return this.relationshipComment;
    }

    public void setRelationshipComment(String relationshipComment) {
        this.relationshipComment = relationshipComment;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof IssueRelatedIssues)) {
            return false;
        }
        IssueRelatedIssues other = (IssueRelatedIssues)obj;
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
        boolean _equals = (this.relationship == null && other.getRelationship() == null || this.relationship != null && this.relationship.equals(other.getRelationship())) && (this.issueNumber == null && other.getIssueNumber() == null || this.issueNumber != null && this.issueNumber.equals(other.getIssueNumber())) && (this.relationshipComment == null && other.getRelationshipComment() == null || this.relationshipComment != null && this.relationshipComment.equals(other.getRelationshipComment()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRelationship() != null) {
            _hashCode += this.getRelationship().hashCode();
        }
        if (this.getIssueNumber() != null) {
            _hashCode += this.getIssueNumber().hashCode();
        }
        if (this.getRelationshipComment() != null) {
            _hashCode += this.getRelationshipComment().hashCode();
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueRelatedIssues"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new QName("urn:types.support_2022_1.lists.webservices.netsuite.com", "IssueRelationship"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

