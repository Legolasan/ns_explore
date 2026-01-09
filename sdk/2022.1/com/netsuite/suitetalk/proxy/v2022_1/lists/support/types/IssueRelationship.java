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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class IssueRelationship
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __blocks = "_blocks";
    public static final String __dependsOn = "_dependsOn";
    public static final String __duplicatedBy = "_duplicatedBy";
    public static final String __duplicates = "_duplicates";
    public static final String __followedUpBy = "_followedUpBy";
    public static final String __followUpFor = "_followUpFor";
    public static final String __injectedBy = "_injectedBy";
    public static final String __injects = "_injects";
    public static final String __isBlockedBy = "_isBlockedBy";
    public static final String __isRequiredFor = "_isRequiredFor";
    public static final String __relatedTo = "_relatedTo";
    public static final IssueRelationship _blocks = new IssueRelationship("_blocks");
    public static final IssueRelationship _dependsOn = new IssueRelationship("_dependsOn");
    public static final IssueRelationship _duplicatedBy = new IssueRelationship("_duplicatedBy");
    public static final IssueRelationship _duplicates = new IssueRelationship("_duplicates");
    public static final IssueRelationship _followedUpBy = new IssueRelationship("_followedUpBy");
    public static final IssueRelationship _followUpFor = new IssueRelationship("_followUpFor");
    public static final IssueRelationship _injectedBy = new IssueRelationship("_injectedBy");
    public static final IssueRelationship _injects = new IssueRelationship("_injects");
    public static final IssueRelationship _isBlockedBy = new IssueRelationship("_isBlockedBy");
    public static final IssueRelationship _isRequiredFor = new IssueRelationship("_isRequiredFor");
    public static final IssueRelationship _relatedTo = new IssueRelationship("_relatedTo");
    private static TypeDesc typeDesc = new TypeDesc(IssueRelationship.class);

    protected IssueRelationship(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static IssueRelationship fromValue(String value) throws IllegalArgumentException {
        IssueRelationship enumeration = (IssueRelationship)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static IssueRelationship fromString(String value) throws IllegalArgumentException {
        return IssueRelationship.fromValue(value);
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
        return IssueRelationship.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.support_2022_1.lists.webservices.netsuite.com", "IssueRelationship"));
    }
}

