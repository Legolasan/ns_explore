/*
 * Decompiled with CFR 0.152.
 */
package com.netsuite.suitetalk.client.common.contract;

import com.netsuite.suitetalk.client.common.authentication.Passport;
import com.netsuite.suitetalk.client.common.authentication.SsoPassport;
import java.rmi.RemoteException;

public interface RemoteSoapOperations {
    public Object callLogin() throws RemoteException;

    public Object callLogout() throws RemoteException;

    public Object callMapSso(Passport var1, SsoPassport var2) throws RemoteException;

    public Object callSsoLogin(SsoPassport var1) throws RemoteException;
}

