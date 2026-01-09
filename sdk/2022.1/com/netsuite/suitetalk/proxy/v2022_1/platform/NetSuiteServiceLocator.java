/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.xml.rpc.ServiceException
 *  org.apache.axis.AxisFault
 *  org.apache.axis.EngineConfiguration
 *  org.apache.axis.client.Service
 *  org.apache.axis.client.Stub
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform;

import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuiteBindingStub;
import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuitePortType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.NetSuiteService;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class NetSuiteServiceLocator
extends Service
implements NetSuiteService {
    private String NetSuitePort_address = "https://webservices.netsuite.com/services/NetSuitePort_2022_1";
    private String NetSuitePortWSDDServiceName = "NetSuitePort";
    private HashSet ports = null;

    public NetSuiteServiceLocator() {
    }

    public NetSuiteServiceLocator(EngineConfiguration config) {
        super(config);
    }

    public NetSuiteServiceLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    @Override
    public String getNetSuitePortAddress() {
        return this.NetSuitePort_address;
    }

    public String getNetSuitePortWSDDServiceName() {
        return this.NetSuitePortWSDDServiceName;
    }

    public void setNetSuitePortWSDDServiceName(String name) {
        this.NetSuitePortWSDDServiceName = name;
    }

    @Override
    public NetSuitePortType getNetSuitePort() throws ServiceException {
        URL endpoint;
        try {
            endpoint = new URL(this.NetSuitePort_address);
        }
        catch (MalformedURLException e) {
            throw new ServiceException((Throwable)e);
        }
        return this.getNetSuitePort(endpoint);
    }

    @Override
    public NetSuitePortType getNetSuitePort(URL portAddress) throws ServiceException {
        try {
            NetSuiteBindingStub _stub = new NetSuiteBindingStub(portAddress, this);
            _stub.setPortName(this.getNetSuitePortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setNetSuitePortEndpointAddress(String address) {
        this.NetSuitePort_address = address;
    }

    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (NetSuitePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                NetSuiteBindingStub _stub = new NetSuiteBindingStub(new URL(this.NetSuitePort_address), this);
                _stub.setPortName(this.getNetSuitePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return this.getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("NetSuitePort".equals(inputPortName)) {
            return this.getNetSuitePort();
        }
        Remote _stub = this.getPort(serviceEndpointInterface);
        ((Stub)_stub).setPortName(portName);
        return _stub;
    }

    public QName getServiceName() {
        return new QName("urn:platform_2022_1.webservices.netsuite.com", "NetSuiteService");
    }

    public Iterator getPorts() {
        if (this.ports == null) {
            this.ports = new HashSet();
            this.ports.add(new QName("urn:platform_2022_1.webservices.netsuite.com", "NetSuitePort"));
        }
        return this.ports.iterator();
    }

    public void setEndpointAddress(String portName, String address) throws ServiceException {
        if (!"NetSuitePort".equals(portName)) {
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
        this.setNetSuitePortEndpointAddress(address);
    }

    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        this.setEndpointAddress(portName.getLocalPart(), address);
    }
}

