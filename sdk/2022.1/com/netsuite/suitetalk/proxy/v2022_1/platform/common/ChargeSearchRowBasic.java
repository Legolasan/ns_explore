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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
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

public class ChargeSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] amount;
    private SearchColumnSelectField[] billingAccount;
    private SearchColumnSelectField[] billingItem;
    private SearchColumnSelectField[] billTo;
    private SearchColumnDateField[] chargeDate;
    private SearchColumnSelectField[] chargeType;
    private SearchColumnSelectField[] _class;
    private SearchColumnDateField[] createdDate;
    private SearchColumnSelectField[] currency;
    private SearchColumnSelectField[] department;
    private SearchColumnStringField[] description;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] location;
    private SearchColumnDateField[] modifiedDate;
    private SearchColumnStringField[] postingPeriod;
    private SearchColumnStringField[] quantity;
    private SearchColumnStringField[] rate;
    private SearchColumnSelectField[] rule;
    private SearchColumnStringField[] runId;
    private SearchColumnStringField[] salesOrder;
    private SearchColumnEnumSelectField[] stage;
    private SearchColumnSelectField[] subscriptionLine;
    private SearchColumnEnumSelectField[] use;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ChargeSearchRowBasic.class, true);

    public ChargeSearchRowBasic() {
    }

    public ChargeSearchRowBasic(SearchColumnDoubleField[] amount, SearchColumnSelectField[] billingAccount, SearchColumnSelectField[] billingItem, SearchColumnSelectField[] billTo, SearchColumnDateField[] chargeDate, SearchColumnSelectField[] chargeType, SearchColumnSelectField[] _class, SearchColumnDateField[] createdDate, SearchColumnSelectField[] currency, SearchColumnSelectField[] department, SearchColumnStringField[] description, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnSelectField[] location, SearchColumnDateField[] modifiedDate, SearchColumnStringField[] postingPeriod, SearchColumnStringField[] quantity, SearchColumnStringField[] rate, SearchColumnSelectField[] rule, SearchColumnStringField[] runId, SearchColumnStringField[] salesOrder, SearchColumnEnumSelectField[] stage, SearchColumnSelectField[] subscriptionLine, SearchColumnEnumSelectField[] use, SearchColumnCustomFieldList customFieldList) {
        this.amount = amount;
        this.billingAccount = billingAccount;
        this.billingItem = billingItem;
        this.billTo = billTo;
        this.chargeDate = chargeDate;
        this.chargeType = chargeType;
        this._class = _class;
        this.createdDate = createdDate;
        this.currency = currency;
        this.department = department;
        this.description = description;
        this.externalId = externalId;
        this.internalId = internalId;
        this.location = location;
        this.modifiedDate = modifiedDate;
        this.postingPeriod = postingPeriod;
        this.quantity = quantity;
        this.rate = rate;
        this.rule = rule;
        this.runId = runId;
        this.salesOrder = salesOrder;
        this.stage = stage;
        this.subscriptionLine = subscriptionLine;
        this.use = use;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDoubleField[] getAmount() {
        return this.amount;
    }

    public void setAmount(SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }

    public SearchColumnSelectField[] getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(SearchColumnSelectField[] billingAccount) {
        this.billingAccount = billingAccount;
    }

    public SearchColumnSelectField getBillingAccount(int i) {
        return this.billingAccount[i];
    }

    public void setBillingAccount(int i, SearchColumnSelectField _value) {
        this.billingAccount[i] = _value;
    }

    public SearchColumnSelectField[] getBillingItem() {
        return this.billingItem;
    }

    public void setBillingItem(SearchColumnSelectField[] billingItem) {
        this.billingItem = billingItem;
    }

    public SearchColumnSelectField getBillingItem(int i) {
        return this.billingItem[i];
    }

    public void setBillingItem(int i, SearchColumnSelectField _value) {
        this.billingItem[i] = _value;
    }

    public SearchColumnSelectField[] getBillTo() {
        return this.billTo;
    }

    public void setBillTo(SearchColumnSelectField[] billTo) {
        this.billTo = billTo;
    }

    public SearchColumnSelectField getBillTo(int i) {
        return this.billTo[i];
    }

    public void setBillTo(int i, SearchColumnSelectField _value) {
        this.billTo[i] = _value;
    }

    public SearchColumnDateField[] getChargeDate() {
        return this.chargeDate;
    }

    public void setChargeDate(SearchColumnDateField[] chargeDate) {
        this.chargeDate = chargeDate;
    }

    public SearchColumnDateField getChargeDate(int i) {
        return this.chargeDate[i];
    }

    public void setChargeDate(int i, SearchColumnDateField _value) {
        this.chargeDate[i] = _value;
    }

    public SearchColumnSelectField[] getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(SearchColumnSelectField[] chargeType) {
        this.chargeType = chargeType;
    }

    public SearchColumnSelectField getChargeType(int i) {
        return this.chargeType[i];
    }

    public void setChargeType(int i, SearchColumnSelectField _value) {
        this.chargeType[i] = _value;
    }

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
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

    public SearchColumnSelectField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
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

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnDateField[] getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(SearchColumnDateField[] modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public SearchColumnDateField getModifiedDate(int i) {
        return this.modifiedDate[i];
    }

    public void setModifiedDate(int i, SearchColumnDateField _value) {
        this.modifiedDate[i] = _value;
    }

    public SearchColumnStringField[] getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(SearchColumnStringField[] postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public SearchColumnStringField getPostingPeriod(int i) {
        return this.postingPeriod[i];
    }

    public void setPostingPeriod(int i, SearchColumnStringField _value) {
        this.postingPeriod[i] = _value;
    }

    public SearchColumnStringField[] getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchColumnStringField[] quantity) {
        this.quantity = quantity;
    }

    public SearchColumnStringField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, SearchColumnStringField _value) {
        this.quantity[i] = _value;
    }

    public SearchColumnStringField[] getRate() {
        return this.rate;
    }

    public void setRate(SearchColumnStringField[] rate) {
        this.rate = rate;
    }

    public SearchColumnStringField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, SearchColumnStringField _value) {
        this.rate[i] = _value;
    }

    public SearchColumnSelectField[] getRule() {
        return this.rule;
    }

    public void setRule(SearchColumnSelectField[] rule) {
        this.rule = rule;
    }

    public SearchColumnSelectField getRule(int i) {
        return this.rule[i];
    }

    public void setRule(int i, SearchColumnSelectField _value) {
        this.rule[i] = _value;
    }

    public SearchColumnStringField[] getRunId() {
        return this.runId;
    }

    public void setRunId(SearchColumnStringField[] runId) {
        this.runId = runId;
    }

    public SearchColumnStringField getRunId(int i) {
        return this.runId[i];
    }

    public void setRunId(int i, SearchColumnStringField _value) {
        this.runId[i] = _value;
    }

    public SearchColumnStringField[] getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(SearchColumnStringField[] salesOrder) {
        this.salesOrder = salesOrder;
    }

    public SearchColumnStringField getSalesOrder(int i) {
        return this.salesOrder[i];
    }

    public void setSalesOrder(int i, SearchColumnStringField _value) {
        this.salesOrder[i] = _value;
    }

    public SearchColumnEnumSelectField[] getStage() {
        return this.stage;
    }

    public void setStage(SearchColumnEnumSelectField[] stage) {
        this.stage = stage;
    }

    public SearchColumnEnumSelectField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, SearchColumnEnumSelectField _value) {
        this.stage[i] = _value;
    }

    public SearchColumnSelectField[] getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(SearchColumnSelectField[] subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public SearchColumnSelectField getSubscriptionLine(int i) {
        return this.subscriptionLine[i];
    }

    public void setSubscriptionLine(int i, SearchColumnSelectField _value) {
        this.subscriptionLine[i] = _value;
    }

    public SearchColumnEnumSelectField[] getUse() {
        return this.use;
    }

    public void setUse(SearchColumnEnumSelectField[] use) {
        this.use = use;
    }

    public SearchColumnEnumSelectField getUse(int i) {
        return this.use[i];
    }

    public void setUse(int i, SearchColumnEnumSelectField _value) {
        this.use[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChargeSearchRowBasic)) {
            return false;
        }
        ChargeSearchRowBasic other = (ChargeSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && Arrays.equals(this.billingAccount, other.getBillingAccount())) && (this.billingItem == null && other.getBillingItem() == null || this.billingItem != null && Arrays.equals(this.billingItem, other.getBillingItem())) && (this.billTo == null && other.getBillTo() == null || this.billTo != null && Arrays.equals(this.billTo, other.getBillTo())) && (this.chargeDate == null && other.getChargeDate() == null || this.chargeDate != null && Arrays.equals(this.chargeDate, other.getChargeDate())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && Arrays.equals(this.chargeType, other.getChargeType())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.modifiedDate == null && other.getModifiedDate() == null || this.modifiedDate != null && Arrays.equals(this.modifiedDate, other.getModifiedDate())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && Arrays.equals(this.postingPeriod, other.getPostingPeriod())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && Arrays.equals(this.quantity, other.getQuantity())) && (this.rate == null && other.getRate() == null || this.rate != null && Arrays.equals(this.rate, other.getRate())) && (this.rule == null && other.getRule() == null || this.rule != null && Arrays.equals(this.rule, other.getRule())) && (this.runId == null && other.getRunId() == null || this.runId != null && Arrays.equals(this.runId, other.getRunId())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && Arrays.equals(this.salesOrder, other.getSalesOrder())) && (this.stage == null && other.getStage() == null || this.stage != null && Arrays.equals(this.stage, other.getStage())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && Arrays.equals(this.subscriptionLine, other.getSubscriptionLine())) && (this.use == null && other.getUse() == null || this.use != null && Arrays.equals(this.use, other.getUse())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingAccount() != null) {
            for (i = 0; i < Array.getLength(this.getBillingAccount()); ++i) {
                obj = Array.get(this.getBillingAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingItem() != null) {
            for (i = 0; i < Array.getLength(this.getBillingItem()); ++i) {
                obj = Array.get(this.getBillingItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillTo() != null) {
            for (i = 0; i < Array.getLength(this.getBillTo()); ++i) {
                obj = Array.get(this.getBillTo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getChargeDate() != null) {
            for (i = 0; i < Array.getLength(this.getChargeDate()); ++i) {
                obj = Array.get(this.getChargeDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getChargeType() != null) {
            for (i = 0; i < Array.getLength(this.getChargeType()); ++i) {
                obj = Array.get(this.getChargeType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
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
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
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
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getModifiedDate()); ++i) {
                obj = Array.get(this.getModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPostingPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getPostingPeriod()); ++i) {
                obj = Array.get(this.getPostingPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getQuantity()); ++i) {
                obj = Array.get(this.getQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRate() != null) {
            for (i = 0; i < Array.getLength(this.getRate()); ++i) {
                obj = Array.get(this.getRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRule() != null) {
            for (i = 0; i < Array.getLength(this.getRule()); ++i) {
                obj = Array.get(this.getRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRunId() != null) {
            for (i = 0; i < Array.getLength(this.getRunId()); ++i) {
                obj = Array.get(this.getRunId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesOrder() != null) {
            for (i = 0; i < Array.getLength(this.getSalesOrder()); ++i) {
                obj = Array.get(this.getSalesOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStage() != null) {
            for (i = 0; i < Array.getLength(this.getStage()); ++i) {
                obj = Array.get(this.getStage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscriptionLine() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionLine()); ++i) {
                obj = Array.get(this.getSubscriptionLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUse() != null) {
            for (i = 0; i < Array.getLength(this.getUse()); ++i) {
                obj = Array.get(this.getUse(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ChargeSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "modifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "use"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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

