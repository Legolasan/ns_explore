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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class GetAllRecordType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _budgetCategory = "budgetCategory";
    public static final String _campaignAudience = "campaignAudience";
    public static final String _campaignCategory = "campaignCategory";
    public static final String _campaignChannel = "campaignChannel";
    public static final String _campaignFamily = "campaignFamily";
    public static final String _campaignOffer = "campaignOffer";
    public static final String _campaignSearchEngine = "campaignSearchEngine";
    public static final String _campaignSubscription = "campaignSubscription";
    public static final String _campaignVertical = "campaignVertical";
    public static final String _currency = "currency";
    public static final String _leadSource = "leadSource";
    public static final String _state = "state";
    public static final String _supportCaseIssue = "supportCaseIssue";
    public static final String _supportCaseOrigin = "supportCaseOrigin";
    public static final String _supportCasePriority = "supportCasePriority";
    public static final String _supportCaseStatus = "supportCaseStatus";
    public static final String _supportCaseType = "supportCaseType";
    public static final String _taxAcct = "taxAcct";
    public static final GetAllRecordType budgetCategory = new GetAllRecordType("budgetCategory");
    public static final GetAllRecordType campaignAudience = new GetAllRecordType("campaignAudience");
    public static final GetAllRecordType campaignCategory = new GetAllRecordType("campaignCategory");
    public static final GetAllRecordType campaignChannel = new GetAllRecordType("campaignChannel");
    public static final GetAllRecordType campaignFamily = new GetAllRecordType("campaignFamily");
    public static final GetAllRecordType campaignOffer = new GetAllRecordType("campaignOffer");
    public static final GetAllRecordType campaignSearchEngine = new GetAllRecordType("campaignSearchEngine");
    public static final GetAllRecordType campaignSubscription = new GetAllRecordType("campaignSubscription");
    public static final GetAllRecordType campaignVertical = new GetAllRecordType("campaignVertical");
    public static final GetAllRecordType currency = new GetAllRecordType("currency");
    public static final GetAllRecordType leadSource = new GetAllRecordType("leadSource");
    public static final GetAllRecordType state = new GetAllRecordType("state");
    public static final GetAllRecordType supportCaseIssue = new GetAllRecordType("supportCaseIssue");
    public static final GetAllRecordType supportCaseOrigin = new GetAllRecordType("supportCaseOrigin");
    public static final GetAllRecordType supportCasePriority = new GetAllRecordType("supportCasePriority");
    public static final GetAllRecordType supportCaseStatus = new GetAllRecordType("supportCaseStatus");
    public static final GetAllRecordType supportCaseType = new GetAllRecordType("supportCaseType");
    public static final GetAllRecordType taxAcct = new GetAllRecordType("taxAcct");
    private static TypeDesc typeDesc = new TypeDesc(GetAllRecordType.class);

    protected GetAllRecordType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static GetAllRecordType fromValue(String value) throws IllegalArgumentException {
        GetAllRecordType enumeration = (GetAllRecordType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static GetAllRecordType fromString(String value) throws IllegalArgumentException {
        return GetAllRecordType.fromValue(value);
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
        return GetAllRecordType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "GetAllRecordType"));
    }
}

