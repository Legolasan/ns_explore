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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomRecordTypePermissionsPermittedLevel;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomRecordTypePermissionsRestriction;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTypePermissions
implements Serializable {
    private RecordRef permittedRole;
    private CustomRecordTypePermissionsPermittedLevel permittedLevel;
    private CustomRecordTypePermissionsRestriction restriction;
    private RecordRef defaultForm;
    private Boolean restrictForm;
    private RecordRef searchForm;
    private RecordRef searchResults;
    private RecordRef listView;
    private Boolean listViewRestricted;
    private RecordRef dashboardView;
    private Boolean restrictDashboardView;
    private RecordRef sublistView;
    private Boolean restrictSublistView;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypePermissions.class, true);

    public CustomRecordTypePermissions() {
    }

    public CustomRecordTypePermissions(RecordRef permittedRole, CustomRecordTypePermissionsPermittedLevel permittedLevel, CustomRecordTypePermissionsRestriction restriction, RecordRef defaultForm, Boolean restrictForm, RecordRef searchForm, RecordRef searchResults, RecordRef listView, Boolean listViewRestricted, RecordRef dashboardView, Boolean restrictDashboardView, RecordRef sublistView, Boolean restrictSublistView) {
        this.permittedRole = permittedRole;
        this.permittedLevel = permittedLevel;
        this.restriction = restriction;
        this.defaultForm = defaultForm;
        this.restrictForm = restrictForm;
        this.searchForm = searchForm;
        this.searchResults = searchResults;
        this.listView = listView;
        this.listViewRestricted = listViewRestricted;
        this.dashboardView = dashboardView;
        this.restrictDashboardView = restrictDashboardView;
        this.sublistView = sublistView;
        this.restrictSublistView = restrictSublistView;
    }

    public RecordRef getPermittedRole() {
        return this.permittedRole;
    }

    public void setPermittedRole(RecordRef permittedRole) {
        this.permittedRole = permittedRole;
    }

    public CustomRecordTypePermissionsPermittedLevel getPermittedLevel() {
        return this.permittedLevel;
    }

    public void setPermittedLevel(CustomRecordTypePermissionsPermittedLevel permittedLevel) {
        this.permittedLevel = permittedLevel;
    }

    public CustomRecordTypePermissionsRestriction getRestriction() {
        return this.restriction;
    }

    public void setRestriction(CustomRecordTypePermissionsRestriction restriction) {
        this.restriction = restriction;
    }

    public RecordRef getDefaultForm() {
        return this.defaultForm;
    }

    public void setDefaultForm(RecordRef defaultForm) {
        this.defaultForm = defaultForm;
    }

    public Boolean getRestrictForm() {
        return this.restrictForm;
    }

    public void setRestrictForm(Boolean restrictForm) {
        this.restrictForm = restrictForm;
    }

    public RecordRef getSearchForm() {
        return this.searchForm;
    }

    public void setSearchForm(RecordRef searchForm) {
        this.searchForm = searchForm;
    }

    public RecordRef getSearchResults() {
        return this.searchResults;
    }

    public void setSearchResults(RecordRef searchResults) {
        this.searchResults = searchResults;
    }

    public RecordRef getListView() {
        return this.listView;
    }

    public void setListView(RecordRef listView) {
        this.listView = listView;
    }

    public Boolean getListViewRestricted() {
        return this.listViewRestricted;
    }

    public void setListViewRestricted(Boolean listViewRestricted) {
        this.listViewRestricted = listViewRestricted;
    }

    public RecordRef getDashboardView() {
        return this.dashboardView;
    }

    public void setDashboardView(RecordRef dashboardView) {
        this.dashboardView = dashboardView;
    }

    public Boolean getRestrictDashboardView() {
        return this.restrictDashboardView;
    }

    public void setRestrictDashboardView(Boolean restrictDashboardView) {
        this.restrictDashboardView = restrictDashboardView;
    }

    public RecordRef getSublistView() {
        return this.sublistView;
    }

    public void setSublistView(RecordRef sublistView) {
        this.sublistView = sublistView;
    }

    public Boolean getRestrictSublistView() {
        return this.restrictSublistView;
    }

    public void setRestrictSublistView(Boolean restrictSublistView) {
        this.restrictSublistView = restrictSublistView;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordTypePermissions)) {
            return false;
        }
        CustomRecordTypePermissions other = (CustomRecordTypePermissions)obj;
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
        boolean _equals = (this.permittedRole == null && other.getPermittedRole() == null || this.permittedRole != null && this.permittedRole.equals(other.getPermittedRole())) && (this.permittedLevel == null && other.getPermittedLevel() == null || this.permittedLevel != null && this.permittedLevel.equals(other.getPermittedLevel())) && (this.restriction == null && other.getRestriction() == null || this.restriction != null && this.restriction.equals(other.getRestriction())) && (this.defaultForm == null && other.getDefaultForm() == null || this.defaultForm != null && this.defaultForm.equals(other.getDefaultForm())) && (this.restrictForm == null && other.getRestrictForm() == null || this.restrictForm != null && this.restrictForm.equals(other.getRestrictForm())) && (this.searchForm == null && other.getSearchForm() == null || this.searchForm != null && this.searchForm.equals(other.getSearchForm())) && (this.searchResults == null && other.getSearchResults() == null || this.searchResults != null && this.searchResults.equals(other.getSearchResults())) && (this.listView == null && other.getListView() == null || this.listView != null && this.listView.equals(other.getListView())) && (this.listViewRestricted == null && other.getListViewRestricted() == null || this.listViewRestricted != null && this.listViewRestricted.equals(other.getListViewRestricted())) && (this.dashboardView == null && other.getDashboardView() == null || this.dashboardView != null && this.dashboardView.equals(other.getDashboardView())) && (this.restrictDashboardView == null && other.getRestrictDashboardView() == null || this.restrictDashboardView != null && this.restrictDashboardView.equals(other.getRestrictDashboardView())) && (this.sublistView == null && other.getSublistView() == null || this.sublistView != null && this.sublistView.equals(other.getSublistView())) && (this.restrictSublistView == null && other.getRestrictSublistView() == null || this.restrictSublistView != null && this.restrictSublistView.equals(other.getRestrictSublistView()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPermittedRole() != null) {
            _hashCode += this.getPermittedRole().hashCode();
        }
        if (this.getPermittedLevel() != null) {
            _hashCode += this.getPermittedLevel().hashCode();
        }
        if (this.getRestriction() != null) {
            _hashCode += this.getRestriction().hashCode();
        }
        if (this.getDefaultForm() != null) {
            _hashCode += this.getDefaultForm().hashCode();
        }
        if (this.getRestrictForm() != null) {
            _hashCode += this.getRestrictForm().hashCode();
        }
        if (this.getSearchForm() != null) {
            _hashCode += this.getSearchForm().hashCode();
        }
        if (this.getSearchResults() != null) {
            _hashCode += this.getSearchResults().hashCode();
        }
        if (this.getListView() != null) {
            _hashCode += this.getListView().hashCode();
        }
        if (this.getListViewRestricted() != null) {
            _hashCode += this.getListViewRestricted().hashCode();
        }
        if (this.getDashboardView() != null) {
            _hashCode += this.getDashboardView().hashCode();
        }
        if (this.getRestrictDashboardView() != null) {
            _hashCode += this.getRestrictDashboardView().hashCode();
        }
        if (this.getSublistView() != null) {
            _hashCode += this.getSublistView().hashCode();
        }
        if (this.getRestrictSublistView() != null) {
            _hashCode += this.getRestrictSublistView().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypePermissions"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("permittedRole");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "permittedRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permittedLevel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "permittedLevel"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsPermittedLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restriction");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "restriction"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsRestriction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "defaultForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "restrictForm"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "searchForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchResults");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "searchResults"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("listView");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "listView"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("listViewRestricted");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "listViewRestricted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dashboardView");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "dashboardView"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictDashboardView");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "restrictDashboardView"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sublistView");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sublistView"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictSublistView");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "restrictSublistView"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

