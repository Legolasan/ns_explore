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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class IssueSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchLongField ageInMonths;
    private SearchMultiSelectField assigned;
    private SearchMultiSelectField buildBroken;
    private SearchStringField buildBrokenName;
    private SearchMultiSelectField buildFixed;
    private SearchStringField buildFixedName;
    private SearchMultiSelectField buildTarget;
    private SearchStringField buildTargetName;
    private SearchLongField caseCount;
    private SearchStringField caseNumber;
    private SearchDateField closedDate;
    private SearchDateField createdDate;
    private SearchDateField dateReleased;
    private SearchStringField details;
    private SearchMultiSelectField duplicateOf;
    private SearchBooleanField eFix;
    private SearchMultiSelectField employeeOrTeam;
    private SearchEnumMultiSelectField eventStatus;
    private SearchStringField externalAbstract;
    private SearchStringField externalDetails;
    private SearchMultiSelectField externalFixedIn;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField externalStatus;
    private SearchDateField fixed;
    private SearchMultiSelectField fixedBy;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isOwner;
    private SearchBooleanField isReviewed;
    private SearchBooleanField isShowStopper;
    private SearchStringField issueAbstract;
    private SearchStringField issueNumber;
    private SearchMultiSelectField item;
    private SearchDateField lastModifiedDate;
    private SearchMultiSelectField module;
    private SearchLongField number;
    private SearchStringField originalFixedIn;
    private SearchMultiSelectField priority;
    private SearchMultiSelectField product;
    private SearchMultiSelectField productTeam;
    private SearchMultiSelectField relatedIssue;
    private SearchEnumMultiSelectField relationship;
    private SearchStringField relationshipComment;
    private SearchMultiSelectField reportedBy;
    private SearchMultiSelectField reproduce;
    private SearchDateField resolved;
    private SearchMultiSelectField resolvedBy;
    private SearchMultiSelectField reviewer;
    private SearchMultiSelectField severity;
    private SearchEnumMultiSelectField source;
    private SearchMultiSelectField status;
    private SearchMultiSelectField tags;
    private SearchBooleanField tracking;
    private SearchMultiSelectField type;
    private SearchMultiSelectField userType;
    private SearchMultiSelectField versionBroken;
    private SearchMultiSelectField versionFixed;
    private SearchMultiSelectField versionTarget;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(IssueSearchBasic.class, true);

    public IssueSearchBasic() {
    }

    public IssueSearchBasic(SearchLongField ageInMonths, SearchMultiSelectField assigned, SearchMultiSelectField buildBroken, SearchStringField buildBrokenName, SearchMultiSelectField buildFixed, SearchStringField buildFixedName, SearchMultiSelectField buildTarget, SearchStringField buildTargetName, SearchLongField caseCount, SearchStringField caseNumber, SearchDateField closedDate, SearchDateField createdDate, SearchDateField dateReleased, SearchStringField details, SearchMultiSelectField duplicateOf, SearchBooleanField eFix, SearchMultiSelectField employeeOrTeam, SearchEnumMultiSelectField eventStatus, SearchStringField externalAbstract, SearchStringField externalDetails, SearchMultiSelectField externalFixedIn, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField externalStatus, SearchDateField fixed, SearchMultiSelectField fixedBy, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isOwner, SearchBooleanField isReviewed, SearchBooleanField isShowStopper, SearchStringField issueAbstract, SearchStringField issueNumber, SearchMultiSelectField item, SearchDateField lastModifiedDate, SearchMultiSelectField module, SearchLongField number, SearchStringField originalFixedIn, SearchMultiSelectField priority, SearchMultiSelectField product, SearchMultiSelectField productTeam, SearchMultiSelectField relatedIssue, SearchEnumMultiSelectField relationship, SearchStringField relationshipComment, SearchMultiSelectField reportedBy, SearchMultiSelectField reproduce, SearchDateField resolved, SearchMultiSelectField resolvedBy, SearchMultiSelectField reviewer, SearchMultiSelectField severity, SearchEnumMultiSelectField source, SearchMultiSelectField status, SearchMultiSelectField tags, SearchBooleanField tracking, SearchMultiSelectField type, SearchMultiSelectField userType, SearchMultiSelectField versionBroken, SearchMultiSelectField versionFixed, SearchMultiSelectField versionTarget, SearchCustomFieldList customFieldList) {
        this.ageInMonths = ageInMonths;
        this.assigned = assigned;
        this.buildBroken = buildBroken;
        this.buildBrokenName = buildBrokenName;
        this.buildFixed = buildFixed;
        this.buildFixedName = buildFixedName;
        this.buildTarget = buildTarget;
        this.buildTargetName = buildTargetName;
        this.caseCount = caseCount;
        this.caseNumber = caseNumber;
        this.closedDate = closedDate;
        this.createdDate = createdDate;
        this.dateReleased = dateReleased;
        this.details = details;
        this.duplicateOf = duplicateOf;
        this.eFix = eFix;
        this.employeeOrTeam = employeeOrTeam;
        this.eventStatus = eventStatus;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.externalFixedIn = externalFixedIn;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.externalStatus = externalStatus;
        this.fixed = fixed;
        this.fixedBy = fixedBy;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isOwner = isOwner;
        this.isReviewed = isReviewed;
        this.isShowStopper = isShowStopper;
        this.issueAbstract = issueAbstract;
        this.issueNumber = issueNumber;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.module = module;
        this.number = number;
        this.originalFixedIn = originalFixedIn;
        this.priority = priority;
        this.product = product;
        this.productTeam = productTeam;
        this.relatedIssue = relatedIssue;
        this.relationship = relationship;
        this.relationshipComment = relationshipComment;
        this.reportedBy = reportedBy;
        this.reproduce = reproduce;
        this.resolved = resolved;
        this.resolvedBy = resolvedBy;
        this.reviewer = reviewer;
        this.severity = severity;
        this.source = source;
        this.status = status;
        this.tags = tags;
        this.tracking = tracking;
        this.type = type;
        this.userType = userType;
        this.versionBroken = versionBroken;
        this.versionFixed = versionFixed;
        this.versionTarget = versionTarget;
        this.customFieldList = customFieldList;
    }

    public SearchLongField getAgeInMonths() {
        return this.ageInMonths;
    }

    public void setAgeInMonths(SearchLongField ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public SearchMultiSelectField getAssigned() {
        return this.assigned;
    }

    public void setAssigned(SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }

    public SearchMultiSelectField getBuildBroken() {
        return this.buildBroken;
    }

    public void setBuildBroken(SearchMultiSelectField buildBroken) {
        this.buildBroken = buildBroken;
    }

    public SearchStringField getBuildBrokenName() {
        return this.buildBrokenName;
    }

    public void setBuildBrokenName(SearchStringField buildBrokenName) {
        this.buildBrokenName = buildBrokenName;
    }

    public SearchMultiSelectField getBuildFixed() {
        return this.buildFixed;
    }

    public void setBuildFixed(SearchMultiSelectField buildFixed) {
        this.buildFixed = buildFixed;
    }

    public SearchStringField getBuildFixedName() {
        return this.buildFixedName;
    }

    public void setBuildFixedName(SearchStringField buildFixedName) {
        this.buildFixedName = buildFixedName;
    }

    public SearchMultiSelectField getBuildTarget() {
        return this.buildTarget;
    }

    public void setBuildTarget(SearchMultiSelectField buildTarget) {
        this.buildTarget = buildTarget;
    }

    public SearchStringField getBuildTargetName() {
        return this.buildTargetName;
    }

    public void setBuildTargetName(SearchStringField buildTargetName) {
        this.buildTargetName = buildTargetName;
    }

    public SearchLongField getCaseCount() {
        return this.caseCount;
    }

    public void setCaseCount(SearchLongField caseCount) {
        this.caseCount = caseCount;
    }

    public SearchStringField getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }

    public SearchDateField getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(SearchDateField closedDate) {
        this.closedDate = closedDate;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchDateField getDateReleased() {
        return this.dateReleased;
    }

    public void setDateReleased(SearchDateField dateReleased) {
        this.dateReleased = dateReleased;
    }

    public SearchStringField getDetails() {
        return this.details;
    }

    public void setDetails(SearchStringField details) {
        this.details = details;
    }

    public SearchMultiSelectField getDuplicateOf() {
        return this.duplicateOf;
    }

    public void setDuplicateOf(SearchMultiSelectField duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    public SearchBooleanField getEFix() {
        return this.eFix;
    }

    public void setEFix(SearchBooleanField eFix) {
        this.eFix = eFix;
    }

    public SearchMultiSelectField getEmployeeOrTeam() {
        return this.employeeOrTeam;
    }

    public void setEmployeeOrTeam(SearchMultiSelectField employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }

    public SearchEnumMultiSelectField getEventStatus() {
        return this.eventStatus;
    }

    public void setEventStatus(SearchEnumMultiSelectField eventStatus) {
        this.eventStatus = eventStatus;
    }

    public SearchStringField getExternalAbstract() {
        return this.externalAbstract;
    }

    public void setExternalAbstract(SearchStringField externalAbstract) {
        this.externalAbstract = externalAbstract;
    }

    public SearchStringField getExternalDetails() {
        return this.externalDetails;
    }

    public void setExternalDetails(SearchStringField externalDetails) {
        this.externalDetails = externalDetails;
    }

    public SearchMultiSelectField getExternalFixedIn() {
        return this.externalFixedIn;
    }

    public void setExternalFixedIn(SearchMultiSelectField externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchMultiSelectField getExternalStatus() {
        return this.externalStatus;
    }

    public void setExternalStatus(SearchMultiSelectField externalStatus) {
        this.externalStatus = externalStatus;
    }

    public SearchDateField getFixed() {
        return this.fixed;
    }

    public void setFixed(SearchDateField fixed) {
        this.fixed = fixed;
    }

    public SearchMultiSelectField getFixedBy() {
        return this.fixedBy;
    }

    public void setFixedBy(SearchMultiSelectField fixedBy) {
        this.fixedBy = fixedBy;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(SearchBooleanField isOwner) {
        this.isOwner = isOwner;
    }

    public SearchBooleanField getIsReviewed() {
        return this.isReviewed;
    }

    public void setIsReviewed(SearchBooleanField isReviewed) {
        this.isReviewed = isReviewed;
    }

    public SearchBooleanField getIsShowStopper() {
        return this.isShowStopper;
    }

    public void setIsShowStopper(SearchBooleanField isShowStopper) {
        this.isShowStopper = isShowStopper;
    }

    public SearchStringField getIssueAbstract() {
        return this.issueAbstract;
    }

    public void setIssueAbstract(SearchStringField issueAbstract) {
        this.issueAbstract = issueAbstract;
    }

    public SearchStringField getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(SearchStringField issueNumber) {
        this.issueNumber = issueNumber;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchMultiSelectField getModule() {
        return this.module;
    }

    public void setModule(SearchMultiSelectField module) {
        this.module = module;
    }

    public SearchLongField getNumber() {
        return this.number;
    }

    public void setNumber(SearchLongField number) {
        this.number = number;
    }

    public SearchStringField getOriginalFixedIn() {
        return this.originalFixedIn;
    }

    public void setOriginalFixedIn(SearchStringField originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }

    public SearchMultiSelectField getPriority() {
        return this.priority;
    }

    public void setPriority(SearchMultiSelectField priority) {
        this.priority = priority;
    }

    public SearchMultiSelectField getProduct() {
        return this.product;
    }

    public void setProduct(SearchMultiSelectField product) {
        this.product = product;
    }

    public SearchMultiSelectField getProductTeam() {
        return this.productTeam;
    }

    public void setProductTeam(SearchMultiSelectField productTeam) {
        this.productTeam = productTeam;
    }

    public SearchMultiSelectField getRelatedIssue() {
        return this.relatedIssue;
    }

    public void setRelatedIssue(SearchMultiSelectField relatedIssue) {
        this.relatedIssue = relatedIssue;
    }

    public SearchEnumMultiSelectField getRelationship() {
        return this.relationship;
    }

    public void setRelationship(SearchEnumMultiSelectField relationship) {
        this.relationship = relationship;
    }

    public SearchStringField getRelationshipComment() {
        return this.relationshipComment;
    }

    public void setRelationshipComment(SearchStringField relationshipComment) {
        this.relationshipComment = relationshipComment;
    }

    public SearchMultiSelectField getReportedBy() {
        return this.reportedBy;
    }

    public void setReportedBy(SearchMultiSelectField reportedBy) {
        this.reportedBy = reportedBy;
    }

    public SearchMultiSelectField getReproduce() {
        return this.reproduce;
    }

    public void setReproduce(SearchMultiSelectField reproduce) {
        this.reproduce = reproduce;
    }

    public SearchDateField getResolved() {
        return this.resolved;
    }

    public void setResolved(SearchDateField resolved) {
        this.resolved = resolved;
    }

    public SearchMultiSelectField getResolvedBy() {
        return this.resolvedBy;
    }

    public void setResolvedBy(SearchMultiSelectField resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public SearchMultiSelectField getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(SearchMultiSelectField reviewer) {
        this.reviewer = reviewer;
    }

    public SearchMultiSelectField getSeverity() {
        return this.severity;
    }

    public void setSeverity(SearchMultiSelectField severity) {
        this.severity = severity;
    }

    public SearchEnumMultiSelectField getSource() {
        return this.source;
    }

    public void setSource(SearchEnumMultiSelectField source) {
        this.source = source;
    }

    public SearchMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchMultiSelectField status) {
        this.status = status;
    }

    public SearchMultiSelectField getTags() {
        return this.tags;
    }

    public void setTags(SearchMultiSelectField tags) {
        this.tags = tags;
    }

    public SearchBooleanField getTracking() {
        return this.tracking;
    }

    public void setTracking(SearchBooleanField tracking) {
        this.tracking = tracking;
    }

    public SearchMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchMultiSelectField type) {
        this.type = type;
    }

    public SearchMultiSelectField getUserType() {
        return this.userType;
    }

    public void setUserType(SearchMultiSelectField userType) {
        this.userType = userType;
    }

    public SearchMultiSelectField getVersionBroken() {
        return this.versionBroken;
    }

    public void setVersionBroken(SearchMultiSelectField versionBroken) {
        this.versionBroken = versionBroken;
    }

    public SearchMultiSelectField getVersionFixed() {
        return this.versionFixed;
    }

    public void setVersionFixed(SearchMultiSelectField versionFixed) {
        this.versionFixed = versionFixed;
    }

    public SearchMultiSelectField getVersionTarget() {
        return this.versionTarget;
    }

    public void setVersionTarget(SearchMultiSelectField versionTarget) {
        this.versionTarget = versionTarget;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof IssueSearchBasic)) {
            return false;
        }
        IssueSearchBasic other = (IssueSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.ageInMonths == null && other.getAgeInMonths() == null || this.ageInMonths != null && this.ageInMonths.equals(other.getAgeInMonths())) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && this.assigned.equals(other.getAssigned())) && (this.buildBroken == null && other.getBuildBroken() == null || this.buildBroken != null && this.buildBroken.equals(other.getBuildBroken())) && (this.buildBrokenName == null && other.getBuildBrokenName() == null || this.buildBrokenName != null && this.buildBrokenName.equals(other.getBuildBrokenName())) && (this.buildFixed == null && other.getBuildFixed() == null || this.buildFixed != null && this.buildFixed.equals(other.getBuildFixed())) && (this.buildFixedName == null && other.getBuildFixedName() == null || this.buildFixedName != null && this.buildFixedName.equals(other.getBuildFixedName())) && (this.buildTarget == null && other.getBuildTarget() == null || this.buildTarget != null && this.buildTarget.equals(other.getBuildTarget())) && (this.buildTargetName == null && other.getBuildTargetName() == null || this.buildTargetName != null && this.buildTargetName.equals(other.getBuildTargetName())) && (this.caseCount == null && other.getCaseCount() == null || this.caseCount != null && this.caseCount.equals(other.getCaseCount())) && (this.caseNumber == null && other.getCaseNumber() == null || this.caseNumber != null && this.caseNumber.equals(other.getCaseNumber())) && (this.closedDate == null && other.getClosedDate() == null || this.closedDate != null && this.closedDate.equals(other.getClosedDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.dateReleased == null && other.getDateReleased() == null || this.dateReleased != null && this.dateReleased.equals(other.getDateReleased())) && (this.details == null && other.getDetails() == null || this.details != null && this.details.equals(other.getDetails())) && (this.duplicateOf == null && other.getDuplicateOf() == null || this.duplicateOf != null && this.duplicateOf.equals(other.getDuplicateOf())) && (this.eFix == null && other.getEFix() == null || this.eFix != null && this.eFix.equals(other.getEFix())) && (this.employeeOrTeam == null && other.getEmployeeOrTeam() == null || this.employeeOrTeam != null && this.employeeOrTeam.equals(other.getEmployeeOrTeam())) && (this.eventStatus == null && other.getEventStatus() == null || this.eventStatus != null && this.eventStatus.equals(other.getEventStatus())) && (this.externalAbstract == null && other.getExternalAbstract() == null || this.externalAbstract != null && this.externalAbstract.equals(other.getExternalAbstract())) && (this.externalDetails == null && other.getExternalDetails() == null || this.externalDetails != null && this.externalDetails.equals(other.getExternalDetails())) && (this.externalFixedIn == null && other.getExternalFixedIn() == null || this.externalFixedIn != null && this.externalFixedIn.equals(other.getExternalFixedIn())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.externalStatus == null && other.getExternalStatus() == null || this.externalStatus != null && this.externalStatus.equals(other.getExternalStatus())) && (this.fixed == null && other.getFixed() == null || this.fixed != null && this.fixed.equals(other.getFixed())) && (this.fixedBy == null && other.getFixedBy() == null || this.fixedBy != null && this.fixedBy.equals(other.getFixedBy())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isOwner == null && other.getIsOwner() == null || this.isOwner != null && this.isOwner.equals(other.getIsOwner())) && (this.isReviewed == null && other.getIsReviewed() == null || this.isReviewed != null && this.isReviewed.equals(other.getIsReviewed())) && (this.isShowStopper == null && other.getIsShowStopper() == null || this.isShowStopper != null && this.isShowStopper.equals(other.getIsShowStopper())) && (this.issueAbstract == null && other.getIssueAbstract() == null || this.issueAbstract != null && this.issueAbstract.equals(other.getIssueAbstract())) && (this.issueNumber == null && other.getIssueNumber() == null || this.issueNumber != null && this.issueNumber.equals(other.getIssueNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.module == null && other.getModule() == null || this.module != null && this.module.equals(other.getModule())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.originalFixedIn == null && other.getOriginalFixedIn() == null || this.originalFixedIn != null && this.originalFixedIn.equals(other.getOriginalFixedIn())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.product == null && other.getProduct() == null || this.product != null && this.product.equals(other.getProduct())) && (this.productTeam == null && other.getProductTeam() == null || this.productTeam != null && this.productTeam.equals(other.getProductTeam())) && (this.relatedIssue == null && other.getRelatedIssue() == null || this.relatedIssue != null && this.relatedIssue.equals(other.getRelatedIssue())) && (this.relationship == null && other.getRelationship() == null || this.relationship != null && this.relationship.equals(other.getRelationship())) && (this.relationshipComment == null && other.getRelationshipComment() == null || this.relationshipComment != null && this.relationshipComment.equals(other.getRelationshipComment())) && (this.reportedBy == null && other.getReportedBy() == null || this.reportedBy != null && this.reportedBy.equals(other.getReportedBy())) && (this.reproduce == null && other.getReproduce() == null || this.reproduce != null && this.reproduce.equals(other.getReproduce())) && (this.resolved == null && other.getResolved() == null || this.resolved != null && this.resolved.equals(other.getResolved())) && (this.resolvedBy == null && other.getResolvedBy() == null || this.resolvedBy != null && this.resolvedBy.equals(other.getResolvedBy())) && (this.reviewer == null && other.getReviewer() == null || this.reviewer != null && this.reviewer.equals(other.getReviewer())) && (this.severity == null && other.getSeverity() == null || this.severity != null && this.severity.equals(other.getSeverity())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.tags == null && other.getTags() == null || this.tags != null && this.tags.equals(other.getTags())) && (this.tracking == null && other.getTracking() == null || this.tracking != null && this.tracking.equals(other.getTracking())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.userType == null && other.getUserType() == null || this.userType != null && this.userType.equals(other.getUserType())) && (this.versionBroken == null && other.getVersionBroken() == null || this.versionBroken != null && this.versionBroken.equals(other.getVersionBroken())) && (this.versionFixed == null && other.getVersionFixed() == null || this.versionFixed != null && this.versionFixed.equals(other.getVersionFixed())) && (this.versionTarget == null && other.getVersionTarget() == null || this.versionTarget != null && this.versionTarget.equals(other.getVersionTarget())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAgeInMonths() != null) {
            _hashCode += this.getAgeInMonths().hashCode();
        }
        if (this.getAssigned() != null) {
            _hashCode += this.getAssigned().hashCode();
        }
        if (this.getBuildBroken() != null) {
            _hashCode += this.getBuildBroken().hashCode();
        }
        if (this.getBuildBrokenName() != null) {
            _hashCode += this.getBuildBrokenName().hashCode();
        }
        if (this.getBuildFixed() != null) {
            _hashCode += this.getBuildFixed().hashCode();
        }
        if (this.getBuildFixedName() != null) {
            _hashCode += this.getBuildFixedName().hashCode();
        }
        if (this.getBuildTarget() != null) {
            _hashCode += this.getBuildTarget().hashCode();
        }
        if (this.getBuildTargetName() != null) {
            _hashCode += this.getBuildTargetName().hashCode();
        }
        if (this.getCaseCount() != null) {
            _hashCode += this.getCaseCount().hashCode();
        }
        if (this.getCaseNumber() != null) {
            _hashCode += this.getCaseNumber().hashCode();
        }
        if (this.getClosedDate() != null) {
            _hashCode += this.getClosedDate().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getDateReleased() != null) {
            _hashCode += this.getDateReleased().hashCode();
        }
        if (this.getDetails() != null) {
            _hashCode += this.getDetails().hashCode();
        }
        if (this.getDuplicateOf() != null) {
            _hashCode += this.getDuplicateOf().hashCode();
        }
        if (this.getEFix() != null) {
            _hashCode += this.getEFix().hashCode();
        }
        if (this.getEmployeeOrTeam() != null) {
            _hashCode += this.getEmployeeOrTeam().hashCode();
        }
        if (this.getEventStatus() != null) {
            _hashCode += this.getEventStatus().hashCode();
        }
        if (this.getExternalAbstract() != null) {
            _hashCode += this.getExternalAbstract().hashCode();
        }
        if (this.getExternalDetails() != null) {
            _hashCode += this.getExternalDetails().hashCode();
        }
        if (this.getExternalFixedIn() != null) {
            _hashCode += this.getExternalFixedIn().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getExternalStatus() != null) {
            _hashCode += this.getExternalStatus().hashCode();
        }
        if (this.getFixed() != null) {
            _hashCode += this.getFixed().hashCode();
        }
        if (this.getFixedBy() != null) {
            _hashCode += this.getFixedBy().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsOwner() != null) {
            _hashCode += this.getIsOwner().hashCode();
        }
        if (this.getIsReviewed() != null) {
            _hashCode += this.getIsReviewed().hashCode();
        }
        if (this.getIsShowStopper() != null) {
            _hashCode += this.getIsShowStopper().hashCode();
        }
        if (this.getIssueAbstract() != null) {
            _hashCode += this.getIssueAbstract().hashCode();
        }
        if (this.getIssueNumber() != null) {
            _hashCode += this.getIssueNumber().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getModule() != null) {
            _hashCode += this.getModule().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getOriginalFixedIn() != null) {
            _hashCode += this.getOriginalFixedIn().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getProduct() != null) {
            _hashCode += this.getProduct().hashCode();
        }
        if (this.getProductTeam() != null) {
            _hashCode += this.getProductTeam().hashCode();
        }
        if (this.getRelatedIssue() != null) {
            _hashCode += this.getRelatedIssue().hashCode();
        }
        if (this.getRelationship() != null) {
            _hashCode += this.getRelationship().hashCode();
        }
        if (this.getRelationshipComment() != null) {
            _hashCode += this.getRelationshipComment().hashCode();
        }
        if (this.getReportedBy() != null) {
            _hashCode += this.getReportedBy().hashCode();
        }
        if (this.getReproduce() != null) {
            _hashCode += this.getReproduce().hashCode();
        }
        if (this.getResolved() != null) {
            _hashCode += this.getResolved().hashCode();
        }
        if (this.getResolvedBy() != null) {
            _hashCode += this.getResolvedBy().hashCode();
        }
        if (this.getReviewer() != null) {
            _hashCode += this.getReviewer().hashCode();
        }
        if (this.getSeverity() != null) {
            _hashCode += this.getSeverity().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTags() != null) {
            _hashCode += this.getTags().hashCode();
        }
        if (this.getTracking() != null) {
            _hashCode += this.getTracking().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getUserType() != null) {
            _hashCode += this.getUserType().hashCode();
        }
        if (this.getVersionBroken() != null) {
            _hashCode += this.getVersionBroken().hashCode();
        }
        if (this.getVersionFixed() != null) {
            _hashCode += this.getVersionFixed().hashCode();
        }
        if (this.getVersionTarget() != null) {
            _hashCode += this.getVersionTarget().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "IssueSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildBrokenName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildBrokenName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildFixedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildFixedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTargetName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTargetName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "details"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EFix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eFix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalFixedIn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relatedIssue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relatedIssue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resolved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resolvedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resolvedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tracking");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tracking"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

