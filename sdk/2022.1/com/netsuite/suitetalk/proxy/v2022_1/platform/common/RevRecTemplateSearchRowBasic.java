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

public class RevRecTemplateSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] amorMethod;
    private SearchColumnStringField[] amorPeriod;
    private SearchColumnStringField[] amorStartOffset;
    private SearchColumnStringField[] amorTermSrc;
    private SearchColumnStringField[] amorType;
    private SearchColumnStringField[] contraAccount;
    private SearchColumnStringField[] deferralAccount;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] isInactive;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] periodOffset;
    private SearchColumnStringField[] targetAccount;
    private SearchColumnBooleanField[] useForeignAmounts;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecTemplateSearchRowBasic.class, true);

    public RevRecTemplateSearchRowBasic() {
    }

    public RevRecTemplateSearchRowBasic(SearchColumnStringField[] amorMethod, SearchColumnStringField[] amorPeriod, SearchColumnStringField[] amorStartOffset, SearchColumnStringField[] amorTermSrc, SearchColumnStringField[] amorType, SearchColumnStringField[] contraAccount, SearchColumnStringField[] deferralAccount, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnStringField[] isInactive, SearchColumnStringField[] name, SearchColumnStringField[] periodOffset, SearchColumnStringField[] targetAccount, SearchColumnBooleanField[] useForeignAmounts) {
        this.amorMethod = amorMethod;
        this.amorPeriod = amorPeriod;
        this.amorStartOffset = amorStartOffset;
        this.amorTermSrc = amorTermSrc;
        this.amorType = amorType;
        this.contraAccount = contraAccount;
        this.deferralAccount = deferralAccount;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.name = name;
        this.periodOffset = periodOffset;
        this.targetAccount = targetAccount;
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchColumnStringField[] getAmorMethod() {
        return this.amorMethod;
    }

    public void setAmorMethod(SearchColumnStringField[] amorMethod) {
        this.amorMethod = amorMethod;
    }

    public SearchColumnStringField getAmorMethod(int i) {
        return this.amorMethod[i];
    }

    public void setAmorMethod(int i, SearchColumnStringField _value) {
        this.amorMethod[i] = _value;
    }

    public SearchColumnStringField[] getAmorPeriod() {
        return this.amorPeriod;
    }

    public void setAmorPeriod(SearchColumnStringField[] amorPeriod) {
        this.amorPeriod = amorPeriod;
    }

    public SearchColumnStringField getAmorPeriod(int i) {
        return this.amorPeriod[i];
    }

    public void setAmorPeriod(int i, SearchColumnStringField _value) {
        this.amorPeriod[i] = _value;
    }

    public SearchColumnStringField[] getAmorStartOffset() {
        return this.amorStartOffset;
    }

    public void setAmorStartOffset(SearchColumnStringField[] amorStartOffset) {
        this.amorStartOffset = amorStartOffset;
    }

    public SearchColumnStringField getAmorStartOffset(int i) {
        return this.amorStartOffset[i];
    }

    public void setAmorStartOffset(int i, SearchColumnStringField _value) {
        this.amorStartOffset[i] = _value;
    }

    public SearchColumnStringField[] getAmorTermSrc() {
        return this.amorTermSrc;
    }

    public void setAmorTermSrc(SearchColumnStringField[] amorTermSrc) {
        this.amorTermSrc = amorTermSrc;
    }

    public SearchColumnStringField getAmorTermSrc(int i) {
        return this.amorTermSrc[i];
    }

    public void setAmorTermSrc(int i, SearchColumnStringField _value) {
        this.amorTermSrc[i] = _value;
    }

    public SearchColumnStringField[] getAmorType() {
        return this.amorType;
    }

    public void setAmorType(SearchColumnStringField[] amorType) {
        this.amorType = amorType;
    }

    public SearchColumnStringField getAmorType(int i) {
        return this.amorType[i];
    }

    public void setAmorType(int i, SearchColumnStringField _value) {
        this.amorType[i] = _value;
    }

    public SearchColumnStringField[] getContraAccount() {
        return this.contraAccount;
    }

    public void setContraAccount(SearchColumnStringField[] contraAccount) {
        this.contraAccount = contraAccount;
    }

    public SearchColumnStringField getContraAccount(int i) {
        return this.contraAccount[i];
    }

    public void setContraAccount(int i, SearchColumnStringField _value) {
        this.contraAccount[i] = _value;
    }

    public SearchColumnStringField[] getDeferralAccount() {
        return this.deferralAccount;
    }

    public void setDeferralAccount(SearchColumnStringField[] deferralAccount) {
        this.deferralAccount = deferralAccount;
    }

    public SearchColumnStringField getDeferralAccount(int i) {
        return this.deferralAccount[i];
    }

    public void setDeferralAccount(int i, SearchColumnStringField _value) {
        this.deferralAccount[i] = _value;
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

    public SearchColumnStringField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnStringField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnStringField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnStringField _value) {
        this.isInactive[i] = _value;
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

    public SearchColumnStringField[] getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(SearchColumnStringField[] periodOffset) {
        this.periodOffset = periodOffset;
    }

    public SearchColumnStringField getPeriodOffset(int i) {
        return this.periodOffset[i];
    }

    public void setPeriodOffset(int i, SearchColumnStringField _value) {
        this.periodOffset[i] = _value;
    }

    public SearchColumnStringField[] getTargetAccount() {
        return this.targetAccount;
    }

    public void setTargetAccount(SearchColumnStringField[] targetAccount) {
        this.targetAccount = targetAccount;
    }

    public SearchColumnStringField getTargetAccount(int i) {
        return this.targetAccount[i];
    }

    public void setTargetAccount(int i, SearchColumnStringField _value) {
        this.targetAccount[i] = _value;
    }

    public SearchColumnBooleanField[] getUseForeignAmounts() {
        return this.useForeignAmounts;
    }

    public void setUseForeignAmounts(SearchColumnBooleanField[] useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchColumnBooleanField getUseForeignAmounts(int i) {
        return this.useForeignAmounts[i];
    }

    public void setUseForeignAmounts(int i, SearchColumnBooleanField _value) {
        this.useForeignAmounts[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RevRecTemplateSearchRowBasic)) {
            return false;
        }
        RevRecTemplateSearchRowBasic other = (RevRecTemplateSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amorMethod == null && other.getAmorMethod() == null || this.amorMethod != null && Arrays.equals(this.amorMethod, other.getAmorMethod())) && (this.amorPeriod == null && other.getAmorPeriod() == null || this.amorPeriod != null && Arrays.equals(this.amorPeriod, other.getAmorPeriod())) && (this.amorStartOffset == null && other.getAmorStartOffset() == null || this.amorStartOffset != null && Arrays.equals(this.amorStartOffset, other.getAmorStartOffset())) && (this.amorTermSrc == null && other.getAmorTermSrc() == null || this.amorTermSrc != null && Arrays.equals(this.amorTermSrc, other.getAmorTermSrc())) && (this.amorType == null && other.getAmorType() == null || this.amorType != null && Arrays.equals(this.amorType, other.getAmorType())) && (this.contraAccount == null && other.getContraAccount() == null || this.contraAccount != null && Arrays.equals(this.contraAccount, other.getContraAccount())) && (this.deferralAccount == null && other.getDeferralAccount() == null || this.deferralAccount != null && Arrays.equals(this.deferralAccount, other.getDeferralAccount())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && Arrays.equals(this.periodOffset, other.getPeriodOffset())) && (this.targetAccount == null && other.getTargetAccount() == null || this.targetAccount != null && Arrays.equals(this.targetAccount, other.getTargetAccount())) && (this.useForeignAmounts == null && other.getUseForeignAmounts() == null || this.useForeignAmounts != null && Arrays.equals(this.useForeignAmounts, other.getUseForeignAmounts()));
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
        if (this.getAmorMethod() != null) {
            for (i = 0; i < Array.getLength(this.getAmorMethod()); ++i) {
                obj = Array.get(this.getAmorMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getAmorPeriod()); ++i) {
                obj = Array.get(this.getAmorPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorStartOffset() != null) {
            for (i = 0; i < Array.getLength(this.getAmorStartOffset()); ++i) {
                obj = Array.get(this.getAmorStartOffset(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorTermSrc() != null) {
            for (i = 0; i < Array.getLength(this.getAmorTermSrc()); ++i) {
                obj = Array.get(this.getAmorTermSrc(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmorType() != null) {
            for (i = 0; i < Array.getLength(this.getAmorType()); ++i) {
                obj = Array.get(this.getAmorType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContraAccount() != null) {
            for (i = 0; i < Array.getLength(this.getContraAccount()); ++i) {
                obj = Array.get(this.getContraAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferralAccount() != null) {
            for (i = 0; i < Array.getLength(this.getDeferralAccount()); ++i) {
                obj = Array.get(this.getDeferralAccount(), i);
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
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodOffset() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodOffset()); ++i) {
                obj = Array.get(this.getPeriodOffset(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTargetAccount() != null) {
            for (i = 0; i < Array.getLength(this.getTargetAccount()); ++i) {
                obj = Array.get(this.getTargetAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseForeignAmounts() != null) {
            for (i = 0; i < Array.getLength(this.getUseForeignAmounts()); ++i) {
                obj = Array.get(this.getUseForeignAmounts(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecTemplateSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amorMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorStartOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorStartOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorTermSrc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorTermSrc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contraAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contraAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferralAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "targetAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

