/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.netsuite.suitetalk.client.common.Constants
 *  com.netsuite.suitetalk.client.common.EndpointVersion
 *  com.netsuite.suitetalk.client.common.authentication.OAuthPassport
 *  com.netsuite.suitetalk.client.common.authentication.Passport
 *  com.netsuite.suitetalk.client.common.authentication.TokenPassport
 *  com.netsuite.suitetalk.client.common.contract.Authentication
 *  com.netsuite.suitetalk.client.common.contract.EndpointInfo
 *  com.netsuite.suitetalk.client.common.contract.HttpHeaderHandler
 *  com.netsuite.suitetalk.client.common.contract.SoapHeaderHandler
 *  com.netsuite.suitetalk.client.common.utils.CommonUtils
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuitePortType
 *  com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuiteServiceLocator
 *  javax.annotation.Nullable
 *  javax.annotation.ParametersAreNonnullByDefault
 *  javax.xml.rpc.ServiceException
 *  javax.xml.soap.MimeHeader
 *  javax.xml.soap.MimeHeaders
 *  javax.xml.soap.SOAPElement
 *  javax.xml.soap.SOAPException
 *  javax.xml.soap.SOAPHeader
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.Handler
 *  org.apache.axis.Message
 *  org.apache.axis.MessageContext
 *  org.apache.axis.SimpleTargetedChain
 *  org.apache.axis.client.Stub
 *  org.apache.axis.configuration.SimpleProvider
 *  org.apache.axis.message.SOAPHeaderElement
 *  org.apache.axis.transport.http.CommonsHTTPSender
 *  org.apache.axis.transport.http.HTTPConstants
 *  org.apache.commons.httpclient.HttpVersion
 *  org.apache.log4j.Logger
 */
package com.netsuite.suitetalk.client.v2022_1;

import com.netsuite.suitetalk.client.common.Constants;
import com.netsuite.suitetalk.client.common.EndpointVersion;
import com.netsuite.suitetalk.client.common.authentication.OAuthPassport;
import com.netsuite.suitetalk.client.common.authentication.Passport;
import com.netsuite.suitetalk.client.common.authentication.TokenPassport;
import com.netsuite.suitetalk.client.common.contract.Authentication;
import com.netsuite.suitetalk.client.common.contract.EndpointInfo;
import com.netsuite.suitetalk.client.common.contract.HttpHeaderHandler;
import com.netsuite.suitetalk.client.common.contract.SoapHeaderHandler;
import com.netsuite.suitetalk.client.common.utils.CommonUtils;
import com.netsuite.suitetalk.client.v2022_1.utils.Utils;
import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuitePortType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuiteServiceLocator;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.MimeHeader;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.Handler;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.SimpleTargetedChain;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.message.SOAPHeaderElement;
import org.apache.axis.transport.http.CommonsHTTPSender;
import org.apache.axis.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.log4j.Logger;

