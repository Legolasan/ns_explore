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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PromotionCodeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
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

public class CampaignSearchRow
extends SearchRow
implements Serializable {
    private CampaignSearchRowBasic basic;
    private EntitySearchRowBasic campaignRecipientJoin;
    private FileSearchRowBasic fileJoin;
    private MessageSearchRowBasic messagesJoin;
    private OriginatingLeadSearchRowBasic originatingLeadJoin;
    private PromotionCodeSearchRowBasic promotionCodeJoin;
    private TransactionSearchRowBasic transactionJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignSearchRow.class, true);

    public CampaignSearchRow() {
    }

    public CampaignSearchRow(CampaignSearchRowBasic basic, EntitySearchRowBasic campaignRecipientJoin, FileSearchRowBasic fileJoin, MessageSearchRowBasic messagesJoin, OriginatingLeadSearchRowBasic originatingLeadJoin, PromotionCodeSearchRowBasic promotionCodeJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.campaignRecipientJoin = campaignRecipientJoin;
        this.fileJoin = fileJoin;
        this.messagesJoin = messagesJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.promotionCodeJoin = promotionCodeJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public CampaignSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(CampaignSearchRowBasic basic) {
        this.basic = basic;
    }

    public EntitySearchRowBasic getCampaignRecipientJoin() {
        return this.campaignRecipientJoin;
    }

    public void setCampaignRecipientJoin(EntitySearchRowBasic campaignRecipientJoin) {
        this.campaignRecipientJoin = campaignRecipientJoin;
    }

    public FileSearchRowBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public MessageSearchRowBasic getMessagesJoin() {
        return this.messagesJoin;
    }

    public void setMessagesJoin(MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }

    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return this.originatingLeadJoin;
    }

    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }

    public PromotionCodeSearchRowBasic getPromotionCodeJoin() {
        return this.promotionCodeJoin;
    }

    public void setPromotionCodeJoin(PromotionCodeSearchRowBasic promotionCodeJoin) {
        this.promotionCodeJoin = promotionCodeJoin;
    }

    public TransactionSearchRowBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
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
        if (!(obj instanceof CampaignSearchRow)) {
            return false;
        }
        CampaignSearchRow other = (CampaignSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.campaignRecipientJoin == null && other.getCampaignRecipientJoin() == null || this.campaignRecipientJoin != null && this.campaignRecipientJoin.equals(other.getCampaignRecipientJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.originatingLeadJoin == null && other.getOriginatingLeadJoin() == null || this.originatingLeadJoin != null && this.originatingLeadJoin.equals(other.getOriginatingLeadJoin())) && (this.promotionCodeJoin == null && other.getPromotionCodeJoin() == null || this.promotionCodeJoin != null && this.promotionCodeJoin.equals(other.getPromotionCodeJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getCampaignRecipientJoin() != null) {
            _hashCode += this.getCampaignRecipientJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getMessagesJoin() != null) {
            _hashCode += this.getMessagesJoin().hashCode();
        }
        if (this.getOriginatingLeadJoin() != null) {
            _hashCode += this.getOriginatingLeadJoin().hashCode();
        }
        if (this.getPromotionCodeJoin() != null) {
            _hashCode += this.getPromotionCodeJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignRecipientJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignRecipientJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promotionCodeJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "promotionCodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PromotionCodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

