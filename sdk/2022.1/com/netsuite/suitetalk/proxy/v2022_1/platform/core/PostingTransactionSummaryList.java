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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummary;
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

public class PostingTransactionSummaryList
implements Serializable {
    private PostingTransactionSummary[] postingTransactionSummary;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PostingTransactionSummaryList.class, true);

    public PostingTransactionSummaryList() {
    }

    public PostingTransactionSummaryList(PostingTransactionSummary[] postingTransactionSummary) {
        this.postingTransactionSummary = postingTransactionSummary;
    }

    public PostingTransactionSummary[] getPostingTransactionSummary() {
        return this.postingTransactionSummary;
    }

    public void setPostingTransactionSummary(PostingTransactionSummary[] postingTransactionSummary) {
        this.postingTransactionSummary = postingTransactionSummary;
    }

    public PostingTransactionSummary getPostingTransactionSummary(int i) {
        return this.postingTransactionSummary[i];
    }

    public void setPostingTransactionSummary(int i, PostingTransactionSummary _value) {
        this.postingTransactionSummary[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PostingTransactionSummaryList)) {
            return false;
        }
        PostingTransactionSummaryList other = (PostingTransactionSummaryList)obj;
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
        boolean _equals = this.postingTransactionSummary == null && other.getPostingTransactionSummary() == null || this.postingTransactionSummary != null && Arrays.equals(this.postingTransactionSummary, other.getPostingTransactionSummary());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPostingTransactionSummary() != null) {
            for (int i = 0; i < Array.getLength(this.getPostingTransactionSummary()); ++i) {
                Object obj = Array.get(this.getPostingTransactionSummary(), i);
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "PostingTransactionSummaryList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("postingTransactionSummary");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "postingTransactionSummary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "PostingTransactionSummary"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

