/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.netsuite.suitetalk.client.common.authentication.TokenPassport
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchResult
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassport
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassportSignature
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.RecordType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList
 */
package com.netsuite.suitetalk.client.v2022_1.utils;

import com.netsuite.suitetalk.client.common.authentication.TokenPassport;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassportSignature;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.RecordType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class Utils {
    private Utils() {
    }

    public static com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassport convertTokenPassport(TokenPassport tokenPassport) {
        com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassport endpointTokenPassport = new com.netsuite.suitetalk.proxy.v2022_1.platform.core.TokenPassport();
        endpointTokenPassport.setAccount(tokenPassport.getAccount());
        endpointTokenPassport.setConsumerKey(tokenPassport.getConsumerKey());
        endpointTokenPassport.setToken(tokenPassport.getToken());
        endpointTokenPassport.setNonce(tokenPassport.getNonce());
        endpointTokenPassport.setTimestamp(tokenPassport.getTimestamp());
        TokenPassportSignature signature = new TokenPassportSignature();
        signature.setAlgorithm(tokenPassport.getSignatureAlgorithm().getNetSuiteFormat());
        signature.set_value(tokenPassport.getSignature());
        endpointTokenPassport.setSignature(signature);
        return endpointTokenPassport;
    }

    public static RecordRef createRecordRef(String internalId) {
        RecordRef recordRef = new RecordRef();
        recordRef.setInternalId(internalId);
        return recordRef;
    }

    public static RecordRef createRecordRef(String internalId, RecordType recordType) {
        RecordRef recordRef = Utils.createRecordRef(internalId);
        recordRef.setType(recordType);
        return recordRef;
    }

    public static RecordRef createRecordRefWithExternalId(String externalId, RecordType recordType) {
        RecordRef recordRef = new RecordRef();
        recordRef.setExternalId(externalId);
        recordRef.setType(recordType);
        return recordRef;
    }

    public static String getInternalId(BaseRef baseRef) {
        try {
            Method getInternalIdMethod = baseRef.getClass().getMethod("getInternalId", new Class[0]);
            return (String)getInternalIdMethod.invoke((Object)baseRef, new Object[0]);
        }
        catch (NoSuchMethodException e) {
            throw new UnsupportedOperationException("Cannot call getInternalId() on " + baseRef.getClass().getName());
        }
        catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalStateException(e);
        }
    }

    public static List<String> getInternalIds(WriteResponseList writeResponseList) {
        return Arrays.stream(writeResponseList.getWriteResponse()).map(writeResponse -> {
            if (writeResponse == null || !writeResponse.getStatus().isIsSuccess()) {
                return null;
            }
            return Utils.getInternalId(writeResponse.getBaseRef());
        }).collect(Collectors.toList());
    }

    public static List<Boolean> getSuccess(WriteResponseList writeResponseList) {
        return Arrays.stream(writeResponseList.getWriteResponse()).map(writeResponse -> writeResponse != null && writeResponse.getStatus().isIsSuccess()).collect(Collectors.toList());
    }

    public static List<Record> getRecords(ReadResponseList readResponseList) {
        return Arrays.stream(readResponseList.getReadResponse()).map(readResponse -> readResponse == null ? null : readResponse.getRecord()).collect(Collectors.toList());
    }

    public static List<?> getSearchResults(SearchResult searchResult) {
        if (searchResult == null || searchResult.getStatus() == null || !searchResult.getStatus().isIsSuccess()) {
            return null;
        }
        if (searchResult.getTotalRecords() == 0) {
            return Collections.emptyList();
        }
        RecordList recordList = searchResult.getRecordList();
        SearchRowList searchRowList = searchResult.getSearchRowList();
        if (recordList == null && searchRowList == null) {
            return null;
        }
        return Arrays.asList(searchRowList != null ? searchRowList.getSearchRow() : recordList.getRecord());
    }
}

