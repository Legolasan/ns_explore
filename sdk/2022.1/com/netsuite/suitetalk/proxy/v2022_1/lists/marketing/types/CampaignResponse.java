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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CampaignResponse
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __clickedThrough = "_clickedThrough";
    public static final String __failedDeliveryFailure = "_failedDeliveryFailure";
    public static final String __failedInvalidAddress = "_failedInvalidAddress";
    public static final String __failedOther = "_failedOther";
    public static final String __failedSpam = "_failedSpam";
    public static final String __failedTemplateError = "_failedTemplateError";
    public static final String __failedUnexpectedError = "_failedUnexpectedError";
    public static final String __invalidSenderAddress = "_invalidSenderAddress";
    public static final String __mailboxDisabled = "_mailboxDisabled";
    public static final String __mailboxIsFull = "_mailboxIsFull";
    public static final String __mailboxNotAcceptingMessages = "_mailboxNotAcceptingMessages";
    public static final String __mailProtocolIssues = "_mailProtocolIssues";
    public static final String __mediaError = "_mediaError";
    public static final String __messageExceedsSizeLengthLimits = "_messageExceedsSizeLengthLimits";
    public static final String __networkServerIssues = "_networkServerIssues";
    public static final String __opened = "_opened";
    public static final String __purchased = "_purchased";
    public static final String __queued = "_queued";
    public static final String __received = "_received";
    public static final String __responded = "_responded";
    public static final String __securityIssues = "_securityIssues";
    public static final String __sent = "_sent";
    public static final String __skippedDueToPreviousHardBounce = "_skippedDueToPreviousHardBounce";
    public static final String __subscribed = "_subscribed";
    public static final String __tooManyRecipients = "_tooManyRecipients";
    public static final String __unsubscribed = "_unsubscribed";
    public static final String __unsubscribedByFeedbackLoop = "_unsubscribedByFeedbackLoop";
    public static final CampaignResponse _clickedThrough = new CampaignResponse("_clickedThrough");
    public static final CampaignResponse _failedDeliveryFailure = new CampaignResponse("_failedDeliveryFailure");
    public static final CampaignResponse _failedInvalidAddress = new CampaignResponse("_failedInvalidAddress");
    public static final CampaignResponse _failedOther = new CampaignResponse("_failedOther");
    public static final CampaignResponse _failedSpam = new CampaignResponse("_failedSpam");
    public static final CampaignResponse _failedTemplateError = new CampaignResponse("_failedTemplateError");
    public static final CampaignResponse _failedUnexpectedError = new CampaignResponse("_failedUnexpectedError");
    public static final CampaignResponse _invalidSenderAddress = new CampaignResponse("_invalidSenderAddress");
    public static final CampaignResponse _mailboxDisabled = new CampaignResponse("_mailboxDisabled");
    public static final CampaignResponse _mailboxIsFull = new CampaignResponse("_mailboxIsFull");
    public static final CampaignResponse _mailboxNotAcceptingMessages = new CampaignResponse("_mailboxNotAcceptingMessages");
    public static final CampaignResponse _mailProtocolIssues = new CampaignResponse("_mailProtocolIssues");
    public static final CampaignResponse _mediaError = new CampaignResponse("_mediaError");
    public static final CampaignResponse _messageExceedsSizeLengthLimits = new CampaignResponse("_messageExceedsSizeLengthLimits");
    public static final CampaignResponse _networkServerIssues = new CampaignResponse("_networkServerIssues");
    public static final CampaignResponse _opened = new CampaignResponse("_opened");
    public static final CampaignResponse _purchased = new CampaignResponse("_purchased");
    public static final CampaignResponse _queued = new CampaignResponse("_queued");
    public static final CampaignResponse _received = new CampaignResponse("_received");
    public static final CampaignResponse _responded = new CampaignResponse("_responded");
    public static final CampaignResponse _securityIssues = new CampaignResponse("_securityIssues");
    public static final CampaignResponse _sent = new CampaignResponse("_sent");
    public static final CampaignResponse _skippedDueToPreviousHardBounce = new CampaignResponse("_skippedDueToPreviousHardBounce");
    public static final CampaignResponse _subscribed = new CampaignResponse("_subscribed");
    public static final CampaignResponse _tooManyRecipients = new CampaignResponse("_tooManyRecipients");
    public static final CampaignResponse _unsubscribed = new CampaignResponse("_unsubscribed");
    public static final CampaignResponse _unsubscribedByFeedbackLoop = new CampaignResponse("_unsubscribedByFeedbackLoop");
    private static TypeDesc typeDesc = new TypeDesc(CampaignResponse.class);

    protected CampaignResponse(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignResponse fromValue(String value) throws IllegalArgumentException {
        CampaignResponse enumeration = (CampaignResponse)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignResponse fromString(String value) throws IllegalArgumentException {
        return CampaignResponse.fromValue(value);
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
        return CampaignResponse.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponse"));
    }
}

