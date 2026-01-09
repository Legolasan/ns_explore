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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

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

public class EmployeeHrEducation
implements Serializable {
    private RecordRef education;
    private String degree;
    private Calendar degreeDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeHrEducation.class, true);

    public EmployeeHrEducation() {
    }

    public EmployeeHrEducation(RecordRef education, String degree, Calendar degreeDate) {
        this.education = education;
        this.degree = degree;
        this.degreeDate = degreeDate;
    }

    public RecordRef getEducation() {
        return this.education;
    }

    public void setEducation(RecordRef education) {
        this.education = education;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Calendar getDegreeDate() {
        return this.degreeDate;
    }

    public void setDegreeDate(Calendar degreeDate) {
        this.degreeDate = degreeDate;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeHrEducation)) {
            return false;
        }
        EmployeeHrEducation other = (EmployeeHrEducation)obj;
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
        boolean _equals = (this.education == null && other.getEducation() == null || this.education != null && this.education.equals(other.getEducation())) && (this.degree == null && other.getDegree() == null || this.degree != null && this.degree.equals(other.getDegree())) && (this.degreeDate == null && other.getDegreeDate() == null || this.degreeDate != null && this.degreeDate.equals(other.getDegreeDate()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getEducation() != null) {
            _hashCode += this.getEducation().hashCode();
        }
        if (this.getDegree() != null) {
            _hashCode += this.getDegree().hashCode();
        }
        if (this.getDegreeDate() != null) {
            _hashCode += this.getDegreeDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeHrEducation"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "education"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("degree");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "degree"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("degreeDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "degreeDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

