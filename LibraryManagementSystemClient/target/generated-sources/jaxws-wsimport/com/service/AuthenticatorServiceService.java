
package com.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AuthenticatorServiceService", targetNamespace = "http://service.com/", wsdlLocation = "http://localhost:8080/LibraryManagementSystemWS/AuthenticatorServiceService?WSDL")
public class AuthenticatorServiceService
    extends Service
{

    private final static URL AUTHENTICATORSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTHENTICATORSERVICESERVICE_EXCEPTION;
    private final static QName AUTHENTICATORSERVICESERVICE_QNAME = new QName("http://service.com/", "AuthenticatorServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/LibraryManagementSystemWS/AuthenticatorServiceService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHENTICATORSERVICESERVICE_WSDL_LOCATION = url;
        AUTHENTICATORSERVICESERVICE_EXCEPTION = e;
    }

    public AuthenticatorServiceService() {
        super(__getWsdlLocation(), AUTHENTICATORSERVICESERVICE_QNAME);
    }

    public AuthenticatorServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHENTICATORSERVICESERVICE_QNAME, features);
    }

    public AuthenticatorServiceService(URL wsdlLocation) {
        super(wsdlLocation, AUTHENTICATORSERVICESERVICE_QNAME);
    }

    public AuthenticatorServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHENTICATORSERVICESERVICE_QNAME, features);
    }

    public AuthenticatorServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthenticatorServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthenticatorService
     */
    @WebEndpoint(name = "AuthenticatorServicePort")
    public AuthenticatorService getAuthenticatorServicePort() {
        return super.getPort(new QName("http://service.com/", "AuthenticatorServicePort"), AuthenticatorService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticatorService
     */
    @WebEndpoint(name = "AuthenticatorServicePort")
    public AuthenticatorService getAuthenticatorServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.com/", "AuthenticatorServicePort"), AuthenticatorService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHENTICATORSERVICESERVICE_EXCEPTION!= null) {
            throw AUTHENTICATORSERVICESERVICE_EXCEPTION;
        }
        return AUTHENTICATORSERVICESERVICE_WSDL_LOCATION;
    }

}
