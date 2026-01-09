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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class PaymentInstrumentSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] cardBrand;
    private SearchColumnDateField[] cardExpDate;
    private SearchColumnStringField[] cardLastFourDigits;
    private SearchColumnStringField[] cardTokenCardBrand;
    private SearchColumnDateField[] cardTokenCardExpDate;
    private SearchColumnDateField[] cardTokenExpDate;
    private SearchColumnStringField[] cardTokenNameOnCard;
    private SearchColumnStringField[] _default;
    private SearchColumnSelectField[] entity;
    private SearchColumnDateField[] generalTokenExpirationDate;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] isInactive;
    private SearchColumnStringField[] lastFourDigits;
    private SearchColumnStringField[] mask;
    private SearchColumnStringField[] nameOnCard;
    private SearchColumnSelectField[] paymentInstrumentStateType;
    private SearchColumnEnumSelectField[] paymentInstrumentType;
    private SearchColumnSelectField[] paymentMethod;
    private SearchColumnStringField[] preserveOnFile;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaymentInstrumentSearchRowBasic.class, true);

    public PaymentInstrumentSearchRowBasic() {
    }

    public PaymentInstrumentSearchRowBasic(SearchColumnStringField[] cardBrand, SearchColumnDateField[] cardExpDate, SearchColumnStringField[] cardLastFourDigits, SearchColumnStringField[] cardTokenCardBrand, SearchColumnDateField[] cardTokenCardExpDate, SearchColumnDateField[] cardTokenExpDate, SearchColumnStringField[] cardTokenNameOnCard, SearchColumnStringField[] _default, SearchColumnSelectField[] entity, SearchColumnDateField[] generalTokenExpirationDate, SearchColumnSelectField[] internalId, SearchColumnStringField[] isInactive, SearchColumnStringField[] lastFourDigits, SearchColumnStringField[] mask, SearchColumnStringField[] nameOnCard, SearchColumnSelectField[] paymentInstrumentStateType, SearchColumnEnumSelectField[] paymentInstrumentType, SearchColumnSelectField[] paymentMethod, SearchColumnStringField[] preserveOnFile) {
        this.cardBrand = cardBrand;
        this.cardExpDate = cardExpDate;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardTokenCardBrand = cardTokenCardBrand;
        this.cardTokenCardExpDate = cardTokenCardExpDate;
        this.cardTokenExpDate = cardTokenExpDate;
        this.cardTokenNameOnCard = cardTokenNameOnCard;
        this._default = _default;
        this.entity = entity;
        this.generalTokenExpirationDate = generalTokenExpirationDate;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.lastFourDigits = lastFourDigits;
        this.mask = mask;
        this.nameOnCard = nameOnCard;
        this.paymentInstrumentStateType = paymentInstrumentStateType;
        this.paymentInstrumentType = paymentInstrumentType;
        this.paymentMethod = paymentMethod;
        this.preserveOnFile = preserveOnFile;
    }

    public SearchColumnStringField[] getCardBrand() {
        return this.cardBrand;
    }

    public void setCardBrand(SearchColumnStringField[] cardBrand) {
        this.cardBrand = cardBrand;
    }

    public SearchColumnStringField getCardBrand(int i) {
        return this.cardBrand[i];
    }

    public void setCardBrand(int i, SearchColumnStringField _value) {
        this.cardBrand[i] = _value;
    }

    public SearchColumnDateField[] getCardExpDate() {
        return this.cardExpDate;
    }

    public void setCardExpDate(SearchColumnDateField[] cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public SearchColumnDateField getCardExpDate(int i) {
        return this.cardExpDate[i];
    }

    public void setCardExpDate(int i, SearchColumnDateField _value) {
        this.cardExpDate[i] = _value;
    }

    public SearchColumnStringField[] getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    public void setCardLastFourDigits(SearchColumnStringField[] cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }

    public SearchColumnStringField getCardLastFourDigits(int i) {
        return this.cardLastFourDigits[i];
    }

    public void setCardLastFourDigits(int i, SearchColumnStringField _value) {
        this.cardLastFourDigits[i] = _value;
    }

    public SearchColumnStringField[] getCardTokenCardBrand() {
        return this.cardTokenCardBrand;
    }

    public void setCardTokenCardBrand(SearchColumnStringField[] cardTokenCardBrand) {
        this.cardTokenCardBrand = cardTokenCardBrand;
    }

    public SearchColumnStringField getCardTokenCardBrand(int i) {
        return this.cardTokenCardBrand[i];
    }

    public void setCardTokenCardBrand(int i, SearchColumnStringField _value) {
        this.cardTokenCardBrand[i] = _value;
    }

    public SearchColumnDateField[] getCardTokenCardExpDate() {
        return this.cardTokenCardExpDate;
    }

    public void setCardTokenCardExpDate(SearchColumnDateField[] cardTokenCardExpDate) {
        this.cardTokenCardExpDate = cardTokenCardExpDate;
    }

    public SearchColumnDateField getCardTokenCardExpDate(int i) {
        return this.cardTokenCardExpDate[i];
    }

    public void setCardTokenCardExpDate(int i, SearchColumnDateField _value) {
        this.cardTokenCardExpDate[i] = _value;
    }

    public SearchColumnDateField[] getCardTokenExpDate() {
        return this.cardTokenExpDate;
    }

    public void setCardTokenExpDate(SearchColumnDateField[] cardTokenExpDate) {
        this.cardTokenExpDate = cardTokenExpDate;
    }

    public SearchColumnDateField getCardTokenExpDate(int i) {
        return this.cardTokenExpDate[i];
    }

    public void setCardTokenExpDate(int i, SearchColumnDateField _value) {
        this.cardTokenExpDate[i] = _value;
    }

    public SearchColumnStringField[] getCardTokenNameOnCard() {
        return this.cardTokenNameOnCard;
    }

    public void setCardTokenNameOnCard(SearchColumnStringField[] cardTokenNameOnCard) {
        this.cardTokenNameOnCard = cardTokenNameOnCard;
    }

    public SearchColumnStringField getCardTokenNameOnCard(int i) {
        return this.cardTokenNameOnCard[i];
    }

    public void setCardTokenNameOnCard(int i, SearchColumnStringField _value) {
        this.cardTokenNameOnCard[i] = _value;
    }

    public SearchColumnStringField[] get_default() {
        return this._default;
    }

    public void set_default(SearchColumnStringField[] _default) {
        this._default = _default;
    }

    public SearchColumnStringField get_default(int i) {
        return this._default[i];
    }

    public void set_default(int i, SearchColumnStringField _value) {
        this._default[i] = _value;
    }

    public SearchColumnSelectField[] getEntity() {
        return this.entity;
    }

    public void setEntity(SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }

    public SearchColumnDateField[] getGeneralTokenExpirationDate() {
        return this.generalTokenExpirationDate;
    }

    public void setGeneralTokenExpirationDate(SearchColumnDateField[] generalTokenExpirationDate) {
        this.generalTokenExpirationDate = generalTokenExpirationDate;
    }

    public SearchColumnDateField getGeneralTokenExpirationDate(int i) {
        return this.generalTokenExpirationDate[i];
    }

    public void setGeneralTokenExpirationDate(int i, SearchColumnDateField _value) {
        this.generalTokenExpirationDate[i] = _value;
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

    public SearchColumnStringField[] getLastFourDigits() {
        return this.lastFourDigits;
    }

    public void setLastFourDigits(SearchColumnStringField[] lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public SearchColumnStringField getLastFourDigits(int i) {
        return this.lastFourDigits[i];
    }

    public void setLastFourDigits(int i, SearchColumnStringField _value) {
        this.lastFourDigits[i] = _value;
    }

    public SearchColumnStringField[] getMask() {
        return this.mask;
    }

    public void setMask(SearchColumnStringField[] mask) {
        this.mask = mask;
    }

    public SearchColumnStringField getMask(int i) {
        return this.mask[i];
    }

    public void setMask(int i, SearchColumnStringField _value) {
        this.mask[i] = _value;
    }

    public SearchColumnStringField[] getNameOnCard() {
        return this.nameOnCard;
    }

    public void setNameOnCard(SearchColumnStringField[] nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public SearchColumnStringField getNameOnCard(int i) {
        return this.nameOnCard[i];
    }

    public void setNameOnCard(int i, SearchColumnStringField _value) {
        this.nameOnCard[i] = _value;
    }

    public SearchColumnSelectField[] getPaymentInstrumentStateType() {
        return this.paymentInstrumentStateType;
    }

    public void setPaymentInstrumentStateType(SearchColumnSelectField[] paymentInstrumentStateType) {
        this.paymentInstrumentStateType = paymentInstrumentStateType;
    }

    public SearchColumnSelectField getPaymentInstrumentStateType(int i) {
        return this.paymentInstrumentStateType[i];
    }

    public void setPaymentInstrumentStateType(int i, SearchColumnSelectField _value) {
        this.paymentInstrumentStateType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPaymentInstrumentType() {
        return this.paymentInstrumentType;
    }

    public void setPaymentInstrumentType(SearchColumnEnumSelectField[] paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    public SearchColumnEnumSelectField getPaymentInstrumentType(int i) {
        return this.paymentInstrumentType[i];
    }

    public void setPaymentInstrumentType(int i, SearchColumnEnumSelectField _value) {
        this.paymentInstrumentType[i] = _value;
    }

    public SearchColumnSelectField[] getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }

    public SearchColumnStringField[] getPreserveOnFile() {
        return this.preserveOnFile;
    }

    public void setPreserveOnFile(SearchColumnStringField[] preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    public SearchColumnStringField getPreserveOnFile(int i) {
        return this.preserveOnFile[i];
    }

    public void setPreserveOnFile(int i, SearchColumnStringField _value) {
        this.preserveOnFile[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaymentInstrumentSearchRowBasic)) {
            return false;
        }
        PaymentInstrumentSearchRowBasic other = (PaymentInstrumentSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.cardBrand == null && other.getCardBrand() == null || this.cardBrand != null && Arrays.equals(this.cardBrand, other.getCardBrand())) && (this.cardExpDate == null && other.getCardExpDate() == null || this.cardExpDate != null && Arrays.equals(this.cardExpDate, other.getCardExpDate())) && (this.cardLastFourDigits == null && other.getCardLastFourDigits() == null || this.cardLastFourDigits != null && Arrays.equals(this.cardLastFourDigits, other.getCardLastFourDigits())) && (this.cardTokenCardBrand == null && other.getCardTokenCardBrand() == null || this.cardTokenCardBrand != null && Arrays.equals(this.cardTokenCardBrand, other.getCardTokenCardBrand())) && (this.cardTokenCardExpDate == null && other.getCardTokenCardExpDate() == null || this.cardTokenCardExpDate != null && Arrays.equals(this.cardTokenCardExpDate, other.getCardTokenCardExpDate())) && (this.cardTokenExpDate == null && other.getCardTokenExpDate() == null || this.cardTokenExpDate != null && Arrays.equals(this.cardTokenExpDate, other.getCardTokenExpDate())) && (this.cardTokenNameOnCard == null && other.getCardTokenNameOnCard() == null || this.cardTokenNameOnCard != null && Arrays.equals(this.cardTokenNameOnCard, other.getCardTokenNameOnCard())) && (this._default == null && other.get_default() == null || this._default != null && Arrays.equals(this._default, other.get_default())) && (this.entity == null && other.getEntity() == null || this.entity != null && Arrays.equals(this.entity, other.getEntity())) && (this.generalTokenExpirationDate == null && other.getGeneralTokenExpirationDate() == null || this.generalTokenExpirationDate != null && Arrays.equals(this.generalTokenExpirationDate, other.getGeneralTokenExpirationDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.lastFourDigits == null && other.getLastFourDigits() == null || this.lastFourDigits != null && Arrays.equals(this.lastFourDigits, other.getLastFourDigits())) && (this.mask == null && other.getMask() == null || this.mask != null && Arrays.equals(this.mask, other.getMask())) && (this.nameOnCard == null && other.getNameOnCard() == null || this.nameOnCard != null && Arrays.equals(this.nameOnCard, other.getNameOnCard())) && (this.paymentInstrumentStateType == null && other.getPaymentInstrumentStateType() == null || this.paymentInstrumentStateType != null && Arrays.equals(this.paymentInstrumentStateType, other.getPaymentInstrumentStateType())) && (this.paymentInstrumentType == null && other.getPaymentInstrumentType() == null || this.paymentInstrumentType != null && Arrays.equals(this.paymentInstrumentType, other.getPaymentInstrumentType())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && Arrays.equals(this.paymentMethod, other.getPaymentMethod())) && (this.preserveOnFile == null && other.getPreserveOnFile() == null || this.preserveOnFile != null && Arrays.equals(this.preserveOnFile, other.getPreserveOnFile()));
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
        if (this.getCardBrand() != null) {
            for (i = 0; i < Array.getLength(this.getCardBrand()); ++i) {
                obj = Array.get(this.getCardBrand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getCardExpDate()); ++i) {
                obj = Array.get(this.getCardExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardLastFourDigits() != null) {
            for (i = 0; i < Array.getLength(this.getCardLastFourDigits()); ++i) {
                obj = Array.get(this.getCardLastFourDigits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardTokenCardBrand() != null) {
            for (i = 0; i < Array.getLength(this.getCardTokenCardBrand()); ++i) {
                obj = Array.get(this.getCardTokenCardBrand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardTokenCardExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getCardTokenCardExpDate()); ++i) {
                obj = Array.get(this.getCardTokenCardExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardTokenExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getCardTokenExpDate()); ++i) {
                obj = Array.get(this.getCardTokenExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCardTokenNameOnCard() != null) {
            for (i = 0; i < Array.getLength(this.getCardTokenNameOnCard()); ++i) {
                obj = Array.get(this.getCardTokenNameOnCard(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_default() != null) {
            for (i = 0; i < Array.getLength(this.get_default()); ++i) {
                obj = Array.get(this.get_default(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntity() != null) {
            for (i = 0; i < Array.getLength(this.getEntity()); ++i) {
                obj = Array.get(this.getEntity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGeneralTokenExpirationDate() != null) {
            for (i = 0; i < Array.getLength(this.getGeneralTokenExpirationDate()); ++i) {
                obj = Array.get(this.getGeneralTokenExpirationDate(), i);
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
        if (this.getLastFourDigits() != null) {
            for (i = 0; i < Array.getLength(this.getLastFourDigits()); ++i) {
                obj = Array.get(this.getLastFourDigits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMask() != null) {
            for (i = 0; i < Array.getLength(this.getMask()); ++i) {
                obj = Array.get(this.getMask(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNameOnCard() != null) {
            for (i = 0; i < Array.getLength(this.getNameOnCard()); ++i) {
                obj = Array.get(this.getNameOnCard(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentInstrumentStateType() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentInstrumentStateType()); ++i) {
                obj = Array.get(this.getPaymentInstrumentStateType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentInstrumentType() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentInstrumentType()); ++i) {
                obj = Array.get(this.getPaymentInstrumentType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentMethod() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentMethod()); ++i) {
                obj = Array.get(this.getPaymentMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreserveOnFile() != null) {
            for (i = 0; i < Array.getLength(this.getPreserveOnFile()); ++i) {
                obj = Array.get(this.getPreserveOnFile(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentInstrumentSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardBrand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardLastFourDigits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardLastFourDigits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardTokenCardBrand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardTokenCardBrand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardTokenCardExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardTokenCardExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardTokenExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardTokenExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardTokenNameOnCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cardTokenNameOnCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "default"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generalTokenExpirationDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "generalTokenExpirationDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastFourDigits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastFourDigits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameOnCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentStateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentInstrumentStateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentInstrumentType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

