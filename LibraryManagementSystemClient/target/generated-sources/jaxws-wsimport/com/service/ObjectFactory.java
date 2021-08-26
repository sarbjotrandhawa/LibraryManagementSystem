
package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReceiveBookResponse_QNAME = new QName("http://service.com/", "receiveBookResponse");
    private final static QName _IssueBookResponse_QNAME = new QName("http://service.com/", "issueBookResponse");
    private final static QName _IssueBook_QNAME = new QName("http://service.com/", "issueBook");
    private final static QName _UserHistory_QNAME = new QName("http://service.com/", "userHistory");
    private final static QName _Bookissuedate_QNAME = new QName("http://service.com/", "bookissuedate");
    private final static QName _ReceiveBook_QNAME = new QName("http://service.com/", "receiveBook");
    private final static QName _UserHistoryResponse_QNAME = new QName("http://service.com/", "userHistoryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserHistory }
     * 
     */
    public UserHistory createUserHistory() {
        return new UserHistory();
    }

    /**
     * Create an instance of {@link IssueBook }
     * 
     */
    public IssueBook createIssueBook() {
        return new IssueBook();
    }

    /**
     * Create an instance of {@link UserHistoryResponse }
     * 
     */
    public UserHistoryResponse createUserHistoryResponse() {
        return new UserHistoryResponse();
    }

    /**
     * Create an instance of {@link Bookissuedate }
     * 
     */
    public Bookissuedate createBookissuedate() {
        return new Bookissuedate();
    }

    /**
     * Create an instance of {@link ReceiveBook }
     * 
     */
    public ReceiveBook createReceiveBook() {
        return new ReceiveBook();
    }

    /**
     * Create an instance of {@link ReceiveBookResponse }
     * 
     */
    public ReceiveBookResponse createReceiveBookResponse() {
        return new ReceiveBookResponse();
    }

    /**
     * Create an instance of {@link IssueBookResponse }
     * 
     */
    public IssueBookResponse createIssueBookResponse() {
        return new IssueBookResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "receiveBookResponse")
    public JAXBElement<ReceiveBookResponse> createReceiveBookResponse(ReceiveBookResponse value) {
        return new JAXBElement<ReceiveBookResponse>(_ReceiveBookResponse_QNAME, ReceiveBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "issueBookResponse")
    public JAXBElement<IssueBookResponse> createIssueBookResponse(IssueBookResponse value) {
        return new JAXBElement<IssueBookResponse>(_IssueBookResponse_QNAME, IssueBookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "issueBook")
    public JAXBElement<IssueBook> createIssueBook(IssueBook value) {
        return new JAXBElement<IssueBook>(_IssueBook_QNAME, IssueBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "userHistory")
    public JAXBElement<UserHistory> createUserHistory(UserHistory value) {
        return new JAXBElement<UserHistory>(_UserHistory_QNAME, UserHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookissuedate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "bookissuedate")
    public JAXBElement<Bookissuedate> createBookissuedate(Bookissuedate value) {
        return new JAXBElement<Bookissuedate>(_Bookissuedate_QNAME, Bookissuedate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiveBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "receiveBook")
    public JAXBElement<ReceiveBook> createReceiveBook(ReceiveBook value) {
        return new JAXBElement<ReceiveBook>(_ReceiveBook_QNAME, ReceiveBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.com/", name = "userHistoryResponse")
    public JAXBElement<UserHistoryResponse> createUserHistoryResponse(UserHistoryResponse value) {
        return new JAXBElement<UserHistoryResponse>(_UserHistoryResponse_QNAME, UserHistoryResponse.class, null, value);
    }

}
