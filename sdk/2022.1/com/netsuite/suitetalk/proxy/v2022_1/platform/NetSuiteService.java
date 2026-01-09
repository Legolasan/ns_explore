/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.Service
 *  javax.xml.rpc.ServiceException
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform;

import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuitePortType;
import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface NetSuiteService
extends Service {
    public String getNetSuitePortAddress();

    public NetSuitePortType getNetSuitePort() throws ServiceException;

    public NetSuitePortType getNetSuitePort(URL var1) throws ServiceException;
}