@ParametersAreNonnullByDefault
public class WsCoreClient
implements Authentication,
EndpointInfo,
SoapHeaderHandler,
HttpHeaderHandler {
    private static final Logger LOG = Logger.getLogger(WsCoreClient.class);
    private final NetSuitePortType port;
    private final NetSuiteServiceLocator locator;
    private final URL endpointUrl;
    private final EndpointVersion endpointVersion;
    private final String messagesUrn;
    protected final List<MimeHeader> requestHttpHeaders = new ArrayList<MimeHeader>();
    private final List<MimeHeader> responseHttpHeaders = new ArrayList<MimeHeader>();
    private HttpVersion httpProtocolVersion = HttpVersion.HTTP_1_1;
    private TokenPassport tokenPassport;
    private OAuthPassport oAuthPassport;

    public WsCoreClient(URL endpointUrl) {
        SimpleProvider engineConfiguration = new SimpleProvider();
        engineConfiguration.deployTransport("http", (Handler)new SimpleTargetedChain((Handler)new RequestHandler(), (Handler)new CommonsHTTPSender(), (Handler)new ResponseHandler()));
        this.locator = new NetSuiteServiceLocator((EngineConfiguration)engineConfiguration);
        String serviceName = this.locator.getNetSuitePortAddress().split("/services/")[1];
        String endpointVersionAsString = serviceName.substring("NetSuitePort_".length());
        this.endpointVersion = new EndpointVersion(endpointVersionAsString);
        this.messagesUrn = CommonUtils.getMessagesUrn((EndpointVersion)this.endpointVersion);
        String query = endpointUrl.getQuery() == null ? "" : '?' + endpointUrl.getQuery();
        try {
            this.endpointUrl = new URL(endpointUrl, "/services/" + serviceName + query);
            this.port = this.locator.getNetSuitePort(this.endpointUrl);
            Stub stub = (Stub)this.port;
            stub.setTimeout(Constants.DEFAULT_HTTP_SOCKET_TIMEOUT);
            stub.setMaintainSession(true);
        }
        catch (MalformedURLException | ServiceException e) {
            throw new RuntimeException(e);
        }
    }

    public NetSuitePortType getPort() {
        return this.port;
    }

    protected Stub getStub() {
        return (Stub)this.getPort();
    }

    protected NetSuiteServiceLocator getLocator() {
        return this.locator;
    }

    public URL getEndpointUrl() {
        return this.endpointUrl;
    }

    public EndpointVersion getEndpointVersion() {
        return this.endpointVersion;
    }

    public String getMessagesUrn() {
        return this.messagesUrn;
    }

    public HttpVersion getHttpProtocolVersion() {
        return this.httpProtocolVersion;
    }

    public void setHttpProtocolVersion(HttpVersion httpProtocolVersion) {
        this.httpProtocolVersion = httpProtocolVersion;
    }

    public void setHttpHeader(String name, String value) {
        this.requestHttpHeaders.add(new MimeHeader(name, value));
    }

    public void unsetHttpHeader(String name) {
        this.requestHttpHeaders.removeAll(this.requestHttpHeaders.stream().filter(header -> header.getName().equals(name)).collect(Collectors.toList()));
    }

    public boolean isHttpHeaderSet(String name) {
        for (MimeHeader header : this.requestHttpHeaders) {
            if (!header.getName().equals(name)) continue;
            return true;
        }
        return false;
    }

    public List<MimeHeader> getHttpHeaders() {
        return Collections.unmodifiableList(this.requestHttpHeaders);
    }

    public void clearHttpHeaders() {
        this.requestHttpHeaders.clear();
    }

    public List<MimeHeader> getResponseHttpHeaders() {
        return Collections.unmodifiableList(this.responseHttpHeaders);
    }

    public List<String> getResponseHttpHeader(String name) {
        return this.getResponseHttpHeaders().stream().filter(header -> header.getName().equals(name)).map(MimeHeader::getValue).collect(Collectors.toList());
    }

    public SOAPHeaderElement getSoapHeader(String namespace, String headerName) {
        return this.getStub().getHeader(namespace, headerName);
    }

    public synchronized void addSoapHeader(@Nullable String namespace, String headerName, Object value) {
        this.getStub().setHeader(namespace == null ? "" : namespace, headerName, value);
    }

    public void addSoapHeader(String headerName, Object value) {
        this.addSoapHeader(this.getMessagesUrn(), headerName, value);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void removeSoapHeader(@Nullable String namespace, String headerName) {
        String headerNamespace;
        if (CommonUtils.isEmptyString((String)headerName)) {
            return;
        }
        String string = headerNamespace = namespace == null ? "" : namespace;
        if (!this.isSoapHeaderSet(headerNamespace, headerName)) {
            return;
        }
        Stub stub = this.getStub();
        SOAPHeaderElement[] headers = stub.getHeaders();
        List<SOAPHeaderElement> remainingHeaders = Arrays.stream(headers).filter(header -> !headerName.equals(header.getLocalName()) || !headerNamespace.equals(header.getNamespaceURI())).collect(Collectors.toList());
        WsCoreClient wsCoreClient = this;
        synchronized (wsCoreClient) {
            stub.clearHeaders();
            remainingHeaders.forEach(arg_0 -> ((Stub)stub).setHeader(arg_0));
        }
    }

    public void removeSoapHeader(String headerName) {
        this.removeSoapHeader(this.getMessagesUrn(), headerName);
    }

    public boolean isSoapHeaderSet(String namespace, String headerName) {
        return this.getStub().getHeader(namespace, headerName) != null;
    }

    public boolean isSoapHeaderSet(String headerName) {
        return this.isSoapHeaderSet(this.getMessagesUrn(), headerName);
    }

    protected void replaceSoapHeader(String headerName, Object value) {
        this.removeSoapHeader(headerName);
        this.addSoapHeader(headerName, value);
    }

    protected void updateTokenPassportInMessage(MessageContext messageContext, TokenPassport tokenPassport) {
        QName tokenPassportQName = new QName(this.getMessagesUrn(), "tokenPassport");
        try {
            SOAPHeader soapHeader = messageContext.getCurrentMessage().getSOAPHeader();
            if (tokenPassport.isAutomaticallyUpdated()) {
                tokenPassport.update();
            }
            soapHeader.addChildElement((SOAPElement)new SOAPHeaderElement(tokenPassportQName, (Object)Utils.convertTokenPassport(tokenPassport)));
        }
        catch (SOAPException e) {
            e.printStackTrace();
        }
    }

    public Passport getPassport() {
        return null;
    }

    public void setPassport(Passport passport) {
    }

    public void unsetPassport() {
    }

    public void setRequestLevelCredentials(boolean useRequestLevelCredentials) {
    }

    public void setRequestLevelCredentials(Passport passport) {
    }

    public TokenPassport getTokenPassport() {
        return this.tokenPassport;
    }

    public void setTokenPassport(TokenPassport tokenPassport) {
        this.tokenPassport = tokenPassport;
    }

    public void unsetTokenPassport() {
        this.tokenPassport = null;
    }

    public OAuthPassport getOAuthPassport() {
        return this.oAuthPassport;
    }

    public void setOAuthPassport(OAuthPassport oAuthPassport) {
        this.oAuthPassport = oAuthPassport;
    }

    public void unsetOAuthPassport() {
        this.oAuthPassport = null;
    }

    public void setAutomaticSessionManagement(boolean automaticSessionManagement) {
        this.getStub().setMaintainSession(automaticSessionManagement);
    }

    protected static void logMessage(Message message, boolean isRequest) throws AxisFault {
        if (message != null && message.getSOAPPartAsString() != null) {
            LOG.info((Object)CommonUtils.getLogMessage((String)message.getSOAPPartAsString(), (boolean)isRequest));
        }
    }

    private class ResponseHandler
    extends SimpleTargetedChain {
        private ResponseHandler() {
        }

        public void invoke(MessageContext messageContext) throws AxisFault {
            WsCoreClient.this.responseHttpHeaders.clear();
            Message responseMessage = messageContext.getResponseMessage();
            if (responseMessage != null) {
                MimeHeaders headers = responseMessage.getMimeHeaders();
                Iterator headersIterator = headers.getAllHeaders();
                while (headersIterator.hasNext()) {
                    WsCoreClient.this.responseHttpHeaders.add((MimeHeader)headersIterator.next());
                }
            }
            WsCoreClient.logMessage(messageContext.getResponseMessage(), false);
            super.invoke(messageContext);
        }
    }

    private class RequestHandler
    extends SimpleTargetedChain {
        private RequestHandler() {
        }

        public void invoke(MessageContext messageContext) throws AxisFault {
            messageContext.setProperty("axis.transport.version", (Object)(HttpVersion.HTTP_1_1.equals(WsCoreClient.this.getHttpProtocolVersion()) ? HTTPConstants.HEADER_PROTOCOL_V11 : HTTPConstants.HEADER_PROTOCOL_V10));
            ArrayList<MimeHeader> mimeHeaders = new ArrayList<MimeHeader>(WsCoreClient.this.requestHttpHeaders);
            if (WsCoreClient.this.oAuthPassport != null) {
                mimeHeaders.add(new MimeHeader(WsCoreClient.this.oAuthPassport.getOAuthHttpHeaderName(), WsCoreClient.this.oAuthPassport.getOAuthHttpHeaderValue()));
            }
            if (!mimeHeaders.isEmpty()) {
                Hashtable headersMap = new Hashtable(mimeHeaders.size());
                mimeHeaders.forEach(header -> headersMap.put(header.getName(), header.getValue()));
                messageContext.setProperty("HTTP-Request-Headers", headersMap);
            }
            if (WsCoreClient.this.tokenPassport != null) {
                WsCoreClient.this.updateTokenPassportInMessage(messageContext, WsCoreClient.this.tokenPassport);
            }
            WsCoreClient.logMessage(messageContext.getRequestMessage(), true);
            super.invoke(messageContext);
        }
    }
}

