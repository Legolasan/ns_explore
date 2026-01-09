/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.netsuite.suitetalk.client.common.authentication.OAuthPassport
 *  com.netsuite.suitetalk.client.common.authentication.TokenPassport
 *  com.netsuite.suitetalk.client.common.contract.WebServicesSoapClient
 *  com.netsuite.suitetalk.client.common.utils.CommonUtils
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.AsyncStatusResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachBasicReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachContactReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRefList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRate
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateFilter
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangeEmail
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangePassword
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRate
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRateFilter
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRateList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationRefList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.DataCenterUrls
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.DeletedRecord
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.DeletionReason
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachBasicReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllRecord
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetBudgetExchangeRateResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCurrencyRateResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCustomizationIdResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDataCenterUrlsResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedFilter
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetItemAvailabilityResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetPostingTransactionSummaryResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchRecord
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueFieldDescription
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetServerTimeResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRecord
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailability
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailabilityFilter
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailabilityList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryField
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryFilter
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.UpdateInviteeStatusReference
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.AsyncStatusType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.CalendarEventAttendeeResponse
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.GetAllRecordType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.GetCustomizationType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.InitializeType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.RecordType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.SearchRecordType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ApplicationInfo
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.AsyncResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.Preferences
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponse
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.SearchPreferences
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.SessionResponse
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponse
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList
 *  javax.annotation.Nullable
 *  javax.annotation.ParametersAreNonnullByDefault
 *  javax.xml.rpc.ServiceException
 *  javax.xml.soap.MimeHeader
 *  javax.xml.soap.MimeHeaders
 *  javax.xml.soap.SOAPElement
 *  javax.xml.soap.SOAPEnvelope
 *  javax.xml.soap.SOAPException
 *  javax.xml.soap.SOAPHeader
 *  javax.xml.soap.SOAPMessage
 *  org.apache.axis.Message
 *  org.apache.axis.client.Call
 *  org.apache.axis.message.MimeHeaders
 *  org.apache.axis.message.SOAPHeaderElement
 *  org.apache.axis.soap.MessageFactoryImpl
 *  org.apache.commons.httpclient.HttpVersion
 *  org.apache.log4j.Logger
 */
package com.netsuite.suitetalk.client.v2022_1;

import com.netsuite.suitetalk.client.common.authentication.OAuthPassport;
import com.netsuite.suitetalk.client.common.authentication.TokenPassport;
import com.netsuite.suitetalk.client.common.contract.WebServicesSoapClient;
import com.netsuite.suitetalk.client.common.utils.CommonUtils;
import com.netsuite.suitetalk.client.v2022_1.WsCoreClient;
import com.netsuite.suitetalk.client.v2022_1.utils.Utils;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AsyncStatusResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachBasicReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachContactReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRefList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRate;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangeEmail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangePassword;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRate;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRateFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRateList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationRefList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DataCenterUrls;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DeletedRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DeletionReason;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachBasicReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetBudgetExchangeRateResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCurrencyRateResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCustomizationIdResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDataCenterUrlsResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetItemAvailabilityResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetPostingTransactionSummaryResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueFieldDescription;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetServerTimeResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailability;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailabilityFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailabilityList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.UpdateInviteeStatusReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.AsyncStatusType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.CalendarEventAttendeeResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.GetAllRecordType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.GetCustomizationType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.InitializeType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.RecordType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.SearchRecordType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ApplicationInfo;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.AsyncResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.Preferences;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.SearchPreferences;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.SessionResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.axis.Message;
import org.apache.axis.client.Call;
import org.apache.axis.message.MimeHeaders;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.soap.MessageFactoryImpl;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.log4j.Logger;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

