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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PaymentInstrumentSupportedOperation;
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

public class GeneralTokenSupportedOperationsListList
implements Serializable {
    private PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GeneralTokenSupportedOperationsListList.class, true);

    public GeneralTokenSupportedOperationsListList() {
    }

    public GeneralTokenSupportedOperationsListList(PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList) {
        this.generalTokenSupportedOperationsList = generalTokenSupportedOperationsList;
    }

    public PaymentInstrumentSupportedOperation[] getGeneralTokenSupportedOperationsList() {
        return this.generalTokenSupportedOperationsList;
    }

    public void setGeneralTokenSupportedOperationsList(PaymentInstrumentSupportedOperation[] generalTokenSupportedOperationsList) {
        this.generalTokenSupportedOperationsList = generalTokenSupportedOperationsList;
    }

    public PaymentInstrumentSupportedOperation getGeneralTokenSupportedOperationsList(int i) {
        return this.generalTokenSupportedOperationsList[i];
    }

    public void setGeneralTokenSupportedOperationsList(int i, PaymentInstrumentSupportedOperation _value) {
        this.generalTokenSupportedOperationsList[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeneralTokenSupportedOperationsListList)) {
            return false;
        }
        GeneralTokenSupportedOperationsListList other = (GeneralTokenSupportedOperationsListList)obj;
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
        boolean _equals = this.generalTokenSupportedOperationsList == null && other.getGeneralTokenSupportedOperationsList() == null || this.generalTokenSupportedOperationsList != null && Arrays.equals(this.generalTokenSupportedOperationsList, other.getGeneralTokenSupportedOperationsList());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getGeneralTokenSupportedOperationsList() != null) {
            for (int i = 0; i < Array.getLength(this.getGeneralTokenSupportedOperationsList()); ++i) {
                Object obj = Array.get(this.getGeneralTokenSupportedOperationsList(), i);
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "GeneralTokenSupportedOperationsListList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("generalTokenSupportedOperationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "GeneralTokenSupportedOperationsList"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentInstrumentSupportedOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

