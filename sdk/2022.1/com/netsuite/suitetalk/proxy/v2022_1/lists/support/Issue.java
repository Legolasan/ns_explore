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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support;

import com.netsuite.suitetalk.proxy.v2022_1.lists.support.EmailEmployeesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.IssueRelatedIssuesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.IssueVersionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.types.IssueTrackCode;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class Issue
extends Record
implements Serializable {
    private RecordRef customForm;
    private String issueNumber;
    private Calendar createdDate;
    private RecordRef issueType;
    private RecordRef product;
    private RecordRef module;
    private RecordRef item;
    private RecordRef productTeam;
    private RecordRef source;
    private RecordRef reportedBy;
    private RecordRef reproduce;
    private RecordRef versionBroken;
    private RecordRef buildBroken;
    private RecordRef versionTarget;
    private RecordRef buildTarget;
    private RecordRef versionFixed;
    private RecordRef buildFixed;
    private RecordRef severity;
    private RecordRef priority;
    private Boolean isShowStopper;
    private RecordRef assigned;
    private RecordRef reviewer;
    private Boolean isReviewed;
    private RecordRef issueStatus;
    private Calendar lastModifiedDate;
    private RecordRefList issueTagsList;
    private String issueAbstract;
    private String newDetails;
    private Boolean isOwner;
    private IssueTrackCode trackCode;
    private Boolean emailAssignee;
    private EmailEmployeesList emailEmployeesList;
    private RecordRefList emailCellsList;
    private String externalAbstract;
    private String externalDetails;
    private IssueVersionList brokenInVersionList;
    private IssueVersionList targetVersionList;
    private IssueVersionList fixedInVersionList;
    private IssueRelatedIssuesList relatedIssuesList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Issue.class, true);

    public Issue() {
    }

    public Issue(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String issueNumber, Calendar createdDate, RecordRef issueType, RecordRef product, RecordRef module, RecordRef item, RecordRef productTeam, RecordRef source, RecordRef reportedBy, RecordRef reproduce, RecordRef versionBroken, RecordRef buildBroken, RecordRef versionTarget, RecordRef buildTarget, RecordRef versionFixed, RecordRef buildFixed, RecordRef severity, RecordRef priority, Boolean isShowStopper, RecordRef assigned, RecordRef reviewer, Boolean isReviewed, RecordRef issueStatus, Calendar lastModifiedDate, RecordRefList issueTagsList, String issueAbstract, String newDetails, Boolean isOwner, IssueTrackCode trackCode, Boolean emailAssignee, EmailEmployeesList emailEmployeesList, RecordRefList emailCellsList, String externalAbstract, String externalDetails, IssueVersionList brokenInVersionList, IssueVersionList targetVersionList, IssueVersionList fixedInVersionList, IssueRelatedIssuesList relatedIssuesList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.issueNumber = issueNumber;
        this.createdDate = createdDate;
        this.issueType = issueType;
        this.product = product;
        this.module = module;
        this.item = item;
        this.productTeam = productTeam;
        this.source = source;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.versionBroken = versionBroken;
        this.buildBroken = buildBroken;
        this.versionTarget = versionTarget;
        this.buildTarget = buildTarget;
        this.versionFixed = versionFixed;
        this.buildFixed = buildFixed;
        this.severity = severity;
        this.priority = priority;
        this.isShowStopper = isShowStopper;
        this.assigned = assigned;
        this.reviewer = reviewer;
        this.isReviewed = isReviewed;
        this.issueStatus = issueStatus;
        this.lastModifiedDate = lastModifiedDate;
        this.issueTagsList = issueTagsList;
        this.issueAbstract = issueAbstract;
        this.newDetails = newDetails;
        this.isOwner = isOwner;
        this.trackCode = trackCode;
        this.emailAssignee = emailAssignee;
        this.emailEmployeesList = emailEmployeesList;
        this.emailCellsList = emailCellsList;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.brokenInVersionList = brokenInVersionList;
        this.targetVersionList = targetVersionList;
        this.fixedInVersionList = fixedInVersionList;
        this.relatedIssuesList = relatedIssuesList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public RecordRef getIssueType() {
        return this.issueType;
    }

    public void setIssueType(RecordRef issueType) {
        this.issueType = issueType;
    }

    public RecordRef getProduct() {
        return this.product;
    }

    public void setProduct(RecordRef product) {
        this.product = product;
    }

    public RecordRef getModule() {
        return this.module;
    }

    public void setModule(RecordRef module) {
        this.module = module;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef getProductTeam() {
        return this.productTeam;
    }

    public void setProductTeam(RecordRef productTeam) {
        this.productTeam = productTeam;
    }

    public RecordRef getSource() {
        return this.source;
    }

    public void setSource(RecordRef source) {
        this.source = source;
    }

    public RecordRef getReportedBy() {
        return this.reportedBy;
    }

    public void setReportedBy(RecordRef reportedBy) {
        this.reportedBy = reportedBy;
    }

    public RecordRef getReproduce() {
        return this.reproduce;
    }

    public void setReproduce(RecordRef reproduce) {
        this.reproduce = reproduce;
    }

    public RecordRef getVersionBroken() {
        return this.versionBroken;
    }

    public void setVersionBroken(RecordRef versionBroken) {
        this.versionBroken = versionBroken;
    }

    public RecordRef getBuildBroken() {
        return this.buildBroken;
    }

    public void setBuildBroken(RecordRef buildBroken) {
        this.buildBroken = buildBroken;
    }

    public RecordRef getVersionTarget() {
        return this.versionTarget;
    }

    public void setVersionTarget(RecordRef versionTarget) {
        this.versionTarget = versionTarget;
    }

    public RecordRef getBuildTarget() {
        return this.buildTarget;
    }

    public void setBuildTarget(RecordRef buildTarget) {
        this.buildTarget = buildTarget;
    }

    public RecordRef getVersionFixed() {
        return this.versionFixed;
    }

    public void setVersionFixed(RecordRef versionFixed) {
        this.versionFixed = versionFixed;
    }

    public RecordRef getBuildFixed() {
        return this.buildFixed;
    }

    public void setBuildFixed(RecordRef buildFixed) {
        this.buildFixed = buildFixed;
    }

    public RecordRef getSeverity() {
        return this.severity;
    }

    public void setSeverity(RecordRef severity) {
        this.severity = severity;
    }

    public RecordRef getPriority() {
        return this.priority;
    }

    public void setPriority(RecordRef priority) {
        this.priority = priority;
    }

    public Boolean getIsShowStopper() {
        return this.isShowStopper;
    }

    public void setIsShowStopper(Boolean isShowStopper) {
        this.isShowStopper = isShowStopper;
    }

    public RecordRef getAssigned() {
        return this.assigned;
    }

    public void setAssigned(RecordRef assigned) {
        this.assigned = assigned;
    }

    public RecordRef getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(RecordRef reviewer) {
        this.reviewer = reviewer;
    }

    public Boolean getIsReviewed() {
        return this.isReviewed;
    }

    public void setIsReviewed(Boolean isReviewed) {
        this.isReviewed = isReviewed;
    }

    public RecordRef getIssueStatus() {
        return this.issueStatus;
    }

    public void setIssueStatus(RecordRef issueStatus) {
        this.issueStatus = issueStatus;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRefList getIssueTagsList() {
        return this.issueTagsList;
    }

    public void setIssueTagsList(RecordRefList issueTagsList) {
        this.issueTagsList = issueTagsList;
    }

    public String getIssueAbstract() {
        return this.issueAbstract;
    }

    public void setIssueAbstract(String issueAbstract) {
        this.issueAbstract = issueAbstract;
    }

    public String getNewDetails() {
        return this.newDetails;
    }

    public void setNewDetails(String newDetails) {
        this.newDetails = newDetails;
    }

    public Boolean getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public IssueTrackCode getTrackCode() {
        return this.trackCode;
    }

    public void setTrackCode(IssueTrackCode trackCode) {
        this.trackCode = trackCode;
    }

    public Boolean getEmailAssignee() {
        return this.emailAssignee;
    }

    public void setEmailAssignee(Boolean emailAssignee) {
        this.emailAssignee = emailAssignee;
    }

    public EmailEmployeesList getEmailEmployeesList() {
        return this.emailEmployeesList;
    }

    public void setEmailEmployeesList(EmailEmployeesList emailEmployeesList) {
        this.emailEmployeesList = emailEmployeesList;
    }

    public RecordRefList getEmailCellsList() {
        return this.emailCellsList;
    }

    public void setEmailCellsList(RecordRefList emailCellsList) {
        this.emailCellsList = emailCellsList;
    }

    public String getExternalAbstract() {
        return this.externalAbstract;
    }

    public void setExternalAbstract(String externalAbstract) {
        this.externalAbstract = externalAbstract;
    }

    public String getExternalDetails() {
        return this.externalDetails;
    }

    public void setExternalDetails(String externalDetails) {
        this.externalDetails = externalDetails;
    }

    public IssueVersionList getBrokenInVersionList() {
        return this.brokenInVersionList;
    }

    public void setBrokenInVersionList(IssueVersionList brokenInVersionList) {
        this.brokenInVersionList = brokenInVersionList;
    }

    public IssueVersionList getTargetVersionList() {
        return this.targetVersionList;
    }

    public void setTargetVersionList(IssueVersionList targetVersionList) {
        this.targetVersionList = targetVersionList;
    }

    public IssueVersionList getFixedInVersionList() {
        return this.fixedInVersionList;
    }

    public void setFixedInVersionList(IssueVersionList fixedInVersionList) {
        this.fixedInVersionList = fixedInVersionList;
    }

    public IssueRelatedIssuesList getRelatedIssuesList() {
        return this.relatedIssuesList;
    }

    public void setRelatedIssuesList(IssueRelatedIssuesList relatedIssuesList) {
        this.relatedIssuesList = relatedIssuesList;
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
        if (!(obj instanceof Issue)) {
            return false;
        }
        Issue other = (Issue)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.issueNumber == null && other.getIssueNumber() == null || this.issueNumber != null && this.issueNumber.equals(other.getIssueNumber())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.issueType == null && other.getIssueType() == null || this.issueType != null && this.issueType.equals(other.getIssueType())) && (this.product == null && other.getProduct() == null || this.product != null && this.product.equals(other.getProduct())) && (this.module == null && other.getModule() == null || this.module != null && this.module.equals(other.getModule())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.productTeam == null && other.getProductTeam() == null || this.productTeam != null && this.productTeam.equals(other.getProductTeam())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.reportedBy == null && other.getReportedBy() == null || this.reportedBy != null && this.reportedBy.equals(other.getReportedBy())) && (this.reproduce == null && other.getReproduce() == null || this.reproduce != null && this.reproduce.equals(other.getReproduce())) && (this.versionBroken == null && other.getVersionBroken() == null || this.versionBroken != null && this.versionBroken.equals(other.getVersionBroken())) && (this.buildBroken == null && other.getBuildBroken() == null || this.buildBroken != null && this.buildBroken.equals(other.getBuildBroken())) && (this.versionTarget == null && other.getVersionTarget() == null || this.versionTarget != null && this.versionTarget.equals(other.getVersionTarget())) && (this.buildTarget == null && other.getBuildTarget() == null || this.buildTarget != null && this.buildTarget.equals(other.getBuildTarget())) && (this.versionFixed == null && other.getVersionFixed() == null || this.versionFixed != null && this.versionFixed.equals(other.getVersionFixed())) && (this.buildFixed == null && other.getBuildFixed() == null || this.buildFixed != null && this.buildFixed.equals(other.getBuildFixed())) && (this.severity == null && other.getSeverity() == null || this.severity != null && this.severity.equals(other.getSeverity())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.isShowStopper == null && other.getIsShowStopper() == null || this.isShowStopper != null && this.isShowStopper.equals(other.getIsShowStopper())) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && this.assigned.equals(other.getAssigned())) && (this.reviewer == null && other.getReviewer() == null || this.reviewer != null && this.reviewer.equals(other.getReviewer())) && (this.isReviewed == null && other.getIsReviewed() == null || this.isReviewed != null && this.isReviewed.equals(other.getIsReviewed())) && (this.issueStatus == null && other.getIssueStatus() == null || this.issueStatus != null && this.issueStatus.equals(other.getIssueStatus())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.issueTagsList == null && other.getIssueTagsList() == null || this.issueTagsList != null && this.issueTagsList.equals(other.getIssueTagsList())) && (this.issueAbstract == null && other.getIssueAbstract() == null || this.issueAbstract != null && this.issueAbstract.equals(other.getIssueAbstract())) && (this.newDetails == null && other.getNewDetails() == null || this.newDetails != null && this.newDetails.equals(other.getNewDetails())) && (this.isOwner == null && other.getIsOwner() == null || this.isOwner != null && this.isOwner.equals(other.getIsOwner())) && (this.trackCode == null && other.getTrackCode() == null || this.trackCode != null && this.trackCode.equals(other.getTrackCode())) && (this.emailAssignee == null && other.getEmailAssignee() == null || this.emailAssignee != null && this.emailAssignee.equals(other.getEmailAssignee())) && (this.emailEmployeesList == null && other.getEmailEmployeesList() == null || this.emailEmployeesList != null && this.emailEmployeesList.equals(other.getEmailEmployeesList())) && (this.emailCellsList == null && other.getEmailCellsList() == null || this.emailCellsList != null && this.emailCellsList.equals(other.getEmailCellsList())) && (this.externalAbstract == null && other.getExternalAbstract() == null || this.externalAbstract != null && this.externalAbstract.equals(other.getExternalAbstract())) && (this.externalDetails == null && other.getExternalDetails() == null || this.externalDetails != null && this.externalDetails.equals(other.getExternalDetails())) && (this.brokenInVersionList == null && other.getBrokenInVersionList() == null || this.brokenInVersionList != null && this.brokenInVersionList.equals(other.getBrokenInVersionList())) && (this.targetVersionList == null && other.getTargetVersionList() == null || this.targetVersionList != null && this.targetVersionList.equals(other.getTargetVersionList())) && (this.fixedInVersionList == null && other.getFixedInVersionList() == null || this.fixedInVersionList != null && this.fixedInVersionList.equals(other.getFixedInVersionList())) && (this.relatedIssuesList == null && other.getRelatedIssuesList() == null || this.relatedIssuesList != null && this.relatedIssuesList.equals(other.getRelatedIssuesList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getIssueNumber() != null) {
            _hashCode += this.getIssueNumber().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getIssueType() != null) {
            _hashCode += this.getIssueType().hashCode();
        }
        if (this.getProduct() != null) {
            _hashCode += this.getProduct().hashCode();
        }
        if (this.getModule() != null) {
            _hashCode += this.getModule().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getProductTeam() != null) {
            _hashCode += this.getProductTeam().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getReportedBy() != null) {
            _hashCode += this.getReportedBy().hashCode();
        }
        if (this.getReproduce() != null) {
            _hashCode += this.getReproduce().hashCode();
        }
        if (this.getVersionBroken() != null) {
            _hashCode += this.getVersionBroken().hashCode();
        }
        if (this.getBuildBroken() != null) {
            _hashCode += this.getBuildBroken().hashCode();
        }
        if (this.getVersionTarget() != null) {
            _hashCode += this.getVersionTarget().hashCode();
        }
        if (this.getBuildTarget() != null) {
            _hashCode += this.getBuildTarget().hashCode();
        }
        if (this.getVersionFixed() != null) {
            _hashCode += this.getVersionFixed().hashCode();
        }
        if (this.getBuildFixed() != null) {
            _hashCode += this.getBuildFixed().hashCode();
        }
        if (this.getSeverity() != null) {
            _hashCode += this.getSeverity().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getIsShowStopper() != null) {
            _hashCode += this.getIsShowStopper().hashCode();
        }
        if (this.getAssigned() != null) {
            _hashCode += this.getAssigned().hashCode();
        }
        if (this.getReviewer() != null) {
            _hashCode += this.getReviewer().hashCode();
        }
        if (this.getIsReviewed() != null) {
            _hashCode += this.getIsReviewed().hashCode();
        }
        if (this.getIssueStatus() != null) {
            _hashCode += this.getIssueStatus().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getIssueTagsList() != null) {
            _hashCode += this.getIssueTagsList().hashCode();
        }
        if (this.getIssueAbstract() != null) {
            _hashCode += this.getIssueAbstract().hashCode();
        }
        if (this.getNewDetails() != null) {
            _hashCode += this.getNewDetails().hashCode();
        }
        if (this.getIsOwner() != null) {
            _hashCode += this.getIsOwner().hashCode();
        }
        if (this.getTrackCode() != null) {
            _hashCode += this.getTrackCode().hashCode();
        }
        if (this.getEmailAssignee() != null) {
            _hashCode += this.getEmailAssignee().hashCode();
        }
        if (this.getEmailEmployeesList() != null) {
            _hashCode += this.getEmailEmployeesList().hashCode();
        }
        if (this.getEmailCellsList() != null) {
            _hashCode += this.getEmailCellsList().hashCode();
        }
        if (this.getExternalAbstract() != null) {
            _hashCode += this.getExternalAbstract().hashCode();
        }
        if (this.getExternalDetails() != null) {
            _hashCode += this.getExternalDetails().hashCode();
        }
        if (this.getBrokenInVersionList() != null) {
            _hashCode += this.getBrokenInVersionList().hashCode();
        }
        if (this.getTargetVersionList() != null) {
            _hashCode += this.getTargetVersionList().hashCode();
        }
        if (this.getFixedInVersionList() != null) {
            _hashCode += this.getFixedInVersionList().hashCode();
        }
        if (this.getRelatedIssuesList() != null) {
            _hashCode += this.getRelatedIssuesList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "Issue"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueType");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueTagsList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueTagsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newDetails");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "newDetails"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackCode");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "trackCode"));
        elemField.setXmlType(new QName("urn:types.support_2022_1.lists.webservices.netsuite.com", "IssueTrackCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailAssignee");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailAssignee"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailEmployeesList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailEmployeesList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailCellsList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailCellsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("brokenInVersionList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "brokenInVersionList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetVersionList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "targetVersionList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedInVersionList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "fixedInVersionList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueVersionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relatedIssuesList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "relatedIssuesList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "IssueRelatedIssuesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

