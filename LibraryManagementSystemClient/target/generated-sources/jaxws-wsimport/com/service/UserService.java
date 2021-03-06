
package com.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "UserService", targetNamespace = "http://service.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg0
     * @return
     *     returns int
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateUser", targetNamespace = "http://service.com/", className = "com.service.UpdateUser")
    @ResponseWrapper(localName = "updateUserResponse", targetNamespace = "http://service.com/", className = "com.service.UpdateUserResponse")
    @Action(input = "http://service.com/UserService/updateUserRequest", output = "http://service.com/UserService/updateUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/UserService/updateUser/Fault/Exception")
    })
    public int updateUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Libraryuser arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.service.Libraryuser
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DisplayUserById")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayUserById", targetNamespace = "http://service.com/", className = "com.service.DisplayUserById")
    @ResponseWrapper(localName = "DisplayUserByIdResponse", targetNamespace = "http://service.com/", className = "com.service.DisplayUserByIdResponse")
    @Action(input = "http://service.com/UserService/DisplayUserByIdRequest", output = "http://service.com/UserService/DisplayUserByIdResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/UserService/DisplayUserById/Fault/Exception")
    })
    public Libraryuser displayUserById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.service.Libraryuser>
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DisplayUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayUser", targetNamespace = "http://service.com/", className = "com.service.DisplayUser")
    @ResponseWrapper(localName = "DisplayUserResponse", targetNamespace = "http://service.com/", className = "com.service.DisplayUserResponse")
    @Action(input = "http://service.com/UserService/DisplayUserRequest", output = "http://service.com/UserService/DisplayUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/UserService/DisplayUser/Fault/Exception")
    })
    public List<Libraryuser> displayUser()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "InsertUser")
    @RequestWrapper(localName = "InsertUser", targetNamespace = "http://service.com/", className = "com.service.InsertUser")
    @ResponseWrapper(localName = "InsertUserResponse", targetNamespace = "http://service.com/", className = "com.service.InsertUserResponse")
    @Action(input = "http://service.com/UserService/InsertUserRequest", output = "http://service.com/UserService/InsertUserResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/UserService/InsertUser/Fault/Exception")
    })
    public void insertUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Libraryuser arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     * @throws NonexistentEntityException_Exception
     */
    @WebMethod(operationName = "DeleteUser")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteUser", targetNamespace = "http://service.com/", className = "com.service.DeleteUser")
    @ResponseWrapper(localName = "DeleteUserResponse", targetNamespace = "http://service.com/", className = "com.service.DeleteUserResponse")
    @Action(input = "http://service.com/UserService/DeleteUserRequest", output = "http://service.com/UserService/DeleteUserResponse", fault = {
        @FaultAction(className = NonexistentEntityException_Exception.class, value = "http://service.com/UserService/DeleteUser/Fault/NonexistentEntityException")
    })
    public int deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0)
        throws NonexistentEntityException_Exception
    ;

}
