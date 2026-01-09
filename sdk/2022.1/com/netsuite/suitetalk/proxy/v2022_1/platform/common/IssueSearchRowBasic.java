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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
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

public class IssueSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnLongField[] ageInMonths;
    private SearchColumnSelectField[] assigned;
    private SearchColumnSelectField[] buildBroken;
    private SearchColumnSelectField[] buildFixed;
    private SearchColumnSelectField[] buildTarget;
    private SearchColumnLongField[] caseCount;
    private SearchColumnStringField[] caseNumber;
    private SearchColumnDateField[] closedDate;
    private SearchColumnDateField[] createdDate;
    private SearchColumnDateField[] dateReleased;
    private SearchColumnSelectField[] duplicateOf;
    private SearchColumnSelectField[] employeeOrTeam;
    private SearchColumnEnumSelectField[] eventStatus;
    private SearchColumnStringField[] externalAbstract;
    private SearchColumnStringField[] externalDetails;
    private SearchColumnStringField[] externalFixedIn;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] externalStatus;
    private SearchColumnDateField[] fixed;
    private SearchColumnSelectField[] fixedBy;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isOwner;
    private SearchColumnBooleanField[] isReviewed;
    private SearchColumnBooleanField[] isShowStopper;
    private SearchColumnStringField[] issueAbstract;
    private SearchColumnSelectField[] issueStatus;
    private SearchColumnSelectField[] item;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] module;
    private SearchColumnStringField[] number;
    private SearchColumnStringField[] originalFixedIn;
    private SearchColumnSelectField[] priority;
    private SearchColumnSelectField[] product;
    private SearchColumnSelectField[] productTeam;
    private SearchColumnSelectField[] relatedIssue;
    private SearchColumnEnumSelectField[] relationship;
    private SearchColumnStringField[] relationshipComment;
    private SearchColumnSelectField[] reportedBy;
    private SearchColumnSelectField[] reproduce;
    private SearchColumnDateField[] resolved;
    private SearchColumnSelectField[] resolvedBy;
    private SearchColumnSelectField[] reviewer;
    private SearchColumnSelectField[] severity;
    private SearchColumnEnumSelectField[] source;
    private SearchColumnSelectField[] tags;
    private SearchColumnStringField[] type;
    private SearchColumnSelectField[] userType;
    private SearchColumnSelectField[] versionBroken;
    private SearchColumnSelectField[] versionFixed;
    private SearchColumnSelectField[] versionTarget;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(IssueSearchRowBasic.class, true);

    public IssueSearchRowBasic() {
    }

    public IssueSearchRowBasic(SearchColumnLongField[] ageInMonths, SearchColumnSelectField[] assigned, SearchColumnSelectField[] buildBroken, SearchColumnSelectField[] buildFixed, SearchColumnSelectField[] buildTarget, SearchColumnLongField[] caseCount, SearchColumnStringField[] caseNumber, SearchColumnDateField[] closedDate, SearchColumnDateField[] createdDate, SearchColumnDateField[] dateReleased, SearchColumnSelectField[] duplicateOf, SearchColumnSelectField[] employeeOrTeam, SearchColumnEnumSelectField[] eventStatus, SearchColumnStringField[] externalAbstract, SearchColumnStringField[] externalDetails, SearchColumnStringField[] externalFixedIn, SearchColumnSelectField[] externalId, SearchColumnSelectField[] externalStatus, SearchColumnDateField[] fixed, SearchColumnSelectField[] fixedBy, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isOwner, SearchColumnBooleanField[] isReviewed, SearchColumnBooleanField[] isShowStopper, SearchColumnStringField[] issueAbstract, SearchColumnSelectField[] issueStatus, SearchColumnSelectField[] item, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] module, SearchColumnStringField[] number, SearchColumnStringField[] originalFixedIn, SearchColumnSelectField[] priority, SearchColumnSelectField[] product, SearchColumnSelectField[] productTeam, SearchColumnSelectField[] relatedIssue, SearchColumnEnumSelectField[] relationship, SearchColumnStringField[] relationshipComment, SearchColumnSelectField[] reportedBy, SearchColumnSelectField[] reproduce, SearchColumnDateField[] resolved, SearchColumnSelectField[] resolvedBy, SearchColumnSelectField[] reviewer, SearchColumnSelectField[] severity, SearchColumnEnumSelectField[] source, SearchColumnSelectField[] tags, SearchColumnStringField[] type, SearchColumnSelectField[] userType, SearchColumnSelectField[] versionBroken, SearchColumnSelectField[] versionFixed, SearchColumnSelectField[] versionTarget, SearchColumnCustomFieldList customFieldList) {
        this.ageInMonths = ageInMonths;
        this.assigned = assigned;
        this.buildBroken = buildBroken;
        this.buildFixed = buildFixed;
        this.buildTarget = buildTarget;
        this.caseCount = caseCount;
        this.caseNumber = caseNumber;
        this.closedDate = closedDate;
        this.createdDate = createdDate;
        this.dateReleased = dateReleased;
        this.duplicateOf = duplicateOf;
        this.employeeOrTeam = employeeOrTeam;
        this.eventStatus = eventStatus;
        this.externalAbstract = externalAbstract;
        this.externalDetails = externalDetails;
        this.externalFixedIn = externalFixedIn;
        this.externalId = externalId;
        this.externalStatus = externalStatus;
        this.fixed = fixed;
        this.fixedBy = fixedBy;
        this.internalId = internalId;
        this.isOwner = isOwner;
        this.isReviewed = isReviewed;
        this.isShowStopper = isShowStopper;
        this.issueAbstract = issueAbstract;
        this.issueStatus = issueStatus;
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
        this.tags = tags;
        this.type = type;
        this.userType = userType;
        this.versionBroken = versionBroken;
        this.versionFixed = versionFixed;
        this.versionTarget = versionTarget;
        this.customFieldList = customFieldList;
    }

    public SearchColumnLongField[] getAgeInMonths() {
        return this.ageInMonths;
    }

    public void setAgeInMonths(SearchColumnLongField[] ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public SearchColumnLongField getAgeInMonths(int i) {
        return this.ageInMonths[i];
    }

    public void setAgeInMonths(int i, SearchColumnLongField _value) {
        this.ageInMonths[i] = _value;
    }

    public SearchColumnSelectField[] getAssigned() {
        return this.assigned;
    }

    public void setAssigned(SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }

    public SearchColumnSelectField[] getBuildBroken() {
        return this.buildBroken;
    }

    public void setBuildBroken(SearchColumnSelectField[] buildBroken) {
        this.buildBroken = buildBroken;
    }

    public SearchColumnSelectField getBuildBroken(int i) {
        return this.buildBroken[i];
    }

    public void setBuildBroken(int i, SearchColumnSelectField _value) {
        this.buildBroken[i] = _value;
    }

    public SearchColumnSelectField[] getBuildFixed() {
        return this.buildFixed;
    }

    public void setBuildFixed(SearchColumnSelectField[] buildFixed) {
        this.buildFixed = buildFixed;
    }

    public SearchColumnSelectField getBuildFixed(int i) {
        return this.buildFixed[i];
    }

    public void setBuildFixed(int i, SearchColumnSelectField _value) {
        this.buildFixed[i] = _value;
    }

    public SearchColumnSelectField[] getBuildTarget() {
        return this.buildTarget;
    }

    public void setBuildTarget(SearchColumnSelectField[] buildTarget) {
        this.buildTarget = buildTarget;
    }

    public SearchColumnSelectField getBuildTarget(int i) {
        return this.buildTarget[i];
    }

    public void setBuildTarget(int i, SearchColumnSelectField _value) {
        this.buildTarget[i] = _value;
    }

    public SearchColumnLongField[] getCaseCount() {
        return this.caseCount;
    }

    public void setCaseCount(SearchColumnLongField[] caseCount) {
        this.caseCount = caseCount;
    }

    public SearchColumnLongField getCaseCount(int i) {
        return this.caseCount[i];
    }

    public void setCaseCount(int i, SearchColumnLongField _value) {
        this.caseCount[i] = _value;
    }

    public SearchColumnStringField[] getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }

    public SearchColumnDateField[] getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(SearchColumnDateField[] closedDate) {
        this.closedDate = closedDate;
    }

    public SearchColumnDateField getClosedDate(int i) {
        return this.closedDate[i];
    }

    public void setClosedDate(int i, SearchColumnDateField _value) {
        this.closedDate[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }

    public SearchColumnDateField[] getDateReleased() {
        return this.dateReleased;
    }

    public void setDateReleased(SearchColumnDateField[] dateReleased) {
        this.dateReleased = dateReleased;
    }

    public SearchColumnDateField getDateReleased(int i) {
        return this.dateReleased[i];
    }

    public void setDateReleased(int i, SearchColumnDateField _value) {
        this.dateReleased[i] = _value;
    }

    public SearchColumnSelectField[] getDuplicateOf() {
        return this.duplicateOf;
    }

    public void setDuplicateOf(SearchColumnSelectField[] duplicateOf) {
        this.duplicateOf = duplicateOf;
    }

    public SearchColumnSelectField getDuplicateOf(int i) {
        return this.duplicateOf[i];
    }

    public void setDuplicateOf(int i, SearchColumnSelectField _value) {
        this.duplicateOf[i] = _value;
    }

    public SearchColumnSelectField[] getEmployeeOrTeam() {
        return this.employeeOrTeam;
    }

    public void setEmployeeOrTeam(SearchColumnSelectField[] employeeOrTeam) {
        this.employeeOrTeam = employeeOrTeam;
    }

    public SearchColumnSelectField getEmployeeOrTeam(int i) {
        return this.employeeOrTeam[i];
    }

    public void setEmployeeOrTeam(int i, SearchColumnSelectField _value) {
        this.employeeOrTeam[i] = _value;
    }

    public SearchColumnEnumSelectField[] getEventStatus() {
        return this.eventStatus;
    }

    public void setEventStatus(SearchColumnEnumSelectField[] eventStatus) {
        this.eventStatus = eventStatus;
    }

    public SearchColumnEnumSelectField getEventStatus(int i) {
        return this.eventStatus[i];
    }

    public void setEventStatus(int i, SearchColumnEnumSelectField _value) {
        this.eventStatus[i] = _value;
    }

    public SearchColumnStringField[] getExternalAbstract() {
        return this.externalAbstract;
    }

    public void setExternalAbstract(SearchColumnStringField[] externalAbstract) {
        this.externalAbstract = externalAbstract;
    }

    public SearchColumnStringField getExternalAbstract(int i) {
        return this.externalAbstract[i];
    }

    public void setExternalAbstract(int i, SearchColumnStringField _value) {
        this.externalAbstract[i] = _value;
    }

    public SearchColumnStringField[] getExternalDetails() {
        return this.externalDetails;
    }

    public void setExternalDetails(SearchColumnStringField[] externalDetails) {
        this.externalDetails = externalDetails;
    }

    public SearchColumnStringField getExternalDetails(int i) {
        return this.externalDetails[i];
    }

    public void setExternalDetails(int i, SearchColumnStringField _value) {
        this.externalDetails[i] = _value;
    }

    public SearchColumnStringField[] getExternalFixedIn() {
        return this.externalFixedIn;
    }

    public void setExternalFixedIn(SearchColumnStringField[] externalFixedIn) {
        this.externalFixedIn = externalFixedIn;
    }

    public SearchColumnStringField getExternalFixedIn(int i) {
        return this.externalFixedIn[i];
    }

    public void setExternalFixedIn(int i, SearchColumnStringField _value) {
        this.externalFixedIn[i] = _value;
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

    public SearchColumnSelectField[] getExternalStatus() {
        return this.externalStatus;
    }

    public void setExternalStatus(SearchColumnSelectField[] externalStatus) {
        this.externalStatus = externalStatus;
    }

    public SearchColumnSelectField getExternalStatus(int i) {
        return this.externalStatus[i];
    }

    public void setExternalStatus(int i, SearchColumnSelectField _value) {
        this.externalStatus[i] = _value;
    }

    public SearchColumnDateField[] getFixed() {
        return this.fixed;
    }

    public void setFixed(SearchColumnDateField[] fixed) {
        this.fixed = fixed;
    }

    public SearchColumnDateField getFixed(int i) {
        return this.fixed[i];
    }

    public void setFixed(int i, SearchColumnDateField _value) {
        this.fixed[i] = _value;
    }

    public SearchColumnSelectField[] getFixedBy() {
        return this.fixedBy;
    }

    public void setFixedBy(SearchColumnSelectField[] fixedBy) {
        this.fixedBy = fixedBy;
    }

    public SearchColumnSelectField getFixedBy(int i) {
        return this.fixedBy[i];
    }

    public void setFixedBy(int i, SearchColumnSelectField _value) {
        this.fixedBy[i] = _value;
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

    public SearchColumnBooleanField[] getIsOwner() {
        return this.isOwner;
    }

    public void setIsOwner(SearchColumnBooleanField[] isOwner) {
        this.isOwner = isOwner;
    }

    public SearchColumnBooleanField getIsOwner(int i) {
        return this.isOwner[i];
    }

    public void setIsOwner(int i, SearchColumnBooleanField _value) {
        this.isOwner[i] = _value;
    }

    public SearchColumnBooleanField[] getIsReviewed() {
        return this.isReviewed;
    }

    public void setIsReviewed(SearchColumnBooleanField[] isReviewed) {
        this.isReviewed = isReviewed;
    }

    public SearchColumnBooleanField getIsReviewed(int i) {
        return this.isReviewed[i];
    }

    public void setIsReviewed(int i, SearchColumnBooleanField _value) {
        this.isReviewed[i] = _value;
    }

    public SearchColumnBooleanField[] getIsShowStopper() {
        return this.isShowStopper;
    }

    public void setIsShowStopper(SearchColumnBooleanField[] isShowStopper) {
        this.isShowStopper = isShowStopper;
    }

    public SearchColumnBooleanField getIsShowStopper(int i) {
        return this.isShowStopper[i];
    }

    public void setIsShowStopper(int i, SearchColumnBooleanField _value) {
        this.isShowStopper[i] = _value;
    }

    public SearchColumnStringField[] getIssueAbstract() {
        return this.issueAbstract;
    }

    public void setIssueAbstract(SearchColumnStringField[] issueAbstract) {
        this.issueAbstract = issueAbstract;
    }

    public SearchColumnStringField getIssueAbstract(int i) {
        return this.issueAbstract[i];
    }

    public void setIssueAbstract(int i, SearchColumnStringField _value) {
        this.issueAbstract[i] = _value;
    }

    public SearchColumnSelectField[] getIssueStatus() {
        return this.issueStatus;
    }

    public void setIssueStatus(SearchColumnSelectField[] issueStatus) {
        this.issueStatus = issueStatus;
    }

    public SearchColumnSelectField getIssueStatus(int i) {
        return this.issueStatus[i];
    }

    public void setIssueStatus(int i, SearchColumnSelectField _value) {
        this.issueStatus[i] = _value;
    }

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
    }

    public SearchColumnDateField[] getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }

    public SearchColumnStringField[] getModule() {
        return this.module;
    }

    public void setModule(SearchColumnStringField[] module) {
        this.module = module;
    }

    public SearchColumnStringField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, SearchColumnStringField _value) {
        this.module[i] = _value;
    }

    public SearchColumnStringField[] getNumber() {
        return this.number;
    }

    public void setNumber(SearchColumnStringField[] number) {
        this.number = number;
    }

    public SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, SearchColumnStringField _value) {
        this.number[i] = _value;
    }

    public SearchColumnStringField[] getOriginalFixedIn() {
        return this.originalFixedIn;
    }

    public void setOriginalFixedIn(SearchColumnStringField[] originalFixedIn) {
        this.originalFixedIn = originalFixedIn;
    }

    public SearchColumnStringField getOriginalFixedIn(int i) {
        return this.originalFixedIn[i];
    }

    public void setOriginalFixedIn(int i, SearchColumnStringField _value) {
        this.originalFixedIn[i] = _value;
    }

    public SearchColumnSelectField[] getPriority() {
        return this.priority;
    }

    public void setPriority(SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }

    public SearchColumnSelectField[] getProduct() {
        return this.product;
    }

    public void setProduct(SearchColumnSelectField[] product) {
        this.product = product;
    }

    public SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, SearchColumnSelectField _value) {
        this.product[i] = _value;
    }

    public SearchColumnSelectField[] getProductTeam() {
        return this.productTeam;
    }

    public void setProductTeam(SearchColumnSelectField[] productTeam) {
        this.productTeam = productTeam;
    }

    public SearchColumnSelectField getProductTeam(int i) {
        return this.productTeam[i];
    }

    public void setProductTeam(int i, SearchColumnSelectField _value) {
        this.productTeam[i] = _value;
    }

    public SearchColumnSelectField[] getRelatedIssue() {
        return this.relatedIssue;
    }

    public void setRelatedIssue(SearchColumnSelectField[] relatedIssue) {
        this.relatedIssue = relatedIssue;
    }

    public SearchColumnSelectField getRelatedIssue(int i) {
        return this.relatedIssue[i];
    }

    public void setRelatedIssue(int i, SearchColumnSelectField _value) {
        this.relatedIssue[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRelationship() {
        return this.relationship;
    }

    public void setRelationship(SearchColumnEnumSelectField[] relationship) {
        this.relationship = relationship;
    }

    public SearchColumnEnumSelectField getRelationship(int i) {
        return this.relationship[i];
    }

    public void setRelationship(int i, SearchColumnEnumSelectField _value) {
        this.relationship[i] = _value;
    }

    public SearchColumnStringField[] getRelationshipComment() {
        return this.relationshipComment;
    }

    public void setRelationshipComment(SearchColumnStringField[] relationshipComment) {
        this.relationshipComment = relationshipComment;
    }

    public SearchColumnStringField getRelationshipComment(int i) {
        return this.relationshipComment[i];
    }

    public void setRelationshipComment(int i, SearchColumnStringField _value) {
        this.relationshipComment[i] = _value;
    }

    public SearchColumnSelectField[] getReportedBy() {
        return this.reportedBy;
    }

    public void setReportedBy(SearchColumnSelectField[] reportedBy) {
        this.reportedBy = reportedBy;
    }

    public SearchColumnSelectField getReportedBy(int i) {
        return this.reportedBy[i];
    }

    public void setReportedBy(int i, SearchColumnSelectField _value) {
        this.reportedBy[i] = _value;
    }

    public SearchColumnSelectField[] getReproduce() {
        return this.reproduce;
    }

    public void setReproduce(SearchColumnSelectField[] reproduce) {
        this.reproduce = reproduce;
    }

    public SearchColumnSelectField getReproduce(int i) {
        return this.reproduce[i];
    }

    public void setReproduce(int i, SearchColumnSelectField _value) {
        this.reproduce[i] = _value;
    }

    public SearchColumnDateField[] getResolved() {
        return this.resolved;
    }

    public void setResolved(SearchColumnDateField[] resolved) {
        this.resolved = resolved;
    }

    public SearchColumnDateField getResolved(int i) {
        return this.resolved[i];
    }

    public void setResolved(int i, SearchColumnDateField _value) {
        this.resolved[i] = _value;
    }

    public SearchColumnSelectField[] getResolvedBy() {
        return this.resolvedBy;
    }

    public void setResolvedBy(SearchColumnSelectField[] resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public SearchColumnSelectField getResolvedBy(int i) {
        return this.resolvedBy[i];
    }

    public void setResolvedBy(int i, SearchColumnSelectField _value) {
        this.resolvedBy[i] = _value;
    }

    public SearchColumnSelectField[] getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(SearchColumnSelectField[] reviewer) {
        this.reviewer = reviewer;
    }

    public SearchColumnSelectField getReviewer(int i) {
        return this.reviewer[i];
    }

    public void setReviewer(int i, SearchColumnSelectField _value) {
        this.reviewer[i] = _value;
    }

    public SearchColumnSelectField[] getSeverity() {
        return this.severity;
    }

    public void setSeverity(SearchColumnSelectField[] severity) {
        this.severity = severity;
    }

    public SearchColumnSelectField getSeverity(int i) {
        return this.severity[i];
    }

    public void setSeverity(int i, SearchColumnSelectField _value) {
        this.severity[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSource() {
        return this.source;
    }

    public void setSource(SearchColumnEnumSelectField[] source) {
        this.source = source;
    }

    public SearchColumnEnumSelectField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, SearchColumnEnumSelectField _value) {
        this.source[i] = _value;
    }

    public SearchColumnSelectField[] getTags() {
        return this.tags;
    }

    public void setTags(SearchColumnSelectField[] tags) {
        this.tags = tags;
    }

    public SearchColumnSelectField getTags(int i) {
        return this.tags[i];
    }

    public void setTags(int i, SearchColumnSelectField _value) {
        this.tags[i] = _value;
    }

    public SearchColumnStringField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnStringField[] type) {
        this.type = type;
    }

    public SearchColumnStringField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnStringField _value) {
        this.type[i] = _value;
    }

    public SearchColumnSelectField[] getUserType() {
        return this.userType;
    }

    public void setUserType(SearchColumnSelectField[] userType) {
        this.userType = userType;
    }

    public SearchColumnSelectField getUserType(int i) {
        return this.userType[i];
    }

    public void setUserType(int i, SearchColumnSelectField _value) {
        this.userType[i] = _value;
    }

    public SearchColumnSelectField[] getVersionBroken() {
        return this.versionBroken;
    }

    public void setVersionBroken(SearchColumnSelectField[] versionBroken) {
        this.versionBroken = versionBroken;
    }

    public SearchColumnSelectField getVersionBroken(int i) {
        return this.versionBroken[i];
    }

    public void setVersionBroken(int i, SearchColumnSelectField _value) {
        this.versionBroken[i] = _value;
    }

    public SearchColumnSelectField[] getVersionFixed() {
        return this.versionFixed;
    }

    public void setVersionFixed(SearchColumnSelectField[] versionFixed) {
        this.versionFixed = versionFixed;
    }

    public SearchColumnSelectField getVersionFixed(int i) {
        return this.versionFixed[i];
    }

    public void setVersionFixed(int i, SearchColumnSelectField _value) {
        this.versionFixed[i] = _value;
    }

    public SearchColumnSelectField[] getVersionTarget() {
        return this.versionTarget;
    }

    public void setVersionTarget(SearchColumnSelectField[] versionTarget) {
        this.versionTarget = versionTarget;
    }

    public SearchColumnSelectField getVersionTarget(int i) {
        return this.versionTarget[i];
    }

    public void setVersionTarget(int i, SearchColumnSelectField _value) {
        this.versionTarget[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof IssueSearchRowBasic)) {
            return false;
        }
        IssueSearchRowBasic other = (IssueSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.ageInMonths == null && other.getAgeInMonths() == null || this.ageInMonths != null && Arrays.equals(this.ageInMonths, other.getAgeInMonths())) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && Arrays.equals(this.assigned, other.getAssigned())) && (this.buildBroken == null && other.getBuildBroken() == null || this.buildBroken != null && Arrays.equals(this.buildBroken, other.getBuildBroken())) && (this.buildFixed == null && other.getBuildFixed() == null || this.buildFixed != null && Arrays.equals(this.buildFixed, other.getBuildFixed())) && (this.buildTarget == null && other.getBuildTarget() == null || this.buildTarget != null && Arrays.equals(this.buildTarget, other.getBuildTarget())) && (this.caseCount == null && other.getCaseCount() == null || this.caseCount != null && Arrays.equals(this.caseCount, other.getCaseCount())) && (this.caseNumber == null && other.getCaseNumber() == null || this.caseNumber != null && Arrays.equals(this.caseNumber, other.getCaseNumber())) && (this.closedDate == null && other.getClosedDate() == null || this.closedDate != null && Arrays.equals(this.closedDate, other.getClosedDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.dateReleased == null && other.getDateReleased() == null || this.dateReleased != null && Arrays.equals(this.dateReleased, other.getDateReleased())) && (this.duplicateOf == null && other.getDuplicateOf() == null || this.duplicateOf != null && Arrays.equals(this.duplicateOf, other.getDuplicateOf())) && (this.employeeOrTeam == null && other.getEmployeeOrTeam() == null || this.employeeOrTeam != null && Arrays.equals(this.employeeOrTeam, other.getEmployeeOrTeam())) && (this.eventStatus == null && other.getEventStatus() == null || this.eventStatus != null && Arrays.equals(this.eventStatus, other.getEventStatus())) && (this.externalAbstract == null && other.getExternalAbstract() == null || this.externalAbstract != null && Arrays.equals(this.externalAbstract, other.getExternalAbstract())) && (this.externalDetails == null && other.getExternalDetails() == null || this.externalDetails != null && Arrays.equals(this.externalDetails, other.getExternalDetails())) && (this.externalFixedIn == null && other.getExternalFixedIn() == null || this.externalFixedIn != null && Arrays.equals(this.externalFixedIn, other.getExternalFixedIn())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.externalStatus == null && other.getExternalStatus() == null || this.externalStatus != null && Arrays.equals(this.externalStatus, other.getExternalStatus())) && (this.fixed == null && other.getFixed() == null || this.fixed != null && Arrays.equals(this.fixed, other.getFixed())) && (this.fixedBy == null && other.getFixedBy() == null || this.fixedBy != null && Arrays.equals(this.fixedBy, other.getFixedBy())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isOwner == null && other.getIsOwner() == null || this.isOwner != null && Arrays.equals(this.isOwner, other.getIsOwner())) && (this.isReviewed == null && other.getIsReviewed() == null || this.isReviewed != null && Arrays.equals(this.isReviewed, other.getIsReviewed())) && (this.isShowStopper == null && other.getIsShowStopper() == null || this.isShowStopper != null && Arrays.equals(this.isShowStopper, other.getIsShowStopper())) && (this.issueAbstract == null && other.getIssueAbstract() == null || this.issueAbstract != null && Arrays.equals(this.issueAbstract, other.getIssueAbstract())) && (this.issueStatus == null && other.getIssueStatus() == null || this.issueStatus != null && Arrays.equals(this.issueStatus, other.getIssueStatus())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.module == null && other.getModule() == null || this.module != null && Arrays.equals(this.module, other.getModule())) && (this.number == null && other.getNumber() == null || this.number != null && Arrays.equals(this.number, other.getNumber())) && (this.originalFixedIn == null && other.getOriginalFixedIn() == null || this.originalFixedIn != null && Arrays.equals(this.originalFixedIn, other.getOriginalFixedIn())) && (this.priority == null && other.getPriority() == null || this.priority != null && Arrays.equals(this.priority, other.getPriority())) && (this.product == null && other.getProduct() == null || this.product != null && Arrays.equals(this.product, other.getProduct())) && (this.productTeam == null && other.getProductTeam() == null || this.productTeam != null && Arrays.equals(this.productTeam, other.getProductTeam())) && (this.relatedIssue == null && other.getRelatedIssue() == null || this.relatedIssue != null && Arrays.equals(this.relatedIssue, other.getRelatedIssue())) && (this.relationship == null && other.getRelationship() == null || this.relationship != null && Arrays.equals(this.relationship, other.getRelationship())) && (this.relationshipComment == null && other.getRelationshipComment() == null || this.relationshipComment != null && Arrays.equals(this.relationshipComment, other.getRelationshipComment())) && (this.reportedBy == null && other.getReportedBy() == null || this.reportedBy != null && Arrays.equals(this.reportedBy, other.getReportedBy())) && (this.reproduce == null && other.getReproduce() == null || this.reproduce != null && Arrays.equals(this.reproduce, other.getReproduce())) && (this.resolved == null && other.getResolved() == null || this.resolved != null && Arrays.equals(this.resolved, other.getResolved())) && (this.resolvedBy == null && other.getResolvedBy() == null || this.resolvedBy != null && Arrays.equals(this.resolvedBy, other.getResolvedBy())) && (this.reviewer == null && other.getReviewer() == null || this.reviewer != null && Arrays.equals(this.reviewer, other.getReviewer())) && (this.severity == null && other.getSeverity() == null || this.severity != null && Arrays.equals(this.severity, other.getSeverity())) && (this.source == null && other.getSource() == null || this.source != null && Arrays.equals(this.source, other.getSource())) && (this.tags == null && other.getTags() == null || this.tags != null && Arrays.equals(this.tags, other.getTags())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType())) && (this.userType == null && other.getUserType() == null || this.userType != null && Arrays.equals(this.userType, other.getUserType())) && (this.versionBroken == null && other.getVersionBroken() == null || this.versionBroken != null && Arrays.equals(this.versionBroken, other.getVersionBroken())) && (this.versionFixed == null && other.getVersionFixed() == null || this.versionFixed != null && Arrays.equals(this.versionFixed, other.getVersionFixed())) && (this.versionTarget == null && other.getVersionTarget() == null || this.versionTarget != null && Arrays.equals(this.versionTarget, other.getVersionTarget())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAgeInMonths() != null) {
            for (i = 0; i < Array.getLength(this.getAgeInMonths()); ++i) {
                obj = Array.get(this.getAgeInMonths(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssigned() != null) {
            for (i = 0; i < Array.getLength(this.getAssigned()); ++i) {
                obj = Array.get(this.getAssigned(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildBroken() != null) {
            for (i = 0; i < Array.getLength(this.getBuildBroken()); ++i) {
                obj = Array.get(this.getBuildBroken(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildFixed() != null) {
            for (i = 0; i < Array.getLength(this.getBuildFixed()); ++i) {
                obj = Array.get(this.getBuildFixed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildTarget() != null) {
            for (i = 0; i < Array.getLength(this.getBuildTarget()); ++i) {
                obj = Array.get(this.getBuildTarget(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseCount() != null) {
            for (i = 0; i < Array.getLength(this.getCaseCount()); ++i) {
                obj = Array.get(this.getCaseCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseNumber() != null) {
            for (i = 0; i < Array.getLength(this.getCaseNumber()); ++i) {
                obj = Array.get(this.getCaseNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getClosedDate() != null) {
            for (i = 0; i < Array.getLength(this.getClosedDate()); ++i) {
                obj = Array.get(this.getClosedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateReleased() != null) {
            for (i = 0; i < Array.getLength(this.getDateReleased()); ++i) {
                obj = Array.get(this.getDateReleased(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDuplicateOf() != null) {
            for (i = 0; i < Array.getLength(this.getDuplicateOf()); ++i) {
                obj = Array.get(this.getDuplicateOf(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmployeeOrTeam() != null) {
            for (i = 0; i < Array.getLength(this.getEmployeeOrTeam()); ++i) {
                obj = Array.get(this.getEmployeeOrTeam(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEventStatus() != null) {
            for (i = 0; i < Array.getLength(this.getEventStatus()); ++i) {
                obj = Array.get(this.getEventStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalAbstract() != null) {
            for (i = 0; i < Array.getLength(this.getExternalAbstract()); ++i) {
                obj = Array.get(this.getExternalAbstract(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalDetails() != null) {
            for (i = 0; i < Array.getLength(this.getExternalDetails()); ++i) {
                obj = Array.get(this.getExternalDetails(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalFixedIn() != null) {
            for (i = 0; i < Array.getLength(this.getExternalFixedIn()); ++i) {
                obj = Array.get(this.getExternalFixedIn(), i);
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
        if (this.getExternalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getExternalStatus()); ++i) {
                obj = Array.get(this.getExternalStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFixed() != null) {
            for (i = 0; i < Array.getLength(this.getFixed()); ++i) {
                obj = Array.get(this.getFixed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFixedBy() != null) {
            for (i = 0; i < Array.getLength(this.getFixedBy()); ++i) {
                obj = Array.get(this.getFixedBy(), i);
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
        if (this.getIsOwner() != null) {
            for (i = 0; i < Array.getLength(this.getIsOwner()); ++i) {
                obj = Array.get(this.getIsOwner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsReviewed() != null) {
            for (i = 0; i < Array.getLength(this.getIsReviewed()); ++i) {
                obj = Array.get(this.getIsReviewed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsShowStopper() != null) {
            for (i = 0; i < Array.getLength(this.getIsShowStopper()); ++i) {
                obj = Array.get(this.getIsShowStopper(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIssueAbstract() != null) {
            for (i = 0; i < Array.getLength(this.getIssueAbstract()); ++i) {
                obj = Array.get(this.getIssueAbstract(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIssueStatus() != null) {
            for (i = 0; i < Array.getLength(this.getIssueStatus()); ++i) {
                obj = Array.get(this.getIssueStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getModule() != null) {
            for (i = 0; i < Array.getLength(this.getModule()); ++i) {
                obj = Array.get(this.getModule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumber() != null) {
            for (i = 0; i < Array.getLength(this.getNumber()); ++i) {
                obj = Array.get(this.getNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOriginalFixedIn() != null) {
            for (i = 0; i < Array.getLength(this.getOriginalFixedIn()); ++i) {
                obj = Array.get(this.getOriginalFixedIn(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriority() != null) {
            for (i = 0; i < Array.getLength(this.getPriority()); ++i) {
                obj = Array.get(this.getPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProduct() != null) {
            for (i = 0; i < Array.getLength(this.getProduct()); ++i) {
                obj = Array.get(this.getProduct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProductTeam() != null) {
            for (i = 0; i < Array.getLength(this.getProductTeam()); ++i) {
                obj = Array.get(this.getProductTeam(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRelatedIssue() != null) {
            for (i = 0; i < Array.getLength(this.getRelatedIssue()); ++i) {
                obj = Array.get(this.getRelatedIssue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRelationship() != null) {
            for (i = 0; i < Array.getLength(this.getRelationship()); ++i) {
                obj = Array.get(this.getRelationship(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRelationshipComment() != null) {
            for (i = 0; i < Array.getLength(this.getRelationshipComment()); ++i) {
                obj = Array.get(this.getRelationshipComment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReportedBy() != null) {
            for (i = 0; i < Array.getLength(this.getReportedBy()); ++i) {
                obj = Array.get(this.getReportedBy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReproduce() != null) {
            for (i = 0; i < Array.getLength(this.getReproduce()); ++i) {
                obj = Array.get(this.getReproduce(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResolved() != null) {
            for (i = 0; i < Array.getLength(this.getResolved()); ++i) {
                obj = Array.get(this.getResolved(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResolvedBy() != null) {
            for (i = 0; i < Array.getLength(this.getResolvedBy()); ++i) {
                obj = Array.get(this.getResolvedBy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReviewer() != null) {
            for (i = 0; i < Array.getLength(this.getReviewer()); ++i) {
                obj = Array.get(this.getReviewer(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSeverity() != null) {
            for (i = 0; i < Array.getLength(this.getSeverity()); ++i) {
                obj = Array.get(this.getSeverity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSource() != null) {
            for (i = 0; i < Array.getLength(this.getSource()); ++i) {
                obj = Array.get(this.getSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTags() != null) {
            for (i = 0; i < Array.getLength(this.getTags()); ++i) {
                obj = Array.get(this.getTags(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUserType() != null) {
            for (i = 0; i < Array.getLength(this.getUserType()); ++i) {
                obj = Array.get(this.getUserType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVersionBroken() != null) {
            for (i = 0; i < Array.getLength(this.getVersionBroken()); ++i) {
                obj = Array.get(this.getVersionBroken(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVersionFixed() != null) {
            for (i = 0; i < Array.getLength(this.getVersionFixed()); ++i) {
                obj = Array.get(this.getVersionFixed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVersionTarget() != null) {
            for (i = 0; i < Array.getLength(this.getVersionTarget()); ++i) {
                obj = Array.get(this.getVersionTarget(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "IssueSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("ageInMonths");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ageInMonths"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildBroken");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildFixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateReleased");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateReleased"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("duplicateOf");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "duplicateOf"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeOrTeam");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeOrTeam"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eventStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalAbstract");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalAbstract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalDetails");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalDetails"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalFixedIn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalFixedIn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("externalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("isOwner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOwner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReviewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isReviewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShowStopper");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShowStopper"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueAbstract");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueAbstract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originalFixedIn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "originalFixedIn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productTeam");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "productTeam"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relatedIssue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relatedIssue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relationship");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relationship"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relationshipComment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "relationshipComment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reportedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reportedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reproduce");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reproduce"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resolved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resolved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resolvedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resolvedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reviewer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reviewer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "severity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tags");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tags"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "userType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionBroken");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionBroken"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionFixed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionFixed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("versionTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "versionTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

