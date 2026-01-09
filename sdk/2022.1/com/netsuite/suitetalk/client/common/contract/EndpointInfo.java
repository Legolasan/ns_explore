/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

import com.netsuite.suitetalk.client.common.EndpointVersion;
import java.net.URL;

public interface EndpointInfo {
    public URL getEndpointUrl();

    public EndpointVersion getEndpointVersion();

    public String getMessagesUrn();
}

