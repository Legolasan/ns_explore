/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTranslationsList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecord
extends Record
implements Serializable {
    private String customRecordId;
    private RecordRef customForm;
    private Boolean isInactive;
    private RecordRef parent;
    private String disclaimer;
    private Calendar created;
    private Calendar lastModified;
    private String name;
    private Boolean autoName;
    private String altName;
    private RecordRef owner;
    private RecordRef recType;
    private Boolean enableNumbering;
    private String numberingPrefix;
    private String numberingSuffix;
    private Long numberingMinDigits;
    private String description;
    private Long numberingInit;
    private Long numberingCurrentNumber;
    private Boolean allowNumberingOverride;
    private Boolean isNumberingUpdateable;
    private CustomRecordTranslationsList translationsList;
    private Boolean includeName;
    private Boolean showId;
    private Boolean showCreationDate;
    private Boolean showCreationDateOnList;
    private Boolean showLastModified;
    private Boolean showLastModifiedOnList;
    private Boolean showOwner;
    private Boolean showOwnerOnList;
    private Boolean showOwnerAllowChange;
    private Boolean usePermissions;
    private Boolean allowAttachments;
    private Boolean showNotes;
    private Boolean enablEmailMerge;
    private Boolean isOrdered;
    private Boolean allowInlineEditing;
    private Boolean isAvailableOffline;
    private Boolean allowQuickSearch;
    private String recordName;
    private String scriptId;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecord.class, true);

    public CustomRecord() {
    }

    public CustomRecord(NullField nullFieldList, String internalId, String externalId, String customRecordId, RecordRef customForm, Boolean isInactive, RecordRef parent, String disclaimer, Calendar created, Calendar lastModified, String name, Boolean autoName, String altName, RecordRef owner, RecordRef recType, Boolean enableNumbering, String numberingPrefix, String numberingSuffix, Long numberingMinDigits, String description, Long numberingInit, Long numberingCurrentNumber, Boolean allowNumberingOverride, Boolean isNumberingUpdateable, CustomRecordTranslationsList translationsList, Boolean includeName, Boolean showId, Boolean showCreationDate, Boolean showCreationDateOnList, Boolean showLastModified, Boolean showLastModifiedOnList, Boolean showOwner, Boolean showOwnerOnList, Boolean showOwnerAllowChange, Boolean usePermissions, Boolean allowAttachments, Boolean showNotes, Boolean enablEmailMerge, Boolean isOrdered, Boolean allowInlineEditing, Boolean isAvailableOffline, Boolean allowQuickSearch, String recordName, String scriptId, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customRecordId = customRecordId;
        this.customForm = customForm;
        this.isInactive = isInactive;
        this.parent = parent;
        this.disclaimer = disclaimer;
        this.created = created;
        this.lastModified = lastModified;
        this.name = name;
        this.autoName = autoName;
        this.altName = altName;
        this.owner = owner;
        this.recType = recType;
        this.enableNumbering = enableNumbering;
        this.numberingPrefix = numberingPrefix;
        this.numberingSuffix = numberingSuffix;
        this.numberingMinDigits = numberingMinDigits;
        this.description = description;
        this.numberingInit = numberingInit;
        this.numberingCurrentNumber = numberingCurrentNumber;
        this.allowNumberingOverride = allowNumberingOverride;
        this.isNumberingUpdateable = isNumberingUpdateable;
        this.translationsList = translationsList;
        this.includeName = includeName;
        this.showId = showId;
        this.showCreationDate = showCreationDate;
        this.showCreationDateOnList = showCreationDateOnList;
        this.showLastModified = showLastModified;
        this.showLastModifiedOnList = showLastModifiedOnList;
        this.showOwner = showOwner;
        this.showOwnerOnList = showOwnerOnList;
        this.showOwnerAllowChange = showOwnerAllowChange;
        this.usePermissions = usePermissions;
        this.allowAttachments = allowAttachments;
        this.showNotes = showNotes;
        this.enablEmailMerge = enablEmailMerge;
        this.isOrdered = isOrdered;
        this.allowInlineEditing = allowInlineEditing;
        this.isAvailableOffline = isAvailableOffline;
        this.allowQuickSearch = allowQuickSearch;
        this.recordName = recordName;
        this.scriptId = scriptId;
        this.customFieldList = customFieldList;
    }

    public String getCustomRecordId() {
        return this.customRecordId;
    }

    public void setCustomRecordId(String customRecordId) {
        this.customRecordId = customRecordId;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Calendar getCreated() {
        return this.created;
    }

    public void setCreated(Calendar created) {
        this.created = created;
    }

    public Calendar getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(Calendar lastModified) {
        this.lastModified = lastModified;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAutoName() {
        return this.autoName;
    }

    public void setAutoName(Boolean autoName) {
        this.autoName = autoName;
    }

    public String getAltName() {
        return this.altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public RecordRef getRecType() {
        return this.recType;
    }

    public void setRecType(RecordRef recType) {
        this.recType = recType;
    }

    public Boolean getEnableNumbering() {
        return this.enableNumbering;
    }

    public void setEnableNumbering(Boolean enableNumbering) {
        this.enableNumbering = enableNumbering;
    }

    public String getNumberingPrefix() {
        return this.numberingPrefix;
    }

    public void setNumberingPrefix(String numberingPrefix) {
        this.numberingPrefix = numberingPrefix;
    }

    public String getNumberingSuffix() {
        return this.numberingSuffix;
    }

    public void setNumberingSuffix(String numberingSuffix) {
        this.numberingSuffix = numberingSuffix;
    }

    public Long getNumberingMinDigits() {
        return this.numberingMinDigits;
    }

    public void setNumberingMinDigits(Long numberingMinDigits) {
        this.numberingMinDigits = numberingMinDigits;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNumberingInit() {
        return this.numberingInit;
    }

    public void setNumberingInit(Long numberingInit) {
        this.numberingInit = numberingInit;
    }

    public Long getNumberingCurrentNumber() {
        return this.numberingCurrentNumber;
    }

    public void setNumberingCurrentNumber(Long numberingCurrentNumber) {
        this.numberingCurrentNumber = numberingCurrentNumber;
    }

    public Boolean getAllowNumberingOverride() {
        return this.allowNumberingOverride;
    }

    public void setAllowNumberingOverride(Boolean allowNumberingOverride) {
        this.allowNumberingOverride = allowNumberingOverride;
    }

    public Boolean getIsNumberingUpdateable() {
        return this.isNumberingUpdateable;
    }

    public void setIsNumberingUpdateable(Boolean isNumberingUpdateable) {
        this.isNumberingUpdateable = isNumberingUpdateable;
    }

    public CustomRecordTranslationsList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(CustomRecordTranslationsList translationsList) {
        this.translationsList = translationsList;
    }

    public Boolean getIncludeName() {
        return this.includeName;
    }

    public void setIncludeName(Boolean includeName) {
        this.includeName = includeName;
    }

    public Boolean getShowId() {
        return this.showId;
    }

    public void setShowId(Boolean showId) {
        this.showId = showId;
    }

    public Boolean getShowCreationDate() {
        return this.showCreationDate;
    }

    public void setShowCreationDate(Boolean showCreationDate) {
        this.showCreationDate = showCreationDate;
    }

    public Boolean getShowCreationDateOnList() {
        return this.showCreationDateOnList;
    }

    public void setShowCreationDateOnList(Boolean showCreationDateOnList) {
        this.showCreationDateOnList = showCreationDateOnList;
    }

    public Boolean getShowLastModified() {
        return this.showLastModified;
    }

    public void setShowLastModified(Boolean showLastModified) {
        this.showLastModified = showLastModified;
    }

    public Boolean getShowLastModifiedOnList() {
        return this.showLastModifiedOnList;
    }

    public void setShowLastModifiedOnList(Boolean showLastModifiedOnList) {
        this.showLastModifiedOnList = showLastModifiedOnList;
    }

    public Boolean getShowOwner() {
        return this.showOwner;
    }

    public void setShowOwner(Boolean showOwner) {
        this.showOwner = showOwner;
    }

    public Boolean getShowOwnerOnList() {
        return this.showOwnerOnList;
    }

    public void setShowOwnerOnList(Boolean showOwnerOnList) {
        this.showOwnerOnList = showOwnerOnList;
    }

    public Boolean getShowOwnerAllowChange() {
        return this.showOwnerAllowChange;
    }

    public void setShowOwnerAllowChange(Boolean showOwnerAllowChange) {
        this.showOwnerAllowChange = showOwnerAllowChange;
    }

    public Boolean getUsePermissions() {
        return this.usePermissions;
    }

    public void setUsePermissions(Boolean usePermissions) {
        this.usePermissions = usePermissions;
    }

    public Boolean getAllowAttachments() {
        return this.allowAttachments;
    }

    public void setAllowAttachments(Boolean allowAttachments) {
        this.allowAttachments = allowAttachments;
    }

    public Boolean getShowNotes() {
        return this.showNotes;
    }

    public void setShowNotes(Boolean showNotes) {
        this.showNotes = showNotes;
    }

    public Boolean getEnablEmailMerge() {
        return this.enablEmailMerge;
    }

    public void setEnablEmailMerge(Boolean enablEmailMerge) {
        this.enablEmailMerge = enablEmailMerge;
    }

    public Boolean getIsOrdered() {
        return this.isOrdered;
    }

    public void setIsOrdered(Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public Boolean getAllowInlineEditing() {
        return this.allowInlineEditing;
    }

    public void setAllowInlineEditing(Boolean allowInlineEditing) {
        this.allowInlineEditing = allowInlineEditing;
    }

    public Boolean getIsAvailableOffline() {
        return this.isAvailableOffline;
    }

    public void setIsAvailableOffline(Boolean isAvailableOffline) {
        this.isAvailableOffline = isAvailableOffline;
    }

    public Boolean getAllowQuickSearch() {
        return this.allowQuickSearch;
    }

    public void setAllowQuickSearch(Boolean allowQuickSearch) {
        this.allowQuickSearch = allowQuickSearch;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecord)) {
            return false;
        }
        CustomRecord other = (CustomRecord)obj;
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
        boolean _equals = super.equals(obj) && (this.customRecordId == null && other.getCustomRecordId() == null || this.customRecordId != null && this.customRecordId.equals(other.getCustomRecordId())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.disclaimer == null && other.getDisclaimer() == null || this.disclaimer != null && this.disclaimer.equals(other.getDisclaimer())) && (this.created == null && other.getCreated() == null || this.created != null && this.created.equals(other.getCreated())) && (this.lastModified == null && other.getLastModified() == null || this.lastModified != null && this.lastModified.equals(other.getLastModified())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.autoName == null && other.getAutoName() == null || this.autoName != null && this.autoName.equals(other.getAutoName())) && (this.altName == null && other.getAltName() == null || this.altName != null && this.altName.equals(other.getAltName())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.recType == null && other.getRecType() == null || this.recType != null && this.recType.equals(other.getRecType())) && (this.enableNumbering == null && other.getEnableNumbering() == null || this.enableNumbering != null && this.enableNumbering.equals(other.getEnableNumbering())) && (this.numberingPrefix == null && other.getNumberingPrefix() == null || this.numberingPrefix != null && this.numberingPrefix.equals(other.getNumberingPrefix())) && (this.numberingSuffix == null && other.getNumberingSuffix() == null || this.numberingSuffix != null && this.numberingSuffix.equals(other.getNumberingSuffix())) && (this.numberingMinDigits == null && other.getNumberingMinDigits() == null || this.numberingMinDigits != null && this.numberingMinDigits.equals(other.getNumberingMinDigits())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.numberingInit == null && other.getNumberingInit() == null || this.numberingInit != null && this.numberingInit.equals(other.getNumberingInit())) && (this.numberingCurrentNumber == null && other.getNumberingCurrentNumber() == null || this.numberingCurrentNumber != null && this.numberingCurrentNumber.equals(other.getNumberingCurrentNumber())) && (this.allowNumberingOverride == null && other.getAllowNumberingOverride() == null || this.allowNumberingOverride != null && this.allowNumberingOverride.equals(other.getAllowNumberingOverride())) && (this.isNumberingUpdateable == null && other.getIsNumberingUpdateable() == null || this.isNumberingUpdateable != null && this.isNumberingUpdateable.equals(other.getIsNumberingUpdateable())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.includeName == null && other.getIncludeName() == null || this.includeName != null && this.includeName.equals(other.getIncludeName())) && (this.showId == null && other.getShowId() == null || this.showId != null && this.showId.equals(other.getShowId())) && (this.showCreationDate == null && other.getShowCreationDate() == null || this.showCreationDate != null && this.showCreationDate.equals(other.getShowCreationDate())) && (this.showCreationDateOnList == null && other.getShowCreationDateOnList() == null || this.showCreationDateOnList != null && this.showCreationDateOnList.equals(other.getShowCreationDateOnList())) && (this.showLastModified == null && other.getShowLastModified() == null || this.showLastModified != null && this.showLastModified.equals(other.getShowLastModified())) && (this.showLastModifiedOnList == null && other.getShowLastModifiedOnList() == null || this.showLastModifiedOnList != null && this.showLastModifiedOnList.equals(other.getShowLastModifiedOnList())) && (this.showOwner == null && other.getShowOwner() == null || this.showOwner != null && this.showOwner.equals(other.getShowOwner())) && (this.showOwnerOnList == null && other.getShowOwnerOnList() == null || this.showOwnerOnList != null && this.showOwnerOnList.equals(other.getShowOwnerOnList())) && (this.showOwnerAllowChange == null && other.getShowOwnerAllowChange() == null || this.showOwnerAllowChange != null && this.showOwnerAllowChange.equals(other.getShowOwnerAllowChange())) && (this.usePermissions == null && other.getUsePermissions() == null || this.usePermissions != null && this.usePermissions.equals(other.getUsePermissions())) && (this.allowAttachments == null && other.getAllowAttachments() == null || this.allowAttachments != null && this.allowAttachments.equals(other.getAllowAttachments())) && (this.showNotes == null && other.getShowNotes() == null || this.showNotes != null && this.showNotes.equals(other.getShowNotes())) && (this.enablEmailMerge == null && other.getEnablEmailMerge() == null || this.enablEmailMerge != null && this.enablEmailMerge.equals(other.getEnablEmailMerge())) && (this.isOrdered == null && other.getIsOrdered() == null || this.isOrdered != null && this.isOrdered.equals(other.getIsOrdered())) && (this.allowInlineEditing == null && other.getAllowInlineEditing() == null || this.allowInlineEditing != null && this.allowInlineEditing.equals(other.getAllowInlineEditing())) && (this.isAvailableOffline == null && other.getIsAvailableOffline() == null || this.isAvailableOffline != null && this.isAvailableOffline.equals(other.getIsAvailableOffline())) && (this.allowQuickSearch == null && other.getAllowQuickSearch() == null || this.allowQuickSearch != null && this.allowQuickSearch.equals(other.getAllowQuickSearch())) && (this.recordName == null && other.getRecordName() == null || this.recordName != null && this.recordName.equals(other.getRecordName())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getCustomRecordId() != null) {
            _hashCode += this.getCustomRecordId().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getDisclaimer() != null) {
            _hashCode += this.getDisclaimer().hashCode();
        }
        if (this.getCreated() != null) {
            _hashCode += this.getCreated().hashCode();
        }
        if (this.getLastModified() != null) {
            _hashCode += this.getLastModified().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getAutoName() != null) {
            _hashCode += this.getAutoName().hashCode();
        }
        if (this.getAltName() != null) {
            _hashCode += this.getAltName().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getRecType() != null) {
            _hashCode += this.getRecType().hashCode();
        }
        if (this.getEnableNumbering() != null) {
            _hashCode += this.getEnableNumbering().hashCode();
        }
        if (this.getNumberingPrefix() != null) {
            _hashCode += this.getNumberingPrefix().hashCode();
        }
        if (this.getNumberingSuffix() != null) {
            _hashCode += this.getNumberingSuffix().hashCode();
        }
        if (this.getNumberingMinDigits() != null) {
            _hashCode += this.getNumberingMinDigits().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getNumberingInit() != null) {
            _hashCode += this.getNumberingInit().hashCode();
        }
        if (this.getNumberingCurrentNumber() != null) {
            _hashCode += this.getNumberingCurrentNumber().hashCode();
        }
        if (this.getAllowNumberingOverride() != null) {
            _hashCode += this.getAllowNumberingOverride().hashCode();
        }
        if (this.getIsNumberingUpdateable() != null) {
            _hashCode += this.getIsNumberingUpdateable().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getIncludeName() != null) {
            _hashCode += this.getIncludeName().hashCode();
        }
        if (this.getShowId() != null) {
            _hashCode += this.getShowId().hashCode();
        }
        if (this.getShowCreationDate() != null) {
            _hashCode += this.getShowCreationDate().hashCode();
        }
        if (this.getShowCreationDateOnList() != null) {
            _hashCode += this.getShowCreationDateOnList().hashCode();
        }
        if (this.getShowLastModified() != null) {
            _hashCode += this.getShowLastModified().hashCode();
        }
        if (this.getShowLastModifiedOnList() != null) {
            _hashCode += this.getShowLastModifiedOnList().hashCode();
        }
        if (this.getShowOwner() != null) {
            _hashCode += this.getShowOwner().hashCode();
        }
        if (this.getShowOwnerOnList() != null) {
            _hashCode += this.getShowOwnerOnList().hashCode();
        }
        if (this.getShowOwnerAllowChange() != null) {
            _hashCode += this.getShowOwnerAllowChange().hashCode();
        }
        if (this.getUsePermissions() != null) {
            _hashCode += this.getUsePermissions().hashCode();
        }
        if (this.getAllowAttachments() != null) {
            _hashCode += this.getAllowAttachments().hashCode();
        }
        if (this.getShowNotes() != null) {
            _hashCode += this.getShowNotes().hashCode();
        }
        if (this.getEnablEmailMerge() != null) {
            _hashCode += this.getEnablEmailMerge().hashCode();
        }
        if (this.getIsOrdered() != null) {
            _hashCode += this.getIsOrdered().hashCode();
        }
        if (this.getAllowInlineEditing() != null) {
            _hashCode += this.getAllowInlineEditing().hashCode();
        }
        if (this.getIsAvailableOffline() != null) {
            _hashCode += this.getIsAvailableOffline().hashCode();
        }
        if (this.getAllowQuickSearch() != null) {
            _hashCode += this.getAllowQuickSearch().hashCode();
        }
        if (this.getRecordName() != null) {
            _hashCode += this.getRecordName().hashCode();
        }
        if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecord"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("customRecordId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customRecordId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "disclaimer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "autoName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableNumbering");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "enableNumbering"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberingPrefix");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "numberingPrefix"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberingSuffix");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "numberingSuffix"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberingMinDigits");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "numberingMinDigits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberingInit");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "numberingInit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberingCurrentNumber");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "numberingCurrentNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowNumberingOverride");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "allowNumberingOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isNumberingUpdateable");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isNumberingUpdateable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTranslationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "includeName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showCreationDate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showCreationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showCreationDateOnList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showCreationDateOnList"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showLastModified");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showLastModified"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showLastModifiedOnList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showLastModifiedOnList"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showOwner");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showOwner"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showOwnerOnList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showOwnerOnList"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showOwnerAllowChange");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showOwnerAllowChange"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usePermissions");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "usePermissions"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowAttachments");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "allowAttachments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showNotes");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showNotes"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enablEmailMerge");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "enablEmailMerge"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowInlineEditing");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "allowInlineEditing"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAvailableOffline");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isAvailableOffline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowQuickSearch");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "allowQuickSearch"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

