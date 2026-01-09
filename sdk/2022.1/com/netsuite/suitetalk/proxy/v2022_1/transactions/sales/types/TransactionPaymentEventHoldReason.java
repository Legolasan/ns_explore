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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TransactionPaymentEventHoldReason
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __amountExceedsMaximumAllowedAmount = "_amountExceedsMaximumAllowedAmount";
    public static final String __authorizationDecline = "_authorizationDecline";
    public static final String __cardExpired = "_cardExpired";
    public static final String __cardInvalid = "_cardInvalid";
    public static final String __confirmationOfTheOperationIsPending = "_confirmationOfTheOperationIsPending";
    public static final String __externalFraudRejection = "_externalFraudRejection";
    public static final String __externalFraudReview = "_externalFraudReview";
    public static final String __failedToPrimeDevice = "_failedToPrimeDevice";
    public static final String __fatalError = "_fatalError";
    public static final String __forwardedToPayerAuthentication = "_forwardedToPayerAuthentication";
    public static final String __forwardRequested = "_forwardRequested";
    public static final String __forwardToAuthenticateDevice = "_forwardToAuthenticateDevice";
    public static final String __forwardToChallengeShopper = "_forwardToChallengeShopper";
    public static final String __gatewayAsynchronousNotification = "_gatewayAsynchronousNotification";
    public static final String __gatewayError = "_gatewayError";
    public static final String __generalHold = "_generalHold";
    public static final String __generalReject = "_generalReject";
    public static final String __insufficientFunds = "_insufficientFunds";
    public static final String __notRequired = "_notRequired";
    public static final String __operationWasSuccessful = "_operationWasSuccessful";
    public static final String __operationWasTerminated = "_operationWasTerminated";
    public static final String __overridenBy = "_overridenBy";
    public static final String __partnerDecline = "_partnerDecline";
    public static final String __paymentDeviceWasPrimed = "_paymentDeviceWasPrimed";
    public static final String __paymentOperationWasCanceled = "_paymentOperationWasCanceled";
    public static final String __systemError = "_systemError";
    public static final String __verbalAuthorizationRequested = "_verbalAuthorizationRequested";
    public static final String __verificationRejection = "_verificationRejection";
    public static final String __verificationRequired = "_verificationRequired";
    public static final TransactionPaymentEventHoldReason _amountExceedsMaximumAllowedAmount = new TransactionPaymentEventHoldReason("_amountExceedsMaximumAllowedAmount");
    public static final TransactionPaymentEventHoldReason _authorizationDecline = new TransactionPaymentEventHoldReason("_authorizationDecline");
    public static final TransactionPaymentEventHoldReason _cardExpired = new TransactionPaymentEventHoldReason("_cardExpired");
    public static final TransactionPaymentEventHoldReason _cardInvalid = new TransactionPaymentEventHoldReason("_cardInvalid");
    public static final TransactionPaymentEventHoldReason _confirmationOfTheOperationIsPending = new TransactionPaymentEventHoldReason("_confirmationOfTheOperationIsPending");
    public static final TransactionPaymentEventHoldReason _externalFraudRejection = new TransactionPaymentEventHoldReason("_externalFraudRejection");
    public static final TransactionPaymentEventHoldReason _externalFraudReview = new TransactionPaymentEventHoldReason("_externalFraudReview");
    public static final TransactionPaymentEventHoldReason _failedToPrimeDevice = new TransactionPaymentEventHoldReason("_failedToPrimeDevice");
    public static final TransactionPaymentEventHoldReason _fatalError = new TransactionPaymentEventHoldReason("_fatalError");
    public static final TransactionPaymentEventHoldReason _forwardedToPayerAuthentication = new TransactionPaymentEventHoldReason("_forwardedToPayerAuthentication");
    public static final TransactionPaymentEventHoldReason _forwardRequested = new TransactionPaymentEventHoldReason("_forwardRequested");
    public static final TransactionPaymentEventHoldReason _forwardToAuthenticateDevice = new TransactionPaymentEventHoldReason("_forwardToAuthenticateDevice");
    public static final TransactionPaymentEventHoldReason _forwardToChallengeShopper = new TransactionPaymentEventHoldReason("_forwardToChallengeShopper");
    public static final TransactionPaymentEventHoldReason _gatewayAsynchronousNotification = new TransactionPaymentEventHoldReason("_gatewayAsynchronousNotification");
    public static final TransactionPaymentEventHoldReason _gatewayError = new TransactionPaymentEventHoldReason("_gatewayError");
    public static final TransactionPaymentEventHoldReason _generalHold = new TransactionPaymentEventHoldReason("_generalHold");
    public static final TransactionPaymentEventHoldReason _generalReject = new TransactionPaymentEventHoldReason("_generalReject");
    public static final TransactionPaymentEventHoldReason _insufficientFunds = new TransactionPaymentEventHoldReason("_insufficientFunds");
    public static final TransactionPaymentEventHoldReason _notRequired = new TransactionPaymentEventHoldReason("_notRequired");
    public static final TransactionPaymentEventHoldReason _operationWasSuccessful = new TransactionPaymentEventHoldReason("_operationWasSuccessful");
    public static final TransactionPaymentEventHoldReason _operationWasTerminated = new TransactionPaymentEventHoldReason("_operationWasTerminated");
    public static final TransactionPaymentEventHoldReason _overridenBy = new TransactionPaymentEventHoldReason("_overridenBy");
    public static final TransactionPaymentEventHoldReason _partnerDecline = new TransactionPaymentEventHoldReason("_partnerDecline");
    public static final TransactionPaymentEventHoldReason _paymentDeviceWasPrimed = new TransactionPaymentEventHoldReason("_paymentDeviceWasPrimed");
    public static final TransactionPaymentEventHoldReason _paymentOperationWasCanceled = new TransactionPaymentEventHoldReason("_paymentOperationWasCanceled");
    public static final TransactionPaymentEventHoldReason _systemError = new TransactionPaymentEventHoldReason("_systemError");
    public static final TransactionPaymentEventHoldReason _verbalAuthorizationRequested = new TransactionPaymentEventHoldReason("_verbalAuthorizationRequested");
    public static final TransactionPaymentEventHoldReason _verificationRejection = new TransactionPaymentEventHoldReason("_verificationRejection");
    public static final TransactionPaymentEventHoldReason _verificationRequired = new TransactionPaymentEventHoldReason("_verificationRequired");
    private static TypeDesc typeDesc = new TypeDesc(TransactionPaymentEventHoldReason.class);

    protected TransactionPaymentEventHoldReason(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionPaymentEventHoldReason fromValue(String value) throws IllegalArgumentException {
        TransactionPaymentEventHoldReason enumeration = (TransactionPaymentEventHoldReason)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionPaymentEventHoldReason fromString(String value) throws IllegalArgumentException {
        return TransactionPaymentEventHoldReason.fromValue(value);
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
        return TransactionPaymentEventHoldReason.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason"));
    }
}

