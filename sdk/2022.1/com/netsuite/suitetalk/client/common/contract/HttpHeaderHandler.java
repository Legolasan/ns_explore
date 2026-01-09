/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

public interface HttpHeaderHandler {
    public void setHttpHeader(String var1, String var2);

    public void unsetHttpHeader(String var1);

    public boolean isHttpHeaderSet(String var1);
}

