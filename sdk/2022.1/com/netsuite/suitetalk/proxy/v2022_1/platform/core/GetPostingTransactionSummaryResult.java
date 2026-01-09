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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryList;
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

public class GetPostingTransactionSummaryResult
implements Serializable {
    private Status status;
    private Integer totalRecords;
    private Integer pageSize;
    private Integer totalPages;
    private Integer pageIndex;
    private String operationId;
    private PostingTransactionSummaryList postingTransactionSummaryList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetPostingTransactionSummaryResult.class, true);

    public GetPostingTransactionSummaryResult() {
    }

    public GetPostingTransactionSummaryResult(Status status, Integer totalRecords, Integer pageSize, Integer totalPages, Integer pageIndex, String operationId, PostingTransactionSummaryList postingTransactionSummaryList) {
        this.status = status;
        this.totalRecords = totalRecords;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.pageIndex = pageIndex;
        this.operationId = operationId;
        this.postingTransactionSummaryList = postingTransactionSummaryList;
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

    public String getOperationId() {
        return this.operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public PostingTransactionSummaryList getPostingTransactionSummaryList() {
        return this.postingTransactionSummaryList;
    }

    public void setPostingTransactionSummaryList(PostingTransactionSummaryList postingTransactionSummaryList) {
        this.postingTransactionSummaryList = postingTransactionSummaryList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetPostingTransactionSummaryResult)) {
            return false;
        }
        GetPostingTransactionSummaryResult other = (GetPostingTransactionSummaryResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.pageSize == null && other.getPageSize() == null || this.pageSize != null && this.pageSize.equals(other.getPageSize())) && (this.totalPages == null && other.getTotalPages() == null || this.totalPages != null && this.totalPages.equals(other.getTotalPages())) && (this.pageIndex == null && other.getPageIndex() == null || this.pageIndex != null && this.pageIndex.equals(other.getPageIndex())) && (this.operationId == null && other.getOperationId() == null || this.operationId != null && this.operationId.equals(other.getOperationId())) && (this.postingTransactionSummaryList == null && other.getPostingTransactionSummaryList() == null || this.postingTransactionSummaryList != null && this.postingTransactionSummaryList.equals(other.getPostingTransactionSummaryList()));
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
        if (this.getOperationId() != null) {
            _hashCode += this.getOperationId().hashCode();
        }
        if (this.getPostingTransactionSummaryList() != null) {
            _hashCode += this.getPostingTransactionSummaryList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetPostingTransactionSummaryResult"));
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
        elemField.setFieldName("operationId");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "operationId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingTransactionSummaryList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "postingTransactionSummaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "PostingTransactionSummaryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

