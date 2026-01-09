/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AsyncStatusResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.AttachReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BudgetExchangeRateFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangeEmail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ChangePassword;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRateFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DeletionReason;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAccountGovernanceInfoResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetAllResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetBudgetExchangeRateResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCurrencyRateResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetCustomizationIdResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDataCenterUrlsResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetDeletedResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetIntegrationGovernanceInfoResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetItemAvailabilityResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetPostingTransactionSummaryResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSavedSearchResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueFieldDescription;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetServerTimeResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.ItemAvailabilityFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.PostingTransactionSummaryFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.UpdateInviteeStatusReference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.AsyncFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.ExceededConcurrentRequestLimitFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.ExceededRecordCountFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.ExceededRequestLimitFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.ExceededRequestSizeFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.ExceededUsageLimitFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.InsufficientPermissionFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.InvalidAccountFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.InvalidCredentialsFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.InvalidSessionFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.InvalidVersionFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.UnexpectedErrorFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.AsyncResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.SessionResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponse;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NetSuitePortType
extends Remote {
    public SessionResponse changePassword(ChangePassword var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public SessionResponse changeEmail(ChangeEmail var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, InvalidAccountFault, InvalidVersionFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse add(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse delete(BaseRef var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public SearchResult search(SearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public SearchResult searchMoreWithId(String var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse update(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse upsert(Record var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponseList addList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponseList deleteList(BaseRef[] var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponseList updateList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponseList upsertList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public ReadResponse get(BaseRef var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public ReadResponseList getList(BaseRef[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetAllResult getAll(GetAllRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetSavedSearchResult getSavedSearch(GetSavedSearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetCustomizationIdResult getCustomizationId(CustomizationType var1, boolean var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public ReadResponse initialize(InitializeRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public ReadResponseList initializeList(InitializeRecord[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetSelectValueResult getSelectValue(GetSelectValueFieldDescription var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetItemAvailabilityResult getItemAvailability(ItemAvailabilityFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetBudgetExchangeRateResult getBudgetExchangeRate(BudgetExchangeRateFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetCurrencyRateResult getCurrencyRate(CurrencyRateFilter var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetDataCenterUrlsResult getDataCenterUrls(String var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededRequestSizeFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetPostingTransactionSummaryResult getPostingTransactionSummary(PostingTransactionSummaryField var1, PostingTransactionSummaryFilter var2, int var3, String var4) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetServerTimeResult getServerTime() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse attach(AttachReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse detach(DetachReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponse updateInviteeStatus(UpdateInviteeStatusReference var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public WriteResponseList updateInviteeStatusList(UpdateInviteeStatusReference[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncAddList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncUpdateList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncUpsertList(Record[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncDeleteList(BaseRef[] var1, DeletionReason var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncGetList(BaseRef[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncInitializeList(InitializeRecord[] var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult asyncSearch(SearchRecord var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncResult getAsyncResult(String var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public AsyncStatusResult checkAsyncStatus(String var1) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, AsyncFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetDeletedResult getDeleted(GetDeletedFilter var1, int var2) throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRecordCountFault, ExceededRequestSizeFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetAccountGovernanceInfoResult getAccountGovernanceInfo() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;

    public GetIntegrationGovernanceInfoResult getIntegrationGovernanceInfo() throws RemoteException, InsufficientPermissionFault, InvalidCredentialsFault, ExceededConcurrentRequestLimitFault, ExceededRequestLimitFault, ExceededUsageLimitFault, UnexpectedErrorFault, InvalidSessionFault;
}

