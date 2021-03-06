
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
@WebService(name = "BooksService", targetNamespace = "http://service.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BooksService {


    /**
     * 
     * @param arg0
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "InsertBooks")
    @RequestWrapper(localName = "InsertBooks", targetNamespace = "http://service.com/", className = "com.service.InsertBooks")
    @ResponseWrapper(localName = "InsertBooksResponse", targetNamespace = "http://service.com/", className = "com.service.InsertBooksResponse")
    @Action(input = "http://service.com/BooksService/InsertBooksRequest", output = "http://service.com/BooksService/InsertBooksResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/BooksService/InsertBooks/Fault/Exception")
    })
    public void insertBooks(
        @WebParam(name = "arg0", targetNamespace = "")
        Books arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.service.Books>
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DisplayBooks")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayBooks", targetNamespace = "http://service.com/", className = "com.service.DisplayBooks")
    @ResponseWrapper(localName = "DisplayBooksResponse", targetNamespace = "http://service.com/", className = "com.service.DisplayBooksResponse")
    @Action(input = "http://service.com/BooksService/DisplayBooksRequest", output = "http://service.com/BooksService/DisplayBooksResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/BooksService/DisplayBooks/Fault/Exception")
    })
    public List<Books> displayBooks()
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.service.Books
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "DisplayBookById")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DisplayBookById", targetNamespace = "http://service.com/", className = "com.service.DisplayBookById")
    @ResponseWrapper(localName = "DisplayBookByIdResponse", targetNamespace = "http://service.com/", className = "com.service.DisplayBookByIdResponse")
    @Action(input = "http://service.com/BooksService/DisplayBookByIdRequest", output = "http://service.com/BooksService/DisplayBookByIdResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/BooksService/DisplayBookById/Fault/Exception")
    })
    public Books displayBookById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DeleteBook")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteBook", targetNamespace = "http://service.com/", className = "com.service.DeleteBook")
    @ResponseWrapper(localName = "DeleteBookResponse", targetNamespace = "http://service.com/", className = "com.service.DeleteBookResponse")
    @Action(input = "http://service.com/BooksService/DeleteBookRequest", output = "http://service.com/BooksService/DeleteBookResponse")
    public int deleteBook(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.service.Books>
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "SearchBookByAuthor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchBookByAuthor", targetNamespace = "http://service.com/", className = "com.service.SearchBookByAuthor")
    @ResponseWrapper(localName = "SearchBookByAuthorResponse", targetNamespace = "http://service.com/", className = "com.service.SearchBookByAuthorResponse")
    @Action(input = "http://service.com/BooksService/SearchBookByAuthorRequest", output = "http://service.com/BooksService/SearchBookByAuthorResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/BooksService/SearchBookByAuthor/Fault/Exception")
    })
    public List<Books> searchBookByAuthor(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "UpdateBook")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "UpdateBook", targetNamespace = "http://service.com/", className = "com.service.UpdateBook")
    @ResponseWrapper(localName = "UpdateBookResponse", targetNamespace = "http://service.com/", className = "com.service.UpdateBookResponse")
    @Action(input = "http://service.com/BooksService/UpdateBookRequest", output = "http://service.com/BooksService/UpdateBookResponse")
    public int updateBook(
        @WebParam(name = "arg0", targetNamespace = "")
        Books arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.service.Books>
     * @throws Exception_Exception
     */
    @WebMethod(operationName = "SearchBookByTitle")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchBookByTitle", targetNamespace = "http://service.com/", className = "com.service.SearchBookByTitle")
    @ResponseWrapper(localName = "SearchBookByTitleResponse", targetNamespace = "http://service.com/", className = "com.service.SearchBookByTitleResponse")
    @Action(input = "http://service.com/BooksService/SearchBookByTitleRequest", output = "http://service.com/BooksService/SearchBookByTitleResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://service.com/BooksService/SearchBookByTitle/Fault/Exception")
    })
    public List<Books> searchBookByTitle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws Exception_Exception
    ;

}
