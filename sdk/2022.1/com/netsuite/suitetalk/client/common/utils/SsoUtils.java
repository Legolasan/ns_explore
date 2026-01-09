/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.ParametersAreNonnullByDefault
 *  org.bouncycastle.jce.provider.BouncyCastleProvider
 */
package com.netsuite.suitetalk.client.common.utils;

import com.netsuite.suitetalk.client.common.utils.CommonUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ParametersAreNonnullByDefault
public final class SsoUtils {
    private static final BouncyCastleProvider BOUNCY_CASTLE_PROVIDER = new BouncyCastleProvider();

    private SsoUtils() {
    }

    public static byte[] getToken(String partnerAccount, String partnerUserId, String encryptionKeyFilePath) {
        try {
            return SsoUtils.encrypt(Files.readAllBytes(Paths.get(encryptionKeyFilePath, new String[0])), SsoUtils.getToken(partnerAccount, partnerUserId));
        }
        catch (IOException e) {
            throw new IllegalArgumentException("File " + encryptionKeyFilePath + " cannot be read", e);
        }
    }

    public static byte[] getToken(String partnerAccount, String partnerUserId) {
        return CommonUtils.concatenateStrings(" ", partnerAccount, partnerUserId, String.valueOf(System.currentTimeMillis())).getBytes();
    }

    public static String getTokenAsString(String partnerAccount, String partnerUserId, String encryptionKeyFilePath) {
        return CommonUtils.bytesToHexString(SsoUtils.getToken(partnerAccount, partnerUserId, encryptionKeyFilePath));
    }

    public static String getTokenAsString(String partnerAccount, String partnerUserId) {
        return CommonUtils.bytesToHexString(SsoUtils.getToken(partnerAccount, partnerUserId));
    }

    public static byte[] encrypt(byte[] privateKey, byte[] data) {
        try {
            Signature signature = Signature.getInstance("NONEwithRSA");
            signature.initSign(SsoUtils.getPrivateKey(privateKey));
            signature.update(data);
            return signature.sign();
        }
        catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new IllegalStateException("Signing data with private key was not successful", e);
        }
    }

    public static PrivateKey getPrivateKey(byte[] privateKey) {
        if (Security.getProvider(BOUNCY_CASTLE_PROVIDER.getName()) == null) {
            Security.addProvider((Provider)BOUNCY_CASTLE_PROVIDER);
        }
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKey);
            return keyFactory.generatePrivate(privateKeySpec);
        }
        catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new IllegalStateException("Private key generation failed", e);
        }
    }
}

