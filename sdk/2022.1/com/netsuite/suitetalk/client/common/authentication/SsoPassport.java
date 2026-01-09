/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.ParametersAreNonnullByDefault
 */
package com.netsuite.suitetalk.client.common.authentication;

import com.netsuite.suitetalk.client.common.utils.SsoUtils;
import java.io.File;
import javax.annotation.ParametersAreNonnullByDefault;

public class SsoPassport {
    private String authenticationToken;
    private String partnerId;
    private String partnerAccount;
    private String partnerUserId;
    private File encryptionKeyFile;
    private boolean calculatedAuthenticationToken;

    public SsoPassport() {
    }

    @ParametersAreNonnullByDefault
    public SsoPassport(String authenticationToken, String partnerId, String partnerAccount, String partnerUserId) {
        this.authenticationToken = authenticationToken;
        this.partnerId = partnerId;
        this.partnerAccount = partnerAccount;
        this.partnerUserId = partnerUserId;
        this.calculatedAuthenticationToken = false;
    }

    @ParametersAreNonnullByDefault
    public SsoPassport(String partnerId, String partnerAccount, String partnerUserId) {
        this.partnerId = partnerId;
        this.partnerAccount = partnerAccount;
        this.partnerUserId = partnerUserId;
        this.calculatedAuthenticationToken = true;
    }

    @ParametersAreNonnullByDefault
    public SsoPassport(String partnerId, String partnerAccount, String partnerUserId, File encryptionKeyFile) {
        this(partnerId, partnerAccount, partnerUserId);
        this.encryptionKeyFile = encryptionKeyFile;
    }

    public String getAuthenticationToken() {
        if (this.isAuthenticationTokenCalculated()) {
            if (this.encryptionKeyFile != null) {
                return SsoUtils.getTokenAsString(this.partnerAccount, this.partnerUserId, this.encryptionKeyFile.getAbsolutePath());
            }
            return SsoUtils.getTokenAsString(this.partnerAccount, this.partnerUserId);
        }
        return this.authenticationToken;
    }

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerAccount() {
        return this.partnerAccount;
    }

    public void setPartnerAccount(String partnerAccount) {
        this.partnerAccount = partnerAccount;
    }

    public String getPartnerUserId() {
        return this.partnerUserId;
    }

    public void setPartnerUserId(String partnerUserId) {
        this.partnerUserId = partnerUserId;
    }

    public File getEncryptionKeyFile() {
        return this.encryptionKeyFile;
    }

    public void setEncryptionKeyFile(File encryptionKeyFile) {
        this.encryptionKeyFile = encryptionKeyFile;
    }

    public boolean isAuthenticationTokenCalculated() {
        return this.calculatedAuthenticationToken;
    }

    public void setAuthenticationTokenCalculated(boolean calculatedAuthenticationToken) {
        this.calculatedAuthenticationToken = calculatedAuthenticationToken;
    }
}

