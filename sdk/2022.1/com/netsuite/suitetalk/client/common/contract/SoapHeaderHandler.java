/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.xml.soap.SOAPHeaderElement
 */
package com.netsuite.suitetalk.client.common.contract;

import javax.xml.soap.SOAPHeaderElement;

public interface SoapHeaderHandler {
    public void addSoapHeader(String var1, String var2, Object var3);

    public SOAPHeaderElement getSoapHeader(String var1, String var2);

    public void removeSoapHeader(String var1, String var2);

    public boolean isSoapHeaderSet(String var1, String var2);
}

