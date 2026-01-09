/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

import com.netsuite.suitetalk.client.common.authentication.OAuthPassport;
import com.netsuite.suitetalk.client.common.authentication.Passport;
import com.netsuite.suitetalk.client.common.authentication.SsoPassport;
import com.netsuite.suitetalk.client.common.authentication.TokenPassport;

public interface Authentication {
    public Passport getPassport();

    public void setPassport(Passport var1);

    public void unsetPassport();

    public void setRequestLevelCredentials(boolean var1);

    default public SsoPassport getSsoPassport() {
        return null;
    }

    default public void setSsoPassport(SsoPassport ssoPassport) {
    }

    default public void unsetSsoPassport() {
    }

    public TokenPassport getTokenPassport();

    public void setTokenPassport(TokenPassport var1);

    public void unsetTokenPassport();

    public OAuthPassport getOAuthPassport();

    public void setOAuthPassport(OAuthPassport var1);

    public void unsetOAuthPassport();
}

