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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Status;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchResult
implements Serializable {
    private Status status;
    private Integer totalRecords;
    private Integer pageSize;
    private Integer totalPages;
    private Integer pageIndex;
    private String searchId;
    private RecordList recordList;
    private SearchRowList searchRowList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchResult.class, true);

    public SearchResult() {
    }

    public SearchResult(Status status, Integer totalRecords, Integer pageSize, Integer totalPages, Integer pageIndex, String searchId, RecordList recordList, SearchRowList searchRowList) {
        this.status = status;
        this.totalRecords = totalRecords;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.pageIndex = pageIndex;
        this.searchId = searchId;
        this.recordList = recordList;
        this.searchRowList = searchRowList;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return this.totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getSearchId() {
        return this.searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public RecordList getRecordList() {
        return this.recordList;
    }

    public void setRecordList(RecordList recordList) {
        this.recordList = recordList;
    }

    public SearchRowList getSearchRowList() {
        return this.searchRowList;
    }

    public void setSearchRowList(SearchRowList searchRowList) {
        this.searchRowList = searchRowList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        SearchResult other = (SearchResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.pageSize == null && other.getPageSize() == null || this.pageSize != null && this.pageSize.equals(other.getPageSize())) && (this.totalPages == null && other.getTotalPages() == null || this.totalPages != null && this.totalPages.equals(other.getTotalPages())) && (this.pageIndex == null && other.getPageIndex() == null || this.pageIndex != null && this.pageIndex.equals(other.getPageIndex())) && (this.searchId == null && other.getSearchId() == null || this.searchId != null && this.searchId.equals(other.getSearchId())) && (this.recordList == null && other.getRecordList() == null || this.recordList != null && this.recordList.equals(other.getRecordList())) && (this.searchRowList == null && other.getSearchRowList() == null || this.searchRowList != null && this.searchRowList.equals(other.getSearchRowList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTotalRecords() != null) {
            _hashCode += this.getTotalRecords().hashCode();
        }
        if (this.getPageSize() != null) {
            _hashCode += this.getPageSize().hashCode();
        }
        if (this.getTotalPages() != null) {
            _hashCode += this.getTotalPages().hashCode();
        }
        if (this.getPageIndex() != null) {
            _hashCode += this.getPageIndex().hashCode();
        }
        if (this.getSearchId() != null) {
            _hashCode += this.getSearchId().hashCode();
        }
        if (this.getRecordList() != null) {
            _hashCode += this.getRecordList().hashCode();
        }
        if (this.getSearchRowList() != null) {
            _hashCode += this.getSearchRowList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "totalRecords"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "pageSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "totalPages"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "pageIndex"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchId");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "recordList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchRowList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchRowList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchRowList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

