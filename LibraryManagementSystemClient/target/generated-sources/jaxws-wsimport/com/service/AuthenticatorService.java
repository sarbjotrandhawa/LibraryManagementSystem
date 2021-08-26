
package com.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AuthenticatorService", targetNamespace = "http://service.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuthenticatorService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.service.Employee
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "employeeAuthenticator", targetNamespace = "http://service.com/", className = "com.service.EmployeeAuthenticator")
    @ResponseWrapper(localName = "employeeAuthenticatorResponse", targetNamespace = "http://service.com/", className = "com.service.EmployeeAuthenticatorResponse")
    @Action(input = "http://service.com/AuthenticatorService/employeeAuthenticatorRequest", output = "http://service.com/AuthenticatorService/employeeAuthenticatorResponse")
    public Employee employeeAuthenticator(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.service.Libraryuser
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userAuthenticator", targetNamespace = "http://service.com/", className = "com.service.UserAuthenticator")
    @ResponseWrapper(localName = "userAuthenticatorResponse", targetNamespace = "http://service.com/", className = "com.service.UserAuthenticatorResponse")
    @Action(input = "http://service.com/AuthenticatorService/userAuthenticatorRequest", output = "http://service.com/AuthenticatorService/userAuthenticatorResponse")
    public Libraryuser userAuthenticator(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}