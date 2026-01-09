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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
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

public class BillingScheduleSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnBooleanField[] applyToSubtotal;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] frequency;
    private SearchColumnBooleanField[] inArrears;
    private SearchColumnStringField[] initialAmount;
    private SearchColumnStringField[] initialTerms;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isPublic;
    private SearchColumnStringField[] name;
    private SearchColumnLongField[] recurrenceCount;
    private SearchColumnEnumSelectField[] recurrencePattern;
    private SearchColumnStringField[] recurrenceTerms;
    private SearchColumnLongField[] repeatEvery;
    private SearchColumnEnumSelectField[] type;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleSearchRowBasic.class, true);

    public BillingScheduleSearchRowBasic() {
    }

    public BillingScheduleSearchRowBasic(SearchColumnBooleanField[] applyToSubtotal, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] frequency, SearchColumnBooleanField[] inArrears, SearchColumnStringField[] initialAmount, SearchColumnStringField[] initialTerms, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isPublic, SearchColumnStringField[] name, SearchColumnLongField[] recurrenceCount, SearchColumnEnumSelectField[] recurrencePattern, SearchColumnStringField[] recurrenceTerms, SearchColumnLongField[] repeatEvery, SearchColumnEnumSelectField[] type) {
        this.applyToSubtotal = applyToSubtotal;
        this.externalId = externalId;
        this.frequency = frequency;
        this.inArrears = inArrears;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isPublic = isPublic;
        this.name = name;
        this.recurrenceCount = recurrenceCount;
        this.recurrencePattern = recurrencePattern;
        this.recurrenceTerms = recurrenceTerms;
        this.repeatEvery = repeatEvery;
        this.type = type;
    }

    public SearchColumnBooleanField[] getApplyToSubtotal() {
        return this.applyToSubtotal;
    }

    public void setApplyToSubtotal(SearchColumnBooleanField[] applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
    }

    public SearchColumnBooleanField getApplyToSubtotal(int i) {
        return this.applyToSubtotal[i];
    }

    public void setApplyToSubtotal(int i, SearchColumnBooleanField _value) {
        this.applyToSubtotal[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnEnumSelectField[] getFrequency() {
        return this.frequency;
    }

    public void setFrequency(SearchColumnEnumSelectField[] frequency) {
        this.frequency = frequency;
    }

    public SearchColumnEnumSelectField getFrequency(int i) {
        return this.frequency[i];
    }

    public void setFrequency(int i, SearchColumnEnumSelectField _value) {
        this.frequency[i] = _value;
    }

    public SearchColumnBooleanField[] getInArrears() {
        return this.inArrears;
    }

    public void setInArrears(SearchColumnBooleanField[] inArrears) {
        this.inArrears = inArrears;
    }

    public SearchColumnBooleanField getInArrears(int i) {
        return this.inArrears[i];
    }

    public void setInArrears(int i, SearchColumnBooleanField _value) {
        this.inArrears[i] = _value;
    }

    public SearchColumnStringField[] getInitialAmount() {
        return this.initialAmount;
    }

    public void setInitialAmount(SearchColumnStringField[] initialAmount) {
        this.initialAmount = initialAmount;
    }

    public SearchColumnStringField getInitialAmount(int i) {
        return this.initialAmount[i];
    }

    public void setInitialAmount(int i, SearchColumnStringField _value) {
        this.initialAmount[i] = _value;
    }

    public SearchColumnStringField[] getInitialTerms() {
        return this.initialTerms;
    }

    public void setInitialTerms(SearchColumnStringField[] initialTerms) {
        this.initialTerms = initialTerms;
    }

    public SearchColumnStringField getInitialTerms(int i) {
        return this.initialTerms[i];
    }

    public void setInitialTerms(int i, SearchColumnStringField _value) {
        this.initialTerms[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsPublic() {
        return this.isPublic;
    }

    public void setIsPublic(SearchColumnBooleanField[] isPublic) {
        this.isPublic = isPublic;
    }

    public SearchColumnBooleanField getIsPublic(int i) {
        return this.isPublic[i];
    }

    public void setIsPublic(int i, SearchColumnBooleanField _value) {
        this.isPublic[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnLongField[] getRecurrenceCount() {
        return this.recurrenceCount;
    }

    public void setRecurrenceCount(SearchColumnLongField[] recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
    }

    public SearchColumnLongField getRecurrenceCount(int i) {
        return this.recurrenceCount[i];
    }

    public void setRecurrenceCount(int i, SearchColumnLongField _value) {
        this.recurrenceCount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRecurrencePattern() {
        return this.recurrencePattern;
    }

    public void setRecurrencePattern(SearchColumnEnumSelectField[] recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public SearchColumnEnumSelectField getRecurrencePattern(int i) {
        return this.recurrencePattern[i];
    }

    public void setRecurrencePattern(int i, SearchColumnEnumSelectField _value) {
        this.recurrencePattern[i] = _value;
    }

    public SearchColumnStringField[] getRecurrenceTerms() {
        return this.recurrenceTerms;
    }

    public void setRecurrenceTerms(SearchColumnStringField[] recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }

    public SearchColumnStringField getRecurrenceTerms(int i) {
        return this.recurrenceTerms[i];
    }

    public void setRecurrenceTerms(int i, SearchColumnStringField _value) {
        this.recurrenceTerms[i] = _value;
    }

    public SearchColumnLongField[] getRepeatEvery() {
        return this.repeatEvery;
    }

    public void setRepeatEvery(SearchColumnLongField[] repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public SearchColumnLongField getRepeatEvery(int i) {
        return this.repeatEvery[i];
    }

    public void setRepeatEvery(int i, SearchColumnLongField _value) {
        this.repeatEvery[i] = _value;
    }

    public SearchColumnEnumSelectField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingScheduleSearchRowBasic)) {
            return false;
        }
        BillingScheduleSearchRowBasic other = (BillingScheduleSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.applyToSubtotal == null && other.getApplyToSubtotal() == null || this.applyToSubtotal != null && Arrays.equals(this.applyToSubtotal, other.getApplyToSubtotal())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.frequency == null && other.getFrequency() == null || this.frequency != null && Arrays.equals(this.frequency, other.getFrequency())) && (this.inArrears == null && other.getInArrears() == null || this.inArrears != null && Arrays.equals(this.inArrears, other.getInArrears())) && (this.initialAmount == null && other.getInitialAmount() == null || this.initialAmount != null && Arrays.equals(this.initialAmount, other.getInitialAmount())) && (this.initialTerms == null && other.getInitialTerms() == null || this.initialTerms != null && Arrays.equals(this.initialTerms, other.getInitialTerms())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isPublic == null && other.getIsPublic() == null || this.isPublic != null && Arrays.equals(this.isPublic, other.getIsPublic())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.recurrenceCount == null && other.getRecurrenceCount() == null || this.recurrenceCount != null && Arrays.equals(this.recurrenceCount, other.getRecurrenceCount())) && (this.recurrencePattern == null && other.getRecurrencePattern() == null || this.recurrencePattern != null && Arrays.equals(this.recurrencePattern, other.getRecurrencePattern())) && (this.recurrenceTerms == null && other.getRecurrenceTerms() == null || this.recurrenceTerms != null && Arrays.equals(this.recurrenceTerms, other.getRecurrenceTerms())) && (this.repeatEvery == null && other.getRepeatEvery() == null || this.repeatEvery != null && Arrays.equals(this.repeatEvery, other.getRepeatEvery())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getApplyToSubtotal() != null) {
            for (i = 0; i < Array.getLength(this.getApplyToSubtotal()); ++i) {
                obj = Array.get(this.getApplyToSubtotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFrequency() != null) {
            for (i = 0; i < Array.getLength(this.getFrequency()); ++i) {
                obj = Array.get(this.getFrequency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInArrears() != null) {
            for (i = 0; i < Array.getLength(this.getInArrears()); ++i) {
                obj = Array.get(this.getInArrears(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInitialAmount() != null) {
            for (i = 0; i < Array.getLength(this.getInitialAmount()); ++i) {
                obj = Array.get(this.getInitialAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInitialTerms() != null) {
            for (i = 0; i < Array.getLength(this.getInitialTerms()); ++i) {
                obj = Array.get(this.getInitialTerms(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsPublic() != null) {
            for (i = 0; i < Array.getLength(this.getIsPublic()); ++i) {
                obj = Array.get(this.getIsPublic(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurrenceCount() != null) {
            for (i = 0; i < Array.getLength(this.getRecurrenceCount()); ++i) {
                obj = Array.get(this.getRecurrenceCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurrencePattern() != null) {
            for (i = 0; i < Array.getLength(this.getRecurrencePattern()); ++i) {
                obj = Array.get(this.getRecurrencePattern(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurrenceTerms() != null) {
            for (i = 0; i < Array.getLength(this.getRecurrenceTerms()); ++i) {
                obj = Array.get(this.getRecurrenceTerms(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRepeatEvery() != null) {
            for (i = 0; i < Array.getLength(this.getRepeatEvery()); ++i) {
                obj = Array.get(this.getRepeatEvery(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyToSubtotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

