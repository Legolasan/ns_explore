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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeChildrenList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeFormsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeLinksList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeManagersList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeOnlineFormsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeParentsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypePermissionsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeSublistsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeTabsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomRecordTypeTranslationsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomRecordTypeAccessType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordType
extends Record
implements Serializable {
    private String recordName;
    private Boolean includeName;
    private Boolean showId;
    private Boolean showCreationDate;
    private Boolean showCreationDateOnList;
    private Boolean showLastModified;
    private Boolean showLastModifiedOnList;
    private Boolean showOwner;
    private Boolean showOwnerOnList;
    private Boolean showOwnerAllowChange;
    private CustomRecordTypeAccessType accessType;
    private Boolean allowAttachments;
    private Boolean showNotes;
    private Boolean enableMailMerge;
    private Boolean isOrdered;
    private Boolean isAvailableOffline;
    private Boolean allowQuickSearch;
    private Boolean hierarchical;
    private Boolean enableDle;
    private Boolean enableNameTranslation;
    private Boolean isInactive;
    private String disclaimer;
    private Boolean enableNumbering;
    private String numberingPrefix;
    private String numberingSuffix;
    private Long numberingMinDigits;
    private Long numberingInit;
    private Long numberingCurrentNumber;
    private Boolean allowNumberingOverride;
    private Boolean isNumberingUpdateable;
    private RecordRef owner;
    private String description;
    private CustomRecordTypeTabsList tabsList;
    private CustomRecordTypeSublistsList sublistsList;
    private CustomRecordTypeFormsList formsList;
    private CustomRecordTypeOnlineFormsList onlineFormsList;
    private CustomRecordTypePermissionsList permissionsList;
    private CustomRecordTypeLinksList linksList;
    private CustomRecordTypeManagersList managersList;
    private CustomRecordTypeChildrenList childrenList;
    private CustomRecordTypeParentsList parentsList;
    private CustomRecordTypeTranslationsList translationsList;
    private String scriptId;
    private CustomRecordTypeFieldList customFieldList;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordType.class, true);

    public CustomRecordType() {
    }

    public CustomRecordType(NullField nullFieldList, String internalId, String recordName, Boolean includeName, Boolean showId, Boolean showCreationDate, Boolean showCreationDateOnList, Boolean showLastModified, Boolean showLastModifiedOnList, Boolean showOwner, Boolean showOwnerOnList, Boolean showOwnerAllowChange, CustomRecordTypeAccessType accessType, Boolean allowAttachments, Boolean showNotes, Boolean enableMailMerge, Boolean isOrdered, Boolean isAvailableOffline, Boolean allowQuickSearch, Boolean hierarchical, Boolean enableDle, Boolean enableNameTranslation, Boolean isInactive, String disclaimer, Boolean enableNumbering, String numberingPrefix, String numberingSuffix, Long numberingMinDigits, Long numberingInit, Long numberingCurrentNumber, Boolean allowNumberingOverride, Boolean isNumberingUpdateable, RecordRef owner, String description, CustomRecordTypeTabsList tabsList, CustomRecordTypeSublistsList sublistsList, CustomRecordTypeFormsList formsList, CustomRecordTypeOnlineFormsList onlineFormsList, CustomRecordTypePermissionsList permissionsList, CustomRecordTypeLinksList linksList, CustomRecordTypeManagersList managersList, CustomRecordTypeChildrenList childrenList, CustomRecordTypeParentsList parentsList, CustomRecordTypeTranslationsList translationsList, String scriptId, CustomRecordTypeFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.recordName = recordName;
        this.includeName = includeName;
        this.showId = showId;
        this.showCreationDate = showCreationDate;
        this.showCreationDateOnList = showCreationDateOnList;
        this.showLastModified = showLastModified;
        this.showLastModifiedOnList = showLastModifiedOnList;
        this.showOwner = showOwner;
        this.showOwnerOnList = showOwnerOnList;
        this.showOwnerAllowChange = showOwnerAllowChange;
        this.accessType = accessType;
        this.allowAttachments = allowAttachments;
        this.showNotes = showNotes;
        this.enableMailMerge = enableMailMerge;
        this.isOrdered = isOrdered;
        this.isAvailableOffline = isAvailableOffline;
        this.allowQuickSearch = allowQuickSearch;
        this.hierarchical = hierarchical;
        this.enableDle = enableDle;
        this.enableNameTranslation = enableNameTranslation;
        this.isInactive = isInactive;
        this.disclaimer = disclaimer;
        this.enableNumbering = enableNumbering;
        this.numberingPrefix = numberingPrefix;
        this.numberingSuffix = numberingSuffix;
        this.numberingMinDigits = numberingMinDigits;
        this.numberingInit = numberingInit;
        this.numberingCurrentNumber = numberingCurrentNumber;
        this.allowNumberingOverride = allowNumberingOverride;
        this.isNumberingUpdateable = isNumberingUpdateable;
        this.owner = owner;
        this.description = description;
        this.tabsList = tabsList;
        this.sublistsList = sublistsList;
        this.formsList = formsList;
        this.onlineFormsList = onlineFormsList;
        this.permissionsList = permissionsList;
        this.linksList = linksList;
        this.managersList = managersList;
        this.childrenList = childrenList;
        this.parentsList = parentsList;
        this.translationsList = translationsList;
        this.scriptId = scriptId;
        this.customFieldList = customFieldList;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
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

    public CustomRecordTypeAccessType getAccessType() {
        return this.accessType;
    }

    public void setAccessType(CustomRecordTypeAccessType accessType) {
        this.accessType = accessType;
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

    public Boolean getEnableMailMerge() {
        return this.enableMailMerge;
    }

    public void setEnableMailMerge(Boolean enableMailMerge) {
        this.enableMailMerge = enableMailMerge;
    }

    public Boolean getIsOrdered() {
        return this.isOrdered;
    }

    public void setIsOrdered(Boolean isOrdered) {
        this.isOrdered = isOrdered;
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

    public Boolean getHierarchical() {
        return this.hierarchical;
    }

    public void setHierarchical(Boolean hierarchical) {
        this.hierarchical = hierarchical;
    }

    public Boolean getEnableDle() {
        return this.enableDle;
    }

    public void setEnableDle(Boolean enableDle) {
        this.enableDle = enableDle;
    }

    public Boolean getEnableNameTranslation() {
        return this.enableNameTranslation;
    }

    public void setEnableNameTranslation(Boolean enableNameTranslation) {
        this.enableNameTranslation = enableNameTranslation;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String getDisclaimer() {
        return this.disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
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

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomRecordTypeTabsList getTabsList() {
        return this.tabsList;
    }

    public void setTabsList(CustomRecordTypeTabsList tabsList) {
        this.tabsList = tabsList;
    }

    public CustomRecordTypeSublistsList getSublistsList() {
        return this.sublistsList;
    }

    public void setSublistsList(CustomRecordTypeSublistsList sublistsList) {
        this.sublistsList = sublistsList;
    }

    public CustomRecordTypeFormsList getFormsList() {
        return this.formsList;
    }

    public void setFormsList(CustomRecordTypeFormsList formsList) {
        this.formsList = formsList;
    }

    public CustomRecordTypeOnlineFormsList getOnlineFormsList() {
        return this.onlineFormsList;
    }

    public void setOnlineFormsList(CustomRecordTypeOnlineFormsList onlineFormsList) {
        this.onlineFormsList = onlineFormsList;
    }

    public CustomRecordTypePermissionsList getPermissionsList() {
        return this.permissionsList;
    }

    public void setPermissionsList(CustomRecordTypePermissionsList permissionsList) {
        this.permissionsList = permissionsList;
    }

    public CustomRecordTypeLinksList getLinksList() {
        return this.linksList;
    }

    public void setLinksList(CustomRecordTypeLinksList linksList) {
        this.linksList = linksList;
    }

    public CustomRecordTypeManagersList getManagersList() {
        return this.managersList;
    }

    public void setManagersList(CustomRecordTypeManagersList managersList) {
        this.managersList = managersList;
    }

    public CustomRecordTypeChildrenList getChildrenList() {
        return this.childrenList;
    }

    public void setChildrenList(CustomRecordTypeChildrenList childrenList) {
        this.childrenList = childrenList;
    }

    public CustomRecordTypeParentsList getParentsList() {
        return this.parentsList;
    }

    public void setParentsList(CustomRecordTypeParentsList parentsList) {
        this.parentsList = parentsList;
    }

    public CustomRecordTypeTranslationsList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(CustomRecordTypeTranslationsList translationsList) {
        this.translationsList = translationsList;
    }

    public String getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public CustomRecordTypeFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomRecordTypeFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordType)) {
            return false;
        }
        CustomRecordType other = (CustomRecordType)obj;
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
        boolean _equals = super.equals(obj) && (this.recordName == null && other.getRecordName() == null || this.recordName != null && this.recordName.equals(other.getRecordName())) && (this.includeName == null && other.getIncludeName() == null || this.includeName != null && this.includeName.equals(other.getIncludeName())) && (this.showId == null && other.getShowId() == null || this.showId != null && this.showId.equals(other.getShowId())) && (this.showCreationDate == null && other.getShowCreationDate() == null || this.showCreationDate != null && this.showCreationDate.equals(other.getShowCreationDate())) && (this.showCreationDateOnList == null && other.getShowCreationDateOnList() == null || this.showCreationDateOnList != null && this.showCreationDateOnList.equals(other.getShowCreationDateOnList())) && (this.showLastModified == null && other.getShowLastModified() == null || this.showLastModified != null && this.showLastModified.equals(other.getShowLastModified())) && (this.showLastModifiedOnList == null && other.getShowLastModifiedOnList() == null || this.showLastModifiedOnList != null && this.showLastModifiedOnList.equals(other.getShowLastModifiedOnList())) && (this.showOwner == null && other.getShowOwner() == null || this.showOwner != null && this.showOwner.equals(other.getShowOwner())) && (this.showOwnerOnList == null && other.getShowOwnerOnList() == null || this.showOwnerOnList != null && this.showOwnerOnList.equals(other.getShowOwnerOnList())) && (this.showOwnerAllowChange == null && other.getShowOwnerAllowChange() == null || this.showOwnerAllowChange != null && this.showOwnerAllowChange.equals(other.getShowOwnerAllowChange())) && (this.accessType == null && other.getAccessType() == null || this.accessType != null && this.accessType.equals(other.getAccessType())) && (this.allowAttachments == null && other.getAllowAttachments() == null || this.allowAttachments != null && this.allowAttachments.equals(other.getAllowAttachments())) && (this.showNotes == null && other.getShowNotes() == null || this.showNotes != null && this.showNotes.equals(other.getShowNotes())) && (this.enableMailMerge == null && other.getEnableMailMerge() == null || this.enableMailMerge != null && this.enableMailMerge.equals(other.getEnableMailMerge())) && (this.isOrdered == null && other.getIsOrdered() == null || this.isOrdered != null && this.isOrdered.equals(other.getIsOrdered())) && (this.isAvailableOffline == null && other.getIsAvailableOffline() == null || this.isAvailableOffline != null && this.isAvailableOffline.equals(other.getIsAvailableOffline())) && (this.allowQuickSearch == null && other.getAllowQuickSearch() == null || this.allowQuickSearch != null && this.allowQuickSearch.equals(other.getAllowQuickSearch())) && (this.hierarchical == null && other.getHierarchical() == null || this.hierarchical != null && this.hierarchical.equals(other.getHierarchical())) && (this.enableDle == null && other.getEnableDle() == null || this.enableDle != null && this.enableDle.equals(other.getEnableDle())) && (this.enableNameTranslation == null && other.getEnableNameTranslation() == null || this.enableNameTranslation != null && this.enableNameTranslation.equals(other.getEnableNameTranslation())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.disclaimer == null && other.getDisclaimer() == null || this.disclaimer != null && this.disclaimer.equals(other.getDisclaimer())) && (this.enableNumbering == null && other.getEnableNumbering() == null || this.enableNumbering != null && this.enableNumbering.equals(other.getEnableNumbering())) && (this.numberingPrefix == null && other.getNumberingPrefix() == null || this.numberingPrefix != null && this.numberingPrefix.equals(other.getNumberingPrefix())) && (this.numberingSuffix == null && other.getNumberingSuffix() == null || this.numberingSuffix != null && this.numberingSuffix.equals(other.getNumberingSuffix())) && (this.numberingMinDigits == null && other.getNumberingMinDigits() == null || this.numberingMinDigits != null && this.numberingMinDigits.equals(other.getNumberingMinDigits())) && (this.numberingInit == null && other.getNumberingInit() == null || this.numberingInit != null && this.numberingInit.equals(other.getNumberingInit())) && (this.numberingCurrentNumber == null && other.getNumberingCurrentNumber() == null || this.numberingCurrentNumber != null && this.numberingCurrentNumber.equals(other.getNumberingCurrentNumber())) && (this.allowNumberingOverride == null && other.getAllowNumberingOverride() == null || this.allowNumberingOverride != null && this.allowNumberingOverride.equals(other.getAllowNumberingOverride())) && (this.isNumberingUpdateable == null && other.getIsNumberingUpdateable() == null || this.isNumberingUpdateable != null && this.isNumberingUpdateable.equals(other.getIsNumberingUpdateable())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.tabsList == null && other.getTabsList() == null || this.tabsList != null && this.tabsList.equals(other.getTabsList())) && (this.sublistsList == null && other.getSublistsList() == null || this.sublistsList != null && this.sublistsList.equals(other.getSublistsList())) && (this.formsList == null && other.getFormsList() == null || this.formsList != null && this.formsList.equals(other.getFormsList())) && (this.onlineFormsList == null && other.getOnlineFormsList() == null || this.onlineFormsList != null && this.onlineFormsList.equals(other.getOnlineFormsList())) && (this.permissionsList == null && other.getPermissionsList() == null || this.permissionsList != null && this.permissionsList.equals(other.getPermissionsList())) && (this.linksList == null && other.getLinksList() == null || this.linksList != null && this.linksList.equals(other.getLinksList())) && (this.managersList == null && other.getManagersList() == null || this.managersList != null && this.managersList.equals(other.getManagersList())) && (this.childrenList == null && other.getChildrenList() == null || this.childrenList != null && this.childrenList.equals(other.getChildrenList())) && (this.parentsList == null && other.getParentsList() == null || this.parentsList != null && this.parentsList.equals(other.getParentsList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getRecordName() != null) {
            _hashCode += this.getRecordName().hashCode();
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
        if (this.getAccessType() != null) {
            _hashCode += this.getAccessType().hashCode();
        }
        if (this.getAllowAttachments() != null) {
            _hashCode += this.getAllowAttachments().hashCode();
        }
        if (this.getShowNotes() != null) {
            _hashCode += this.getShowNotes().hashCode();
        }
        if (this.getEnableMailMerge() != null) {
            _hashCode += this.getEnableMailMerge().hashCode();
        }
        if (this.getIsOrdered() != null) {
            _hashCode += this.getIsOrdered().hashCode();
        }
        if (this.getIsAvailableOffline() != null) {
            _hashCode += this.getIsAvailableOffline().hashCode();
        }
        if (this.getAllowQuickSearch() != null) {
            _hashCode += this.getAllowQuickSearch().hashCode();
        }
        if (this.getHierarchical() != null) {
            _hashCode += this.getHierarchical().hashCode();
        }
        if (this.getEnableDle() != null) {
            _hashCode += this.getEnableDle().hashCode();
        }
        if (this.getEnableNameTranslation() != null) {
            _hashCode += this.getEnableNameTranslation().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getDisclaimer() != null) {
            _hashCode += this.getDisclaimer().hashCode();
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
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getTabsList() != null) {
            _hashCode += this.getTabsList().hashCode();
        }
        if (this.getSublistsList() != null) {
            _hashCode += this.getSublistsList().hashCode();
        }
        if (this.getFormsList() != null) {
            _hashCode += this.getFormsList().hashCode();
        }
        if (this.getOnlineFormsList() != null) {
            _hashCode += this.getOnlineFormsList().hashCode();
        }
        if (this.getPermissionsList() != null) {
            _hashCode += this.getPermissionsList().hashCode();
        }
        if (this.getLinksList() != null) {
            _hashCode += this.getLinksList().hashCode();
        }
        if (this.getManagersList() != null) {
            _hashCode += this.getManagersList().hashCode();
        }
        if (this.getChildrenList() != null) {
            _hashCode += this.getChildrenList().hashCode();
        }
        if (this.getParentsList() != null) {
            _hashCode += this.getParentsList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordType"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("accessType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "accessType"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeAccessType"));
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
        elemField.setFieldName("enableMailMerge");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "enableMailMerge"));
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
        elemField.setFieldName("hierarchical");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "hierarchical"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableDle");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "enableDle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableNameTranslation");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "enableNameTranslation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("disclaimer");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "disclaimer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("tabsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tabsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeTabsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sublistsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sublistsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeSublistsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("formsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "formsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeFormsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onlineFormsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "onlineFormsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeOnlineFormsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permissionsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "permissionsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypePermissionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linksList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "linksList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeLinksList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("managersList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "managersList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeManagersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("childrenList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "childrenList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeChildrenList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "parentsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeParentsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeTranslationsList"));
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
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