@ParametersAreNonnullByDefault
public class WsClient
extends WsCoreClient
implements WebServicesSoapClient {
    private static final Logger LOG = Logger.getLogger(WsClient.class);
    private String sessionId;
    private String applicationId;
    private String lastSearchJobId;
    private String lastGetPostingTransactionSummaryJobId;
    private Preferences preferences;
    private SearchPreferences searchPreferences;

    public WsClient(URL url) {
        super(url);
        this.setHttpProtocolVersion(HttpVersion.HTTP_1_0);
    }

    public WsClient(TokenPassport tokenPassport, URL url) {
        this(url);
        this.setTokenPassport(tokenPassport);
    }

    public WsClient(OAuthPassport oAuthPassport, URL url) {
        this(url);
        this.setOAuthPassport(oAuthPassport);
    }

    protected Preferences getPreferences() {
        if (this.preferences == null) {
            this.preferences = new Preferences();
        }
        if (!this.isSoapHeaderSet("preferences")) {
            this.addSoapHeader("preferences", this.preferences);
        }
        return this.preferences;
    }

    protected SearchPreferences getSearchPreferences() {
        if (this.searchPreferences == null) {
            this.searchPreferences = new SearchPreferences();
        }
        if (!this.isSoapHeaderSet("searchPreferences")) {
            this.addSoapHeader("searchPreferences", this.searchPreferences);
        }
        return this.searchPreferences;
    }

    public void setIgnoreReadOnlyFields(boolean ignoreReadOnlyFields) {
        this.getPreferences().setIgnoreReadOnlyFields(Boolean.valueOf(ignoreReadOnlyFields));
    }

    public void setWarningAsError(boolean warningAsError) {
        this.getPreferences().setWarningAsError(Boolean.valueOf(warningAsError));
    }

    public void setDisableMandatoryCustomFieldValidation(boolean disableValidation) {
        this.getPreferences().setDisableMandatoryCustomFieldValidation(Boolean.valueOf(disableValidation));
    }

    public void setDisableSystemNotesForCustomFields(boolean disableSystemNotes) {
        this.getPreferences().setDisableSystemNotesForCustomFields(Boolean.valueOf(disableSystemNotes));
    }

    public void setRunServerSuiteScriptAndWorkflowTriggers(boolean runServerSuiteScriptAndWorkflowTriggers) {
        this.getPreferences().setRunServerSuiteScriptAndTriggerWorkflows(Boolean.valueOf(runServerSuiteScriptAndWorkflowTriggers));
    }

    public void setBodyFieldsOnly(boolean bodyFieldsOnly) {
        this.getSearchPreferences().setBodyFieldsOnly(Boolean.valueOf(bodyFieldsOnly));
    }

    public void setPageSize(int pageSize) {
        this.getSearchPreferences().setPageSize(Integer.valueOf(pageSize));
    }

    public void setReturnSearchColumns(boolean returnSearchColumns) {
        this.getSearchPreferences().setReturnSearchColumns(Boolean.valueOf(returnSearchColumns));
    }

    public void setSearchPreferences(boolean bodyFieldsOnly, int pageSize, boolean returnSearchColumns) {
        this.setBodyFieldsOnly(bodyFieldsOnly);
        this.setPageSize(pageSize);
        this.setReturnSearchColumns(returnSearchColumns);
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        if (applicationId == null || applicationId.equals(this.getApplicationId())) {
            return;
        }
        this.applicationId = applicationId;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.setApplicationId(applicationId);
        this.replaceSoapHeader("applicationInfo", applicationInfo);
    }

    public void unsetApplicationId() {
        this.applicationId = null;
        this.removeSoapHeader("applicationInfo");
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
        this.setAutomaticSessionManagement(false);
        this.setHttpHeader("Cookie", "JSESSIONID=" + sessionId);
    }

    public void unsetSessionId() {
        this.sessionId = null;
        this.removeSessionIdFromRequestHeaders();
        this.setAutomaticSessionManagement(true);
    }

    protected void removeSessionIdFromRequestHeaders() {
        MimeHeader sessionCookie = null;
        for (MimeHeader header : this.requestHttpHeaders) {
            if (!"Cookie".equals(header.getName()) || !header.getValue().contains("JSESSIONID")) continue;
            sessionCookie = header;
            break;
        }
        if (sessionCookie != null) {
            int index = this.requestHttpHeaders.indexOf(sessionCookie);
            this.requestHttpHeaders.remove(sessionCookie);
            String cookieWithoutSessionId = CommonUtils.getCookieWithoutSessionId((String)sessionCookie.getValue());
            if (!cookieWithoutSessionId.isEmpty()) {
                this.requestHttpHeaders.add(index, new MimeHeader(sessionCookie.getName(), cookieWithoutSessionId));
            }
        }
    }

    public String getLastJobId() {
        try {
            Call call = this.getStub()._getCall();
            Message message = call.getResponseMessage();
            SOAPHeader soapHeader = message.getSOAPHeader();
            SOAPHeaderElement documentInfo = (SOAPHeaderElement)soapHeader.getElementsByTagName("documentInfo").item(0);
            SOAPElement jobId = (SOAPElement)documentInfo.getElementsByTagName("nsId").item(0);
            return jobId.getValue();
        }
        catch (NullPointerException | SOAPException e) {
            return null;
        }
    }

    public synchronized WriteResponse callAddRecord(Record record) throws RemoteException {
        return this.getPort().add(record);
    }

    public String addRecord(Record record) throws RemoteException {
        WriteResponse writeResponse = this.callAddRecord(record);
        if (writeResponse.getStatus().isIsSuccess()) {
            return Utils.getInternalId(writeResponse.getBaseRef());
        }
        return null;
    }

    public synchronized WriteResponseList callAddRecords(Record ... records) throws RemoteException {
        return this.getPort().addList(records);
    }

    public WriteResponseList callAddRecords(List<? extends Record> records) throws RemoteException {
        return this.callAddRecords(records.toArray(new Record[records.size()]));
    }

    public List<String> addRecords(Record ... records) throws RemoteException {
        return Utils.getInternalIds(this.callAddRecords(records));
    }

    public List<String> addRecords(List<? extends Record> records) throws RemoteException {
        return this.addRecords(records.toArray(new Record[records.size()]));
    }

    public synchronized WriteResponse callUpdateRecord(Record record) throws RemoteException {
        return this.getPort().update(record);
    }

    public String updateRecord(Record record) throws RemoteException {
        WriteResponse writeResponse = this.callUpdateRecord(record);
        if (writeResponse.getStatus().isIsSuccess()) {
            return Utils.getInternalId(writeResponse.getBaseRef());
        }
        return null;
    }

    public synchronized WriteResponseList callUpdateRecords(Record ... records) throws RemoteException {
        return this.getPort().updateList(records);
    }

    public WriteResponseList callUpdateRecords(List<? extends Record> records) throws RemoteException {
        return this.callUpdateRecords(records.toArray(new Record[records.size()]));
    }

    public List<String> updateRecords(Record ... records) throws RemoteException {
        return Utils.getInternalIds(this.callUpdateRecords(records));
    }

    public List<String> updateRecords(List<? extends Record> records) throws RemoteException {
        return this.updateRecords(records.toArray(new Record[records.size()]));
    }

    public synchronized WriteResponse callUpsertRecord(Record record) throws RemoteException {
        return this.getPort().upsert(record);
    }

    public String upsertRecord(Record record) throws RemoteException {
        WriteResponse writeResponse = this.callUpsertRecord(record);
        if (writeResponse.getStatus().isIsSuccess()) {
            return Utils.getInternalId(writeResponse.getBaseRef());
        }
        return null;
    }

    public synchronized WriteResponseList callUpsertRecords(Record ... records) throws RemoteException {
        return this.getPort().upsertList(records);
    }

    public WriteResponseList callUpsertRecords(List<? extends Record> records) throws RemoteException {
        return this.callUpsertRecords(records.toArray(new Record[records.size()]));
    }

    public List<String> upsertRecords(Record ... records) throws RemoteException {
        return Utils.getInternalIds(this.callUpsertRecords(records));
    }

    public List<String> upsertRecords(List<? extends Record> records) throws RemoteException {
        return this.upsertRecords(records.toArray(new Record[records.size()]));
    }

    public synchronized ReadResponse callGetRecord(BaseRef baseRef) throws RemoteException {
        return this.getPort().get(baseRef);
    }

    public ReadResponse callGetRecord(String internalId, RecordType recordType) throws RemoteException {
        return this.callGetRecord((BaseRef)Utils.createRecordRef(internalId, recordType));
    }

    public Record getRecord(BaseRef baseRef) throws RemoteException {
        return this.callGetRecord(baseRef).getRecord();
    }

    public Record getRecord(String internalId, RecordType recordType) throws RemoteException {
        return this.getRecord((BaseRef)Utils.createRecordRef(internalId, recordType));
    }

    public ReadResponse callGetRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
        return this.callGetRecord((BaseRef)Utils.createRecordRefWithExternalId(externalId, recordType));
    }

    public Record getRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
        return this.callGetRecordByExternalId(externalId, recordType).getRecord();
    }

    public synchronized ReadResponseList callGetRecords(BaseRef ... baseRefs) throws RemoteException {
        return this.getPort().getList(baseRefs);
    }

    public ReadResponseList callGetRecords(List<? extends BaseRef> refs) throws RemoteException {
        return this.callGetRecords(refs.toArray(new BaseRef[refs.size()]));
    }

    public List<Record> getRecords(BaseRef ... baseRefs) throws RemoteException {
        return Utils.getRecords(this.callGetRecords(baseRefs));
    }

    public List<Record> getRecords(List<? extends BaseRef> refs) throws RemoteException {
        return this.getRecords(refs.toArray(new BaseRef[refs.size()]));
    }

    public synchronized WriteResponse callDeleteRecord(BaseRef deleteRecordReference, @Nullable DeletionReason deletionReason) throws RemoteException {
        return this.getPort().delete(deleteRecordReference, deletionReason);
    }

    public WriteResponse callDeleteRecord(String internalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo) throws RemoteException {
        return this.callDeleteRecord((BaseRef)Utils.createRecordRef(internalId, recordType), this.getDeletionReason(deletionReasonCode, deletionReasonMemo));
    }

    public WriteResponse callDeleteRecord(String internalId, RecordType recordType) throws RemoteException {
        return this.callDeleteRecord((BaseRef)Utils.createRecordRef(internalId, recordType), null);
    }

    public WriteResponse callDeleteRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
        return this.callDeleteRecord((BaseRef)Utils.createRecordRefWithExternalId(externalId, recordType), null);
    }

    public WriteResponse callDeleteRecordByExternalId(String externalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo) throws RemoteException {
        return this.callDeleteRecord((BaseRef)Utils.createRecordRefWithExternalId(externalId, recordType), this.getDeletionReason(deletionReasonCode, deletionReasonMemo));
    }

    public boolean deleteRecord(BaseRef baseRef, @Nullable DeletionReason deletionReason) throws RemoteException {
        return this.callDeleteRecord(baseRef, deletionReason).getStatus().isIsSuccess();
    }

    public boolean deleteRecord(String internalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo) throws RemoteException {
        return this.deleteRecord((BaseRef)Utils.createRecordRef(internalId, recordType), this.getDeletionReason(deletionReasonCode, deletionReasonMemo));
    }

    public boolean deleteRecord(String internalId, RecordType recordType) throws RemoteException {
        return this.deleteRecord((BaseRef)Utils.createRecordRef(internalId, recordType), null);
    }

    public boolean deleteRecordByExternalId(String externalId, RecordType recordType, @Nullable RecordRef deletionReasonCode, @Nullable String deletionReasonMemo) throws RemoteException {
        return this.deleteRecord((BaseRef)Utils.createRecordRefWithExternalId(externalId, recordType), this.getDeletionReason(deletionReasonCode, deletionReasonMemo));
    }

    public boolean deleteRecordByExternalId(String externalId, RecordType recordType) throws RemoteException {
        return this.deleteRecord((BaseRef)Utils.createRecordRefWithExternalId(externalId, recordType), null);
    }

    private DeletionReason getDeletionReason(@Nullable RecordRef deletionReasonCode, @Nullable String deletionMemo) {
        if (deletionReasonCode == null && deletionMemo == null) {
            return null;
        }
        DeletionReason deletionReason = new DeletionReason();
        deletionReason.setDeletionReasonCode(deletionReasonCode);
        deletionReason.setDeletionReasonMemo(deletionMemo);
        return deletionReason;
    }

    public synchronized WriteResponseList callDeleteRecords(@Nullable DeletionReason deletionReason, BaseRef ... baseRefs) throws RemoteException {
        return this.getPort().deleteList(baseRefs, deletionReason);
    }

    public WriteResponseList callDeleteRecords(BaseRef ... baseRefs) throws RemoteException {
        return this.callDeleteRecords((DeletionReason)null, baseRefs);
    }

    public WriteResponseList callDeleteRecords(@Nullable DeletionReason deletionReason, List<? extends BaseRef> baseRefs) throws RemoteException {
        return this.callDeleteRecords(deletionReason, baseRefs.toArray(new BaseRef[baseRefs.size()]));
    }

    public WriteResponseList callDeleteRecords(List<? extends BaseRef> baseRefs) throws RemoteException {
        return this.callDeleteRecords(null, baseRefs);
    }

    public List<Boolean> deleteRecords(@Nullable DeletionReason deletionReason, BaseRef ... baseRefs) throws RemoteException {
        return Utils.getSuccess(this.callDeleteRecords(deletionReason, baseRefs));
    }

    public List<Boolean> deleteRecords(BaseRef ... baseRefs) throws RemoteException {
        return Utils.getSuccess(this.callDeleteRecords(baseRefs));
    }

    public List<Boolean> deleteRecords(@Nullable DeletionReason deletionReason, List<? extends BaseRef> baseRefs) throws RemoteException {
        return this.deleteRecords(deletionReason, baseRefs.toArray(new BaseRef[baseRefs.size()]));
    }

    public List<Boolean> deleteRecords(List<? extends BaseRef> baseRefs) throws RemoteException {
        return this.deleteRecords(null, baseRefs);
    }

    public synchronized GetDeletedResult callGetDeletedRecords(GetDeletedFilter getDeletedFilter, int pageIndex) throws RemoteException {
        return this.getPort().getDeleted(getDeletedFilter, pageIndex);
    }

    public List<DeletedRecord> getDeletedRecords(GetDeletedFilter getDeletedFilter, int pageIndex) throws RemoteException {
        GetDeletedResult getDeletedResult = this.callGetDeletedRecords(getDeletedFilter, pageIndex);
        if (!getDeletedResult.getStatus().isIsSuccess()) {
            return null;
        }
        DeletedRecord[] deletedRecords = getDeletedResult.getDeletedRecordList().getDeletedRecord();
        if (deletedRecords == null || deletedRecords.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(deletedRecords);
    }

    public synchronized GetAllResult callGetAllRecords(GetAllRecordType getAllRecordType) throws RemoteException {
        return this.getPort().getAll(new GetAllRecord(getAllRecordType));
    }

    public List<Record> getAllRecords(GetAllRecordType getAllRecordType) throws RemoteException {
        GetAllResult getAllResult = this.callGetAllRecords(getAllRecordType);
        if (!getAllResult.getStatus().isIsSuccess()) {
            return null;
        }
        Record[] allRecords = getAllResult.getRecordList().getRecord();
        if (allRecords == null || allRecords.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(allRecords);
    }

    public synchronized ReadResponse callInitialize(InitializeRecord initializeRecord) throws RemoteException {
        return this.getPort().initialize(initializeRecord);
    }

    public ReadResponse callInitialize(InitializeRef reference, InitializeType type) throws RemoteException {
        InitializeRecord initializeRecord = new InitializeRecord();
        initializeRecord.setReference(reference);
        initializeRecord.setType(type);
        return this.callInitialize(initializeRecord);
    }

    public Record initialize(InitializeRecord initializeRecord) throws RemoteException {
        return this.callInitialize(initializeRecord).getRecord();
    }

    public Record initialize(InitializeRef reference, InitializeType type) throws RemoteException {
        InitializeRecord initializeRecord = new InitializeRecord();
        initializeRecord.setReference(reference);
        initializeRecord.setType(type);
        return this.initialize(initializeRecord);
    }

    public synchronized ReadResponseList callInitializeList(InitializeRecord ... initializeRecords) throws RemoteException {
        return this.getPort().initializeList(initializeRecords);
    }

    public ReadResponseList callInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
        return this.callInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
    }

    public List<Record> initializeList(InitializeRecord ... initializeRecords) throws RemoteException {
        ReadResponseList readResponseList = this.callInitializeList(initializeRecords);
        ReadResponse[] readResponses = readResponseList.getReadResponse();
        if (readResponses == null) {
            return null;
        }
        return Arrays.stream(readResponses).map(ReadResponse::getRecord).collect(Collectors.toList());
    }

    public List<Record> initializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
        return this.initializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SearchResult callSearch(SearchRecord searchRecord) throws RemoteException {
        SearchResult searchResult;
        WsClient wsClient = this;
        synchronized (wsClient) {
            searchResult = this.getPort().search(searchRecord);
        }
        this.lastSearchJobId = this.getLastJobId();
        return searchResult;
    }

    public List<?> search(SearchRecord searchRecord) throws RemoteException {
        SearchResult searchResult = this.callSearch(searchRecord);
        return Utils.getSearchResults(searchResult);
    }

    public SearchResult callSearchMoreWithId(int pageIndex) throws RemoteException {
        if (this.lastSearchJobId == null) {
            throw new IllegalStateException("Operation search has to be called before calling callSearchMoreWithId");
        }
        return this.callSearchMoreWithId(this.lastSearchJobId, pageIndex);
    }

    public List<?> searchMoreWithId(int pageIndex) throws RemoteException {
        return Utils.getSearchResults(this.callSearchMoreWithId(pageIndex));
    }

    public synchronized SearchResult callSearchMoreWithId(String jobId, int pageIndex) throws RemoteException {
        return this.getPort().searchMoreWithId(jobId, pageIndex);
    }

    public List<?> searchMoreWithId(String jobId, int pageIndex) throws RemoteException {
        return Utils.getSearchResults(this.callSearchMoreWithId(jobId, pageIndex));
    }

    public List<?> searchAll(SearchRecord searchRecord) throws RemoteException {
        SearchResult searchResult = this.callSearch(searchRecord);
        List<?> firstPageResults = Utils.getSearchResults(searchResult);
        if (firstPageResults == null) {
            return null;
        }
        if (firstPageResults.isEmpty()) {
            return firstPageResults;
        }
        ArrayList foundRecords = new ArrayList(searchResult.getTotalRecords());
        foundRecords.addAll(firstPageResults);
        int totalPages = searchResult.getTotalPages();
        String searchId = searchResult.getSearchId();
        for (int pageIndex = 2; pageIndex <= totalPages; ++pageIndex) {
            SearchResult searchMoreResult = this.callSearchMoreWithId(searchId, pageIndex);
            List<?> otherPageResults = Utils.getSearchResults(searchMoreResult);
            if (otherPageResults == null) {
                return null;
            }
            foundRecords.addAll(otherPageResults);
        }
        return foundRecords;
    }

    public synchronized AsyncStatusResult callAsyncAddList(Record ... records) throws RemoteException {
        return this.getPort().asyncAddList(records);
    }

    public AsyncStatusResult callAsyncAddList(List<? extends Record> records) throws RemoteException {
        return this.callAsyncAddList(records.toArray(new Record[records.size()]));
    }

    public String asyncAddList(Record ... records) throws RemoteException {
        return this.callAsyncAddList(records).getJobId();
    }

    public String asyncAddList(List<? extends Record> records) throws RemoteException {
        return this.asyncAddList(records.toArray(new Record[records.size()]));
    }

    public synchronized AsyncStatusResult callAsyncGetList(BaseRef ... refs) throws RemoteException {
        return this.getPort().asyncGetList(refs);
    }

    public AsyncStatusResult callAsyncGetList(List<? extends BaseRef> refs) throws RemoteException {
        return this.callAsyncGetList(refs.toArray(new BaseRef[refs.size()]));
    }

    public String asyncGetList(BaseRef ... refs) throws RemoteException {
        return this.callAsyncGetList(refs).getJobId();
    }

    public String asyncGetList(List<? extends BaseRef> refs) throws RemoteException {
        return this.asyncGetList(refs.toArray(new BaseRef[refs.size()]));
    }

    public synchronized AsyncStatusResult callAsyncUpdateList(Record ... records) throws RemoteException {
        return this.getPort().asyncUpdateList(records);
    }

    public AsyncStatusResult callAsyncUpdateList(List<? extends Record> records) throws RemoteException {
        return this.callAsyncUpdateList(records.toArray(new Record[records.size()]));
    }

    public String asyncUpdateList(Record ... records) throws RemoteException {
        return this.callAsyncUpdateList(records).getJobId();
    }

    public String asyncUpdateList(List<? extends Record> records) throws RemoteException {
        return this.asyncUpdateList(records.toArray(new Record[records.size()]));
    }

    public synchronized AsyncStatusResult callAsyncUpsertList(Record ... records) throws RemoteException {
        return this.getPort().asyncUpsertList(records);
    }

    public AsyncStatusResult callAsyncUpsertList(List<? extends Record> records) throws RemoteException {
        return this.callAsyncUpsertList(records.toArray(new Record[records.size()]));
    }

    public String asyncUpsertList(Record ... records) throws RemoteException {
        return this.callAsyncUpsertList(records).getJobId();
    }

    public String asyncUpsertList(List<? extends Record> records) throws RemoteException {
        return this.asyncUpsertList(records.toArray(new Record[records.size()]));
    }

    public synchronized AsyncStatusResult callAsyncDeleteList(@Nullable DeletionReason deletionReason, BaseRef ... refs) throws RemoteException {
        return this.getPort().asyncDeleteList(refs, deletionReason);
    }

    public AsyncStatusResult callAsyncDeleteList(BaseRef ... refs) throws RemoteException {
        return this.callAsyncDeleteList((DeletionReason)null, refs);
    }

    public AsyncStatusResult callAsyncDeleteList(@Nullable DeletionReason deletionReason, List<? extends BaseRef> refs) throws RemoteException {
        return this.callAsyncDeleteList(deletionReason, refs.toArray(new BaseRef[refs.size()]));
    }

    public AsyncStatusResult callAsyncDeleteList(List<? extends BaseRef> refs) throws RemoteException {
        return this.callAsyncDeleteList(null, refs);
    }

    public String asyncDeleteList(BaseRef ... refs) throws RemoteException {
        return this.callAsyncDeleteList(refs).getJobId();
    }

    public String asyncDeleteList(List<? extends BaseRef> refs) throws RemoteException {
        return this.asyncDeleteList(refs.toArray(new BaseRef[refs.size()]));
    }

    public synchronized AsyncStatusResult callAsyncSearch(SearchRecord searchRecord) throws RemoteException {
        return this.getPort().asyncSearch(searchRecord);
    }

    public String asyncSearch(SearchRecord searchRecord) throws RemoteException {
        return this.callAsyncSearch(searchRecord).getJobId();
    }

    public synchronized AsyncStatusResult callAsyncInitializeList(InitializeRecord ... initializeRecords) throws RemoteException {
        return this.getPort().asyncInitializeList(initializeRecords);
    }

    public AsyncStatusResult callAsyncInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
        return this.callAsyncInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
    }

    public String asyncInitializeList(InitializeRecord ... initializeRecords) throws RemoteException {
        return this.callAsyncInitializeList(initializeRecords).getJobId();
    }

    public String asyncInitializeList(List<? extends InitializeRecord> initializeRecords) throws RemoteException {
        return this.asyncInitializeList(initializeRecords.toArray(new InitializeRecord[initializeRecords.size()]));
    }

    public synchronized AsyncStatusResult callCheckAsyncStatus(String jobId) throws RemoteException {
        return this.getPort().checkAsyncStatus(jobId);
    }

    public AsyncStatusType checkAsyncStatus(String jobId) throws RemoteException {
        return this.callCheckAsyncStatus(jobId).getStatus();
    }

    public synchronized AsyncResult callGetAsyncResult(String jobId, int pageIndex) throws RemoteException {
        return this.getPort().getAsyncResult(jobId, pageIndex);
    }

    public AsyncResult getAsyncResult(String jobId, int pageIndex) throws RemoteException {
        return this.callGetAsyncResult(jobId, pageIndex);
    }

    public synchronized WriteResponse callAttach(AttachReference attachReference) throws RemoteException {
        return this.getPort().attach(attachReference);
    }

    public WriteResponse callAttach(BaseRef attachTo, BaseRef attachedRecord) throws RemoteException {
        AttachBasicReference attachReference = new AttachBasicReference();
        attachReference.setAttachTo(attachTo);
        attachReference.setAttachedRecord(attachedRecord);
        return this.callAttach((AttachReference)attachReference);
    }

    public boolean attach(AttachReference attachReference) throws RemoteException {
        WriteResponse writeResponse = this.callAttach(attachReference);
        return writeResponse.getStatus() != null && writeResponse.getStatus().isIsSuccess();
    }

    public boolean attach(BaseRef attachTo, BaseRef attachedRecord) throws RemoteException {
        AttachBasicReference attachReference = new AttachBasicReference();
        attachReference.setAttachTo(attachTo);
        attachReference.setAttachedRecord(attachedRecord);
        return this.attach((AttachReference)attachReference);
    }

    public synchronized WriteResponse callDetach(DetachReference detachReference) throws RemoteException {
        return this.getPort().detach(detachReference);
    }

    public WriteResponse callDetach(BaseRef detachFrom, BaseRef detachedRecord) throws RemoteException {
        DetachBasicReference detachReference = new DetachBasicReference();
        detachReference.setDetachFrom(detachFrom);
        detachReference.setDetachedRecord(detachedRecord);
        return this.callDetach((DetachReference)detachReference);
    }

    public boolean detach(DetachReference detachReference) throws RemoteException {
        WriteResponse writeResponse = this.callDetach(detachReference);
        return writeResponse.getStatus() != null && writeResponse.getStatus().isIsSuccess();
    }

    public boolean detach(BaseRef detachFrom, BaseRef detachedRecord) throws RemoteException {
        DetachBasicReference detachReference = new DetachBasicReference();
        detachReference.setDetachFrom(detachFrom);
        detachReference.setDetachedRecord(detachedRecord);
        return this.detach((DetachReference)detachReference);
    }

    public WriteResponse callAttachContact(BaseRef attachTo, RecordRef contact, RecordRef contactRole) throws RemoteException {
        AttachContactReference attachContactReference = new AttachContactReference();
        attachContactReference.setAttachTo(attachTo);
        attachContactReference.setContact(contact);
        attachContactReference.setContactRole(contactRole);
        return this.callAttach((AttachReference)attachContactReference);
    }

    public WriteResponse callAttachContact(BaseRef attachTo, RecordRef contact) throws RemoteException {
        return this.callAttachContact(attachTo, contact, null);
    }

    public boolean attachContact(BaseRef attachTo, RecordRef contact, RecordRef contactRole) throws RemoteException {
        WriteResponse writeResponse = this.callAttachContact(attachTo, contact, contactRole);
        return writeResponse.getStatus() != null && writeResponse.getStatus().isIsSuccess();
    }

    public boolean attachContact(BaseRef attachTo, RecordRef contact) throws RemoteException {
        return this.attachContact(attachTo, contact, null);
    }

    public synchronized GetServerTimeResult callGetServerTime() throws RemoteException {
        return this.getPort().getServerTime();
    }

    public Calendar getServerTime() throws RemoteException {
        GetServerTimeResult serverTimeResult = this.callGetServerTime();
        if (serverTimeResult.getStatus().isIsSuccess()) {
            return serverTimeResult.getServerTime();
        }
        return null;
    }

    public synchronized GetDataCenterUrlsResult callGetDataCenterUrls(String companyId) throws RemoteException {
        return this.getPort().getDataCenterUrls(companyId);
    }

    public DataCenterUrls getDataCenterUrls(String companyId) throws RemoteException {
        GetDataCenterUrlsResult dataCenterUrlsResult = this.callGetDataCenterUrls(companyId);
        if (dataCenterUrlsResult.getStatus().isIsSuccess()) {
            return dataCenterUrlsResult.getDataCenterUrls();
        }
        return null;
    }

    public synchronized SessionResponse callChangeEmail(ChangeEmail changeEmail) throws RemoteException {
        return this.getPort().changeEmail(changeEmail);
    }

    public SessionResponse callChangeEmail(String password, String newEmail, boolean justThisAccount) throws RemoteException {
        ChangeEmail changeEmail = new ChangeEmail();
        changeEmail.setCurrentPassword(password);
        changeEmail.setNewEmail(newEmail);
        changeEmail.setNewEmail2(newEmail);
        changeEmail.setJustThisAccount(Boolean.valueOf(justThisAccount));
        return this.callChangeEmail(changeEmail);
    }

    public SessionResponse callChangeEmail(String password, String newEmail) throws RemoteException {
        return this.callChangeEmail(password, newEmail, true);
    }

    private boolean getSuccessFromSessionResponse(SessionResponse sessionResponse) {
        return sessionResponse.getStatus() != null && sessionResponse.getStatus().isIsSuccess();
    }

    public boolean changeEmail(ChangeEmail changeEmail) throws RemoteException {
        return this.getSuccessFromSessionResponse(this.callChangeEmail(changeEmail));
    }

    public boolean changeEmail(String password, String newEmail, boolean justThisAccount) throws RemoteException {
        return this.getSuccessFromSessionResponse(this.callChangeEmail(password, newEmail, justThisAccount));
    }

    public boolean changeEmail(String password, String newEmail) throws RemoteException {
        return this.getSuccessFromSessionResponse(this.callChangeEmail(password, newEmail));
    }

    public synchronized SessionResponse callChangePassword(ChangePassword changePassword) throws RemoteException {
        return this.getPort().changePassword(changePassword);
    }

    public SessionResponse callChangePassword(String currentPassword, String newPassword) throws RemoteException {
        ChangePassword changePassword = new ChangePassword();
        changePassword.setCurrentPassword(currentPassword);
        changePassword.setNewPassword(newPassword);
        changePassword.setNewPassword2(newPassword);
        return this.callChangePassword(changePassword);
    }

    public boolean changePassword(ChangePassword changePassword) throws RemoteException {
        return this.getSuccessFromSessionResponse(this.callChangePassword(changePassword));
    }

    public boolean changePassword(String currentPassword, String newPassword) throws RemoteException {
        return this.getSuccessFromSessionResponse(this.callChangePassword(currentPassword, newPassword));
    }

    public synchronized GetSelectValueResult callGetSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription, int pageIndex) throws RemoteException {
        return this.getPort().getSelectValue(getSelectValueFieldDescription, pageIndex);
    }

    public List<BaseRef> getSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription, int pageIndex) throws RemoteException {
        GetSelectValueResult getSelectValueResult = this.callGetSelectValue(getSelectValueFieldDescription, pageIndex);
        if (getSelectValueResult.getStatus().isIsSuccess()) {
            BaseRefList baseRefList = getSelectValueResult.getBaseRefList();
            if (baseRefList == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(baseRefList.getBaseRef());
        }
        return null;
    }

    public List<BaseRef> getSelectValue(GetSelectValueFieldDescription getSelectValueFieldDescription) throws RemoteException {
        ArrayList<BaseRef> allValues = new ArrayList<BaseRef>();
        int totalPages = 1;
        int currentPage = 0;
        while (++currentPage <= totalPages) {
            GetSelectValueResult getSelectValueResult = this.callGetSelectValue(getSelectValueFieldDescription, currentPage);
            if (getSelectValueResult.getStatus() != null && getSelectValueResult.getStatus().isIsSuccess()) {
                totalPages = getSelectValueResult.getTotalPages();
                BaseRefList baseRefList = getSelectValueResult.getBaseRefList();
                if (baseRefList == null) continue;
                allValues.addAll(Arrays.asList(baseRefList.getBaseRef()));
                continue;
            }
            return null;
        }
        return allValues;
    }

    public synchronized GetBudgetExchangeRateResult callGetBudgetExchangeRate(BudgetExchangeRateFilter budgetExchangeRateFilter) throws RemoteException {
        return this.getPort().getBudgetExchangeRate(budgetExchangeRateFilter);
    }

    public List<BudgetExchangeRate> getBudgetExchangeRate(RecordRef period, RecordRef fromSubsidiary, RecordRef toSubsidiary) throws RemoteException {
        BudgetExchangeRateFilter budgetExchangeRateFilter = new BudgetExchangeRateFilter();
        budgetExchangeRateFilter.setPeriod(period);
        budgetExchangeRateFilter.setFromSubsidiary(fromSubsidiary);
        budgetExchangeRateFilter.setToSubsidiary(toSubsidiary);
        GetBudgetExchangeRateResult getBudgetExchangeRateResult = this.callGetBudgetExchangeRate(budgetExchangeRateFilter);
        if (getBudgetExchangeRateResult.getStatus() != null && getBudgetExchangeRateResult.getStatus().isIsSuccess()) {
            BudgetExchangeRateList budgetExchangeRateList = getBudgetExchangeRateResult.getBudgetExchangeRateList();
            if (budgetExchangeRateList == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(budgetExchangeRateList.getBudgetExchangeRate());
        }
        return null;
    }

    public synchronized GetCurrencyRateResult callGetCurrencyRate(CurrencyRateFilter currencyRateFilter) throws RemoteException {
        return this.getPort().getCurrencyRate(currencyRateFilter);
    }

    public List<CurrencyRate> getCurrencyRate(RecordRef baseCurrency, RecordRef fromCurrency, Calendar effectiveDate) throws RemoteException {
        CurrencyRateFilter currencyRateFilter = new CurrencyRateFilter();
        currencyRateFilter.setBaseCurrency(baseCurrency);
        currencyRateFilter.setFromCurrency(fromCurrency);
        currencyRateFilter.setEffectiveDate(effectiveDate);
        GetCurrencyRateResult currencyRateResult = this.callGetCurrencyRate(currencyRateFilter);
        if (currencyRateResult.getStatus() != null && currencyRateResult.getStatus().isIsSuccess()) {
            CurrencyRateList currencyRateList = currencyRateResult.getCurrencyRateList();
            if (currencyRateList == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(currencyRateList.getCurrencyRate());
        }
        return null;
    }

    public synchronized GetCustomizationIdResult callGetCustomizationId(CustomizationType customizationType, boolean includeInactives) throws RemoteException {
        return this.getPort().getCustomizationId(customizationType, includeInactives);
    }

    public List<CustomizationRef> getCustomizationId(GetCustomizationType customizationType, boolean includeInactives) throws RemoteException {
        GetCustomizationIdResult customizationIdResult = this.callGetCustomizationId(new CustomizationType(customizationType), includeInactives);
        if (customizationIdResult.getStatus() != null && customizationIdResult.getStatus().isIsSuccess()) {
            CustomizationRefList customizationRefList = customizationIdResult.getCustomizationRefList();
            if (customizationRefList == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(customizationRefList.getCustomizationRef());
        }
        return null;
    }

    public synchronized GetItemAvailabilityResult callGetItemAvailability(ItemAvailabilityFilter itemAvailabilityFilter) throws RemoteException {
        return this.getPort().getItemAvailability(itemAvailabilityFilter);
    }

    public List<ItemAvailability> getItemAvailability(Calendar lastQtyAvailableChange, RecordRef ... itemsReferences) throws RemoteException {
        ItemAvailabilityFilter itemAvailabilityFilter = new ItemAvailabilityFilter();
        itemAvailabilityFilter.setItem(new RecordRefList(itemsReferences));
        itemAvailabilityFilter.setLastQtyAvailableChange(lastQtyAvailableChange);
        GetItemAvailabilityResult getItemAvailabilityResult = this.callGetItemAvailability(itemAvailabilityFilter);
        if (getItemAvailabilityResult.getStatus() != null && getItemAvailabilityResult.getStatus().isIsSuccess()) {
            ItemAvailabilityList itemAvailabilityList = getItemAvailabilityResult.getItemAvailabilityList();
            if (itemAvailabilityList == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(itemAvailabilityList.getItemAvailability());
        }
        return null;
    }

    public synchronized GetPostingTransactionSummaryResult callGetPostingTransactionSummary(PostingTransactionSummaryField postingTransactionSummaryField, PostingTransactionSummaryFilter postingTransactionSummaryFilter, int pageIndex, @Nullable String operationId) throws RemoteException {
        return this.getPort().getPostingTransactionSummary(postingTransactionSummaryField, postingTransactionSummaryFilter, pageIndex, operationId);
    }

    public GetPostingTransactionSummaryResult getPostingTransactionSummary(PostingTransactionSummaryField postingTransactionSummaryField, PostingTransactionSummaryFilter postingTransactionSummaryFilter, int pageIndex) throws RemoteException {
        GetPostingTransactionSummaryResult postingTransactionSummaryResult = this.callGetPostingTransactionSummary(postingTransactionSummaryField, postingTransactionSummaryFilter, pageIndex, pageIndex == 1 ? null : this.lastGetPostingTransactionSummaryJobId);
        if (pageIndex == 1) {
            this.lastGetPostingTransactionSummaryJobId = this.getLastJobId();
        }
        return postingTransactionSummaryResult;
    }

    public synchronized GetSavedSearchResult callGetSavedSearch(GetSavedSearchRecord searchRecordType) throws RemoteException {
        return this.getPort().getSavedSearch(searchRecordType);
    }

    public List<RecordRef> getSavedSearch(SearchRecordType searchRecordType) throws RemoteException {
        GetSavedSearchRecord getSavedSearchRecord = new GetSavedSearchRecord();
        getSavedSearchRecord.setSearchType(searchRecordType);
        GetSavedSearchResult getSavedSearchResult = this.callGetSavedSearch(getSavedSearchRecord);
        if (getSavedSearchResult.getStatus() != null && getSavedSearchResult.getStatus().isIsSuccess()) {
            RecordRefList recordRefList = getSavedSearchResult.getRecordRefList();
            if (recordRefList == null || recordRefList.getRecordRef() == null) {
                return Collections.emptyList();
            }
            return Arrays.asList(recordRefList.getRecordRef());
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public WriteResponse callUpdateInviteeStatus(String eventInternalId, CalendarEventAttendeeResponse response) throws RemoteException {
        UpdateInviteeStatusReference updateInviteeStatusReference = new UpdateInviteeStatusReference();
        updateInviteeStatusReference.setEventId(Utils.createRecordRef(eventInternalId));
        updateInviteeStatusReference.setResponseCode(response);
        WsClient wsClient = this;
        synchronized (wsClient) {
            return this.getPort().updateInviteeStatus(updateInviteeStatusReference);
        }
    }

    public RecordRef updateInviteeStatus(String eventInternalId, CalendarEventAttendeeResponse response) throws RemoteException {
        WriteResponse writeResponse = this.callUpdateInviteeStatus(eventInternalId, response);
        if (writeResponse.getStatus() != null && writeResponse.getStatus().isIsSuccess()) {
            return (RecordRef)writeResponse.getBaseRef();
        }
        return null;
    }

    public synchronized WriteResponseList callUpdateInviteeStatusList(UpdateInviteeStatusReference ... updateInviteeStatusReferences) throws RemoteException {
        return this.getPort().updateInviteeStatusList(updateInviteeStatusReferences);
    }

    public WriteResponseList callUpdateInviteeStatusList(List<UpdateInviteeStatusReference> updateInviteeStatusReferences) throws RemoteException {
        return this.callUpdateInviteeStatusList(updateInviteeStatusReferences.toArray(new UpdateInviteeStatusReference[updateInviteeStatusReferences.size()]));
    }

    public List<RecordRef> updateInviteeStatusList(UpdateInviteeStatusReference ... updateInviteeStatusReferences) throws RemoteException {
        WriteResponseList writeResponseList = this.callUpdateInviteeStatusList(updateInviteeStatusReferences);
        return this.getUpdatedEventsFromResponseList(writeResponseList);
    }

    public List<RecordRef> updateInviteeStatusList(List<UpdateInviteeStatusReference> updateInviteeStatusReferences) throws RemoteException {
        return this.updateInviteeStatusList(updateInviteeStatusReferences.toArray(new UpdateInviteeStatusReference[updateInviteeStatusReferences.size()]));
    }

    public WriteResponseList callUpdateInviteeStatusList(Map<String, CalendarEventAttendeeResponse> statusUpdates) throws RemoteException {
        return this.callUpdateInviteeStatusList((UpdateInviteeStatusReference[])statusUpdates.entrySet().stream().map(entry -> {
            UpdateInviteeStatusReference updateInviteeStatusReference = new UpdateInviteeStatusReference();
            updateInviteeStatusReference.setEventId(Utils.createRecordRef((String)entry.getKey()));
            updateInviteeStatusReference.setResponseCode((CalendarEventAttendeeResponse)entry.getValue());
            return updateInviteeStatusReference;
        }).toArray(UpdateInviteeStatusReference[]::new));
    }

    public List<RecordRef> updateInviteeStatusList(Map<String, CalendarEventAttendeeResponse> statusUpdates) throws RemoteException {
        WriteResponseList writeResponseList = this.callUpdateInviteeStatusList(statusUpdates);
        return this.getUpdatedEventsFromResponseList(writeResponseList);
    }

    private List<RecordRef> getUpdatedEventsFromResponseList(WriteResponseList writeResponseList) {
        return Arrays.stream(writeResponseList.getWriteResponse()).map(writeResponse -> writeResponse.getStatus().isIsSuccess() ? (RecordRef)writeResponse.getBaseRef() : null).collect(Collectors.toList());
    }

    public SOAPEnvelope sendSoapMessage(String soapAction, String soapMessage, Charset soapMessageEncoding) {
        try {
            MimeHeaders httpHeaders = new MimeHeaders();
            SOAPMessage message = new MessageFactoryImpl().createMessage((javax.xml.soap.MimeHeaders)httpHeaders, (InputStream)new ByteArrayInputStream(soapMessage.getBytes(soapMessageEncoding)));
            Call call = (Call)this.getLocator().createCall();
            call.setTargetEndpointAddress(this.getEndpointUrl());
            call.setSOAPActionURI(soapAction);
            return call.invoke((Message)message);
        }
        catch (IOException | ServiceException | SOAPException e) {
            throw new RuntimeException(e);
        }
    }

    public SOAPEnvelope sendSoapMessage(String soapAction, String soapMessage) {
        return this.sendSoapMessage(soapAction, soapMessage, Charset.forName("UTF-8"));
    }

    public SOAPEnvelope sendSoapMessage(String soapMessage) {
        String soapAction = null;
        try {
            XPath xPath = XPathFactory.newInstance().newXPath();
            soapAction = ((Node)xPath.evaluate("/*[local-name()='Envelope']/*[local-name()='Body']/*[1]", new InputSource(new StringReader(soapMessage)), XPathConstants.NODE)).getLocalName();
            if (CommonUtils.isEmptyString((String)soapAction)) {
                throw new IllegalStateException("SOAPAction cannot be determined from provided soapMessage. Please check if Body element contains the correct child element.");
            }
        }
        catch (XPathExpressionException e) {
            e.printStackTrace();
        }
        return this.sendSoapMessage(soapAction, soapMessage);
    }
}

