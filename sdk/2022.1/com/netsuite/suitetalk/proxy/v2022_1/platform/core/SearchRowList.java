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

public class SearchRowList
implements Serializable {
    private SearchRow[] searchRow;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchRowList.class, true);

    public SearchRowList() {
    }

    public SearchRowList(SearchRow[] searchRow) {
        this.searchRow = searchRow;
    }

    public SearchRow[] getSearchRow() {
        return this.searchRow;
    }

    public void setSearchRow(SearchRow[] searchRow) {
        this.searchRow = searchRow;
    }

    public SearchRow getSearchRow(int i) {
        return this.searchRow[i];
    }

    public void setSearchRow(int i, SearchRow _value) {
        this.searchRow[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchRowList)) {
            return false;
        }
        SearchRowList other = (SearchRowList)obj;
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
        boolean _equals = this.searchRow == null && other.getSearchRow() == null || this.searchRow != null && Arrays.equals(this.searchRow, other.getSearchRow());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSearchRow() != null) {
            for (int i = 0; i < Array.getLength(this.getSearchRow()); ++i) {
                Object obj = Array.get(this.getSearchRow(), i);
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchRowList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("searchRow");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchRow"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

