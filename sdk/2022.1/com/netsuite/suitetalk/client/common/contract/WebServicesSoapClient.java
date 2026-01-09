/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

import com.netsuite.suitetalk.client.common.contract.Authentication;
import com.netsuite.suitetalk.client.common.contract.EndpointInfo;
import com.netsuite.suitetalk.client.common.contract.HttpHeaderHandler;
import com.netsuite.suitetalk.client.common.contract.Integration;
import com.netsuite.suitetalk.client.common.contract.Preferences;
import com.netsuite.suitetalk.client.common.contract.SearchPreferences;
import com.netsuite.suitetalk.client.common.contract.SoapHeaderHandler;

public interface WebServicesSoapClient
extends Authentication,
EndpointInfo,
Preferences,
SearchPreferences,
Integration,
SoapHeaderHandler,
HttpHeaderHandler {
}

