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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
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

public class SiteCategorySearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDateField[] dateViewed;
    private SearchColumnStringField[] description;
    private SearchColumnBooleanField[] excludeFromSitemap;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fullName;
    private SearchColumnBooleanField[] hidden;
    private SearchColumnLongField[] hits;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] longDescription;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] pageTitle;
    private SearchColumnEnumSelectField[] sitemapPriority;
    private SearchColumnStringField[] urlComponent;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SiteCategorySearchRowBasic.class, true);

    public SiteCategorySearchRowBasic() {
    }

    public SiteCategorySearchRowBasic(SearchColumnDateField[] dateViewed, SearchColumnStringField[] description, SearchColumnBooleanField[] excludeFromSitemap, SearchColumnSelectField[] externalId, SearchColumnStringField[] fullName, SearchColumnBooleanField[] hidden, SearchColumnLongField[] hits, SearchColumnSelectField[] internalId, SearchColumnStringField[] longDescription, SearchColumnStringField[] name, SearchColumnStringField[] pageTitle, SearchColumnEnumSelectField[] sitemapPriority, SearchColumnStringField[] urlComponent) {
        this.dateViewed = dateViewed;
        this.description = description;
        this.excludeFromSitemap = excludeFromSitemap;
        this.externalId = externalId;
        this.fullName = fullName;
        this.hidden = hidden;
        this.hits = hits;
        this.internalId = internalId;
        this.longDescription = longDescription;
        this.name = name;
        this.pageTitle = pageTitle;
        this.sitemapPriority = sitemapPriority;
        this.urlComponent = urlComponent;
    }

    public SearchColumnDateField[] getDateViewed() {
        return this.dateViewed;
    }

    public void setDateViewed(SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
    }

    public SearchColumnBooleanField[] getExcludeFromSitemap() {
        return this.excludeFromSitemap;
    }

    public void setExcludeFromSitemap(SearchColumnBooleanField[] excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public SearchColumnBooleanField getExcludeFromSitemap(int i) {
        return this.excludeFromSitemap[i];
    }

    public void setExcludeFromSitemap(int i, SearchColumnBooleanField _value) {
        this.excludeFromSitemap[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnStringField[] getFullName() {
        return this.fullName;
    }

    public void setFullName(SearchColumnStringField[] fullName) {
        this.fullName = fullName;
    }

    public SearchColumnStringField getFullName(int i) {
        return this.fullName[i];
    }

    public void setFullName(int i, SearchColumnStringField _value) {
        this.fullName[i] = _value;
    }

    public SearchColumnBooleanField[] getHidden() {
        return this.hidden;
    }

    public void setHidden(SearchColumnBooleanField[] hidden) {
        this.hidden = hidden;
    }

    public SearchColumnBooleanField getHidden(int i) {
        return this.hidden[i];
    }

    public void setHidden(int i, SearchColumnBooleanField _value) {
        this.hidden[i] = _value;
    }

    public SearchColumnLongField[] getHits() {
        return this.hits;
    }

    public void setHits(SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, SearchColumnLongField _value) {
        this.hits[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnStringField[] getLongDescription() {
        return this.longDescription;
    }

    public void setLongDescription(SearchColumnStringField[] longDescription) {
        this.longDescription = longDescription;
    }

    public SearchColumnStringField getLongDescription(int i) {
        return this.longDescription[i];
    }

    public void setLongDescription(int i, SearchColumnStringField _value) {
        this.longDescription[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnStringField[] getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(SearchColumnStringField[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    public SearchColumnStringField getPageTitle(int i) {
        return this.pageTitle[i];
    }

    public void setPageTitle(int i, SearchColumnStringField _value) {
        this.pageTitle[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSitemapPriority() {
        return this.sitemapPriority;
    }

    public void setSitemapPriority(SearchColumnEnumSelectField[] sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public SearchColumnEnumSelectField getSitemapPriority(int i) {
        return this.sitemapPriority[i];
    }

    public void setSitemapPriority(int i, SearchColumnEnumSelectField _value) {
        this.sitemapPriority[i] = _value;
    }

    public SearchColumnStringField[] getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(SearchColumnStringField[] urlComponent) {
        this.urlComponent = urlComponent;
    }

    public SearchColumnStringField getUrlComponent(int i) {
        return this.urlComponent[i];
    }

    public void setUrlComponent(int i, SearchColumnStringField _value) {
        this.urlComponent[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SiteCategorySearchRowBasic)) {
            return false;
        }
        SiteCategorySearchRowBasic other = (SiteCategorySearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.dateViewed == null && other.getDateViewed() == null || this.dateViewed != null && Arrays.equals(this.dateViewed, other.getDateViewed())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && Arrays.equals(this.excludeFromSitemap, other.getExcludeFromSitemap())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fullName == null && other.getFullName() == null || this.fullName != null && Arrays.equals(this.fullName, other.getFullName())) && (this.hidden == null && other.getHidden() == null || this.hidden != null && Arrays.equals(this.hidden, other.getHidden())) && (this.hits == null && other.getHits() == null || this.hits != null && Arrays.equals(this.hits, other.getHits())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.longDescription == null && other.getLongDescription() == null || this.longDescription != null && Arrays.equals(this.longDescription, other.getLongDescription())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && Arrays.equals(this.pageTitle, other.getPageTitle())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && Arrays.equals(this.sitemapPriority, other.getSitemapPriority())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && Arrays.equals(this.urlComponent, other.getUrlComponent()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getDateViewed() != null) {
            for (i = 0; i < Array.getLength(this.getDateViewed()); ++i) {
                obj = Array.get(this.getDateViewed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExcludeFromSitemap() != null) {
            for (i = 0; i < Array.getLength(this.getExcludeFromSitemap()); ++i) {
                obj = Array.get(this.getExcludeFromSitemap(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFullName() != null) {
            for (i = 0; i < Array.getLength(this.getFullName()); ++i) {
                obj = Array.get(this.getFullName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHidden() != null) {
            for (i = 0; i < Array.getLength(this.getHidden()); ++i) {
                obj = Array.get(this.getHidden(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHits() != null) {
            for (i = 0; i < Array.getLength(this.getHits()); ++i) {
                obj = Array.get(this.getHits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLongDescription() != null) {
            for (i = 0; i < Array.getLength(this.getLongDescription()); ++i) {
                obj = Array.get(this.getLongDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPageTitle() != null) {
            for (i = 0; i < Array.getLength(this.getPageTitle()); ++i) {
                obj = Array.get(this.getPageTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSitemapPriority() != null) {
            for (i = 0; i < Array.getLength(this.getSitemapPriority()); ++i) {
                obj = Array.get(this.getSitemapPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUrlComponent() != null) {
            for (i = 0; i < Array.getLength(this.getUrlComponent()); ++i) {
                obj = Array.get(this.getUrlComponent(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fullName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hidden"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("longDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "longDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

