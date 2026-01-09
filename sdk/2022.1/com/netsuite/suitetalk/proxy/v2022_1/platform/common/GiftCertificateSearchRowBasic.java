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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
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

public class GiftCertificateSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] amountRemaining;
    private SearchColumnDoubleField[] amtAvailBilled;
    private SearchColumnDateField[] createdDate;
    private SearchColumnStringField[] email;
    private SearchColumnDateField[] expirationDate;
    private SearchColumnBooleanField[] gcActive;
    private SearchColumnStringField[] giftCertCode;
    private SearchColumnStringField[] incomeAcct;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] item;
    private SearchColumnStringField[] liabilityAcct;
    private SearchColumnStringField[] message;
    private SearchColumnStringField[] name;
    private SearchColumnDoubleField[] originalAmount;
    private SearchColumnDateField[] purchaseDate;
    private SearchColumnStringField[] sender;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GiftCertificateSearchRowBasic.class, true);

    public GiftCertificateSearchRowBasic() {
    }

    public GiftCertificateSearchRowBasic(SearchColumnDoubleField[] amountRemaining, SearchColumnDoubleField[] amtAvailBilled, SearchColumnDateField[] createdDate, SearchColumnStringField[] email, SearchColumnDateField[] expirationDate, SearchColumnBooleanField[] gcActive, SearchColumnStringField[] giftCertCode, SearchColumnStringField[] incomeAcct, SearchColumnSelectField[] internalId, SearchColumnSelectField[] item, SearchColumnStringField[] liabilityAcct, SearchColumnStringField[] message, SearchColumnStringField[] name, SearchColumnDoubleField[] originalAmount, SearchColumnDateField[] purchaseDate, SearchColumnStringField[] sender, SearchColumnCustomFieldList customFieldList) {
        this.amountRemaining = amountRemaining;
        this.amtAvailBilled = amtAvailBilled;
        this.createdDate = createdDate;
        this.email = email;
        this.expirationDate = expirationDate;
        this.gcActive = gcActive;
        this.giftCertCode = giftCertCode;
        this.incomeAcct = incomeAcct;
        this.internalId = internalId;
        this.item = item;
        this.liabilityAcct = liabilityAcct;
        this.message = message;
        this.name = name;
        this.originalAmount = originalAmount;
        this.purchaseDate = purchaseDate;
        this.sender = sender;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDoubleField[] getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }

    public SearchColumnDoubleField[] getAmtAvailBilled() {
        return this.amtAvailBilled;
    }

    public void setAmtAvailBilled(SearchColumnDoubleField[] amtAvailBilled) {
        this.amtAvailBilled = amtAvailBilled;
    }

    public SearchColumnDoubleField getAmtAvailBilled(int i) {
        return this.amtAvailBilled[i];
    }

    public void setAmtAvailBilled(int i, SearchColumnDoubleField _value) {
        this.amtAvailBilled[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }

    public SearchColumnStringField[] getEmail() {
        return this.email;
    }

    public void setEmail(SearchColumnStringField[] email) {
        this.email = email;
    }

    public SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, SearchColumnStringField _value) {
        this.email[i] = _value;
    }

    public SearchColumnDateField[] getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(SearchColumnDateField[] expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SearchColumnDateField getExpirationDate(int i) {
        return this.expirationDate[i];
    }

    public void setExpirationDate(int i, SearchColumnDateField _value) {
        this.expirationDate[i] = _value;
    }

    public SearchColumnBooleanField[] getGcActive() {
        return this.gcActive;
    }

    public void setGcActive(SearchColumnBooleanField[] gcActive) {
        this.gcActive = gcActive;
    }

    public SearchColumnBooleanField getGcActive(int i) {
        return this.gcActive[i];
    }

    public void setGcActive(int i, SearchColumnBooleanField _value) {
        this.gcActive[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertCode() {
        return this.giftCertCode;
    }

    public void setGiftCertCode(SearchColumnStringField[] giftCertCode) {
        this.giftCertCode = giftCertCode;
    }

    public SearchColumnStringField getGiftCertCode(int i) {
        return this.giftCertCode[i];
    }

    public void setGiftCertCode(int i, SearchColumnStringField _value) {
        this.giftCertCode[i] = _value;
    }

    public SearchColumnStringField[] getIncomeAcct() {
        return this.incomeAcct;
    }

    public void setIncomeAcct(SearchColumnStringField[] incomeAcct) {
        this.incomeAcct = incomeAcct;
    }

    public SearchColumnStringField getIncomeAcct(int i) {
        return this.incomeAcct[i];
    }

    public void setIncomeAcct(int i, SearchColumnStringField _value) {
        this.incomeAcct[i] = _value;
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

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
    }

    public SearchColumnStringField[] getLiabilityAcct() {
        return this.liabilityAcct;
    }

    public void setLiabilityAcct(SearchColumnStringField[] liabilityAcct) {
        this.liabilityAcct = liabilityAcct;
    }

    public SearchColumnStringField getLiabilityAcct(int i) {
        return this.liabilityAcct[i];
    }

    public void setLiabilityAcct(int i, SearchColumnStringField _value) {
        this.liabilityAcct[i] = _value;
    }

    public SearchColumnStringField[] getMessage() {
        return this.message;
    }

    public void setMessage(SearchColumnStringField[] message) {
        this.message = message;
    }

    public SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, SearchColumnStringField _value) {
        this.message[i] = _value;
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

    public SearchColumnDoubleField[] getOriginalAmount() {
        return this.originalAmount;
    }

    public void setOriginalAmount(SearchColumnDoubleField[] originalAmount) {
        this.originalAmount = originalAmount;
    }

    public SearchColumnDoubleField getOriginalAmount(int i) {
        return this.originalAmount[i];
    }

    public void setOriginalAmount(int i, SearchColumnDoubleField _value) {
        this.originalAmount[i] = _value;
    }

    public SearchColumnDateField[] getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(SearchColumnDateField[] purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public SearchColumnDateField getPurchaseDate(int i) {
        return this.purchaseDate[i];
    }

    public void setPurchaseDate(int i, SearchColumnDateField _value) {
        this.purchaseDate[i] = _value;
    }

    public SearchColumnStringField[] getSender() {
        return this.sender;
    }

    public void setSender(SearchColumnStringField[] sender) {
        this.sender = sender;
    }

    public SearchColumnStringField getSender(int i) {
        return this.sender[i];
    }

    public void setSender(int i, SearchColumnStringField _value) {
        this.sender[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GiftCertificateSearchRowBasic)) {
            return false;
        }
        GiftCertificateSearchRowBasic other = (GiftCertificateSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && Arrays.equals(this.amountRemaining, other.getAmountRemaining())) && (this.amtAvailBilled == null && other.getAmtAvailBilled() == null || this.amtAvailBilled != null && Arrays.equals(this.amtAvailBilled, other.getAmtAvailBilled())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && Arrays.equals(this.expirationDate, other.getExpirationDate())) && (this.gcActive == null && other.getGcActive() == null || this.gcActive != null && Arrays.equals(this.gcActive, other.getGcActive())) && (this.giftCertCode == null && other.getGiftCertCode() == null || this.giftCertCode != null && Arrays.equals(this.giftCertCode, other.getGiftCertCode())) && (this.incomeAcct == null && other.getIncomeAcct() == null || this.incomeAcct != null && Arrays.equals(this.incomeAcct, other.getIncomeAcct())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.liabilityAcct == null && other.getLiabilityAcct() == null || this.liabilityAcct != null && Arrays.equals(this.liabilityAcct, other.getLiabilityAcct())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.originalAmount == null && other.getOriginalAmount() == null || this.originalAmount != null && Arrays.equals(this.originalAmount, other.getOriginalAmount())) && (this.purchaseDate == null && other.getPurchaseDate() == null || this.purchaseDate != null && Arrays.equals(this.purchaseDate, other.getPurchaseDate())) && (this.sender == null && other.getSender() == null || this.sender != null && Arrays.equals(this.sender, other.getSender())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmountRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getAmountRemaining()); ++i) {
                obj = Array.get(this.getAmountRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmtAvailBilled() != null) {
            for (i = 0; i < Array.getLength(this.getAmtAvailBilled()); ++i) {
                obj = Array.get(this.getAmtAvailBilled(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmail() != null) {
            for (i = 0; i < Array.getLength(this.getEmail()); ++i) {
                obj = Array.get(this.getEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpirationDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpirationDate()); ++i) {
                obj = Array.get(this.getExpirationDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcActive() != null) {
            for (i = 0; i < Array.getLength(this.getGcActive()); ++i) {
                obj = Array.get(this.getGcActive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertCode() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertCode()); ++i) {
                obj = Array.get(this.getGiftCertCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncomeAcct() != null) {
            for (i = 0; i < Array.getLength(this.getIncomeAcct()); ++i) {
                obj = Array.get(this.getIncomeAcct(), i);
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
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLiabilityAcct() != null) {
            for (i = 0; i < Array.getLength(this.getLiabilityAcct()); ++i) {
                obj = Array.get(this.getLiabilityAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessage() != null) {
            for (i = 0; i < Array.getLength(this.getMessage()); ++i) {
                obj = Array.get(this.getMessage(), i);
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
        if (this.getOriginalAmount() != null) {
            for (i = 0; i < Array.getLength(this.getOriginalAmount()); ++i) {
                obj = Array.get(this.getOriginalAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseDate() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseDate()); ++i) {
                obj = Array.get(this.getPurchaseDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSender() != null) {
            for (i = 0; i < Array.getLength(this.getSender()); ++i) {
                obj = Array.get(this.getSender(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "GiftCertificateSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amtAvailBilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amtAvailBilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcActive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcActive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomeAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incomeAcct"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("liabilityAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "liabilityAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
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
        elemField.setFieldName("originalAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "originalAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sender"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

