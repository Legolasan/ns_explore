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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemSource;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeDeferral;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoePermitDiscount;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemMember
implements Serializable {
    private String memberDescr;
    private Double componentYield;
    private Double bomQuantity;
    private ItemSource itemSource;
    private Double quantity;
    private RecordRef memberUnit;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private RecordRef taxSchedule;
    private String taxcode;
    private RecordRef item;
    private Double taxrate;
    private Calendar effectiveDate;
    private Calendar obsoleteDate;
    private RecordRef effectiveRevision;
    private RecordRef obsoleteRevision;
    private Long lineNumber;
    private String memberKey;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemMember.class, true);

    public ItemMember() {
    }

    public ItemMember(String memberDescr, Double componentYield, Double bomQuantity, ItemSource itemSource, Double quantity, RecordRef memberUnit, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef taxSchedule, String taxcode, RecordRef item, Double taxrate, Calendar effectiveDate, Calendar obsoleteDate, RecordRef effectiveRevision, RecordRef obsoleteRevision, Long lineNumber, String memberKey) {
        this.memberDescr = memberDescr;
        this.componentYield = componentYield;
        this.bomQuantity = bomQuantity;
        this.itemSource = itemSource;
        this.quantity = quantity;
        this.memberUnit = memberUnit;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.taxSchedule = taxSchedule;
        this.taxcode = taxcode;
        this.item = item;
        this.taxrate = taxrate;
        this.effectiveDate = effectiveDate;
        this.obsoleteDate = obsoleteDate;
        this.effectiveRevision = effectiveRevision;
        this.obsoleteRevision = obsoleteRevision;
        this.lineNumber = lineNumber;
        this.memberKey = memberKey;
    }

    public String getMemberDescr() {
        return this.memberDescr;
    }

    public void setMemberDescr(String memberDescr) {
        this.memberDescr = memberDescr;
    }

    public Double getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(Double componentYield) {
        this.componentYield = componentYield;
    }

    public Double getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public ItemSource getItemSource() {
        return this.itemSource;
    }

    public void setItemSource(ItemSource itemSource) {
        this.itemSource = itemSource;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public RecordRef getMemberUnit() {
        return this.memberUnit;
    }

    public void setMemberUnit(RecordRef memberUnit) {
        this.memberUnit = memberUnit;
    }

    public VsoeDeferral getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public VsoePermitDiscount getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public Boolean getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public String getTaxcode() {
        return this.taxcode;
    }

    public void setTaxcode(String taxcode) {
        this.taxcode = taxcode;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Double getTaxrate() {
        return this.taxrate;
    }

    public void setTaxrate(Double taxrate) {
        this.taxrate = taxrate;
    }

    public Calendar getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Calendar getObsoleteDate() {
        return this.obsoleteDate;
    }

    public void setObsoleteDate(Calendar obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }

    public RecordRef getEffectiveRevision() {
        return this.effectiveRevision;
    }

    public void setEffectiveRevision(RecordRef effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }

    public RecordRef getObsoleteRevision() {
        return this.obsoleteRevision;
    }

    public void setObsoleteRevision(RecordRef obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }

    public Long getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getMemberKey() {
        return this.memberKey;
    }

    public void setMemberKey(String memberKey) {
        this.memberKey = memberKey;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemMember)) {
            return false;
        }
        ItemMember other = (ItemMember)obj;
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
        boolean _equals = (this.memberDescr == null && other.getMemberDescr() == null || this.memberDescr != null && this.memberDescr.equals(other.getMemberDescr())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && this.componentYield.equals(other.getComponentYield())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.itemSource == null && other.getItemSource() == null || this.itemSource != null && this.itemSource.equals(other.getItemSource())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.memberUnit == null && other.getMemberUnit() == null || this.memberUnit != null && this.memberUnit.equals(other.getMemberUnit())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.taxcode == null && other.getTaxcode() == null || this.taxcode != null && this.taxcode.equals(other.getTaxcode())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.taxrate == null && other.getTaxrate() == null || this.taxrate != null && this.taxrate.equals(other.getTaxrate())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && this.obsoleteDate.equals(other.getObsoleteDate())) && (this.effectiveRevision == null && other.getEffectiveRevision() == null || this.effectiveRevision != null && this.effectiveRevision.equals(other.getEffectiveRevision())) && (this.obsoleteRevision == null && other.getObsoleteRevision() == null || this.obsoleteRevision != null && this.obsoleteRevision.equals(other.getObsoleteRevision())) && (this.lineNumber == null && other.getLineNumber() == null || this.lineNumber != null && this.lineNumber.equals(other.getLineNumber())) && (this.memberKey == null && other.getMemberKey() == null || this.memberKey != null && this.memberKey.equals(other.getMemberKey()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getMemberDescr() != null) {
            _hashCode += this.getMemberDescr().hashCode();
        }
        if (this.getComponentYield() != null) {
            _hashCode += this.getComponentYield().hashCode();
        }
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getItemSource() != null) {
            _hashCode += this.getItemSource().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getMemberUnit() != null) {
            _hashCode += this.getMemberUnit().hashCode();
        }
        if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
        }
        if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
        }
        if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getTaxcode() != null) {
            _hashCode += this.getTaxcode().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getTaxrate() != null) {
            _hashCode += this.getTaxrate().hashCode();
        }
        if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
        }
        if (this.getObsoleteDate() != null) {
            _hashCode += this.getObsoleteDate().hashCode();
        }
        if (this.getEffectiveRevision() != null) {
            _hashCode += this.getEffectiveRevision().hashCode();
        }
        if (this.getObsoleteRevision() != null) {
            _hashCode += this.getObsoleteRevision().hashCode();
        }
        if (this.getLineNumber() != null) {
            _hashCode += this.getLineNumber().hashCode();
        }
        if (this.getMemberKey() != null) {
            _hashCode += this.getMemberKey().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemMember"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("memberDescr");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberDescr"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxcode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxcode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxrate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxrate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberKey");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberKey"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

