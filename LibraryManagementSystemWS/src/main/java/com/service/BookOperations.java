/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.controller.BookissuedateJpaController;
import com.controller.BooksJpaController;
import com.controller.LibraryuserJpaController;
import com.model.Bookissuedate;
import com.model.Books;
import com.model.Libraryuser;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author macbookair
 */
@WebService
public class BookOperations {

    @WebMethod
    public String issueBook(Bookissuedate issue) {

        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BookissuedateJpaController repo = new BookissuedateJpaController(emf);
        Boolean check = isValidUser(issue.getUserid());
        if (check == true) {
            Boolean check1 = isValidBook(issue.getBookid());
            if (check1 == true) {
                try {
                    issue.setId(repo.getBookissuedateCount() + 1);
                    repo.create(issue);
                    changeBookAvailability(issue.getBookid());
                    return "Book has been Issued succcessfully";
                } catch (Exception ex) {
                    Logger.getLogger(BookOperations.class.getName()).log(Level.SEVERE, null, ex);
                    return "Error while issuing book!";
                }
            } else {
                return "Book does not exist or is unavailable!";
            }
        } else {
            return "User does not exist!";
        }
    }

    @WebMethod
    public String receiveBook(String id) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BookissuedateJpaController repo = new BookissuedateJpaController(emf);
        try {

            // take book info
            // check status (not available 
            // dateissue table get book
            // receive date replace with current date
            if (id != null && isValid(id)) {
                BooksService ser = new BooksService();
                Books book = ser.DisplayBookById(id);
                Bookissuedate receiveBook = new Bookissuedate();

                if (book.getAvailability().equalsIgnoreCase("Unavailable")) {
                    List<Bookissuedate> issDate = repo.findAll();

                    for (Bookissuedate b : issDate) {
                        if (b.getBookid().equals(id) && b.getReceivedate().equals("")) {
                            receiveBook = b;
                            break;
                        }
                    }
                    receiveBook.setReceivedate(new Date().toString());
                    book.setAvailability("Available");
                    repo.edit(receiveBook);
                    ser.UpdateBook(book);
                    return "Book Receiveed Successfully";
                } else {
                    return "Book has not been issued yet!";
                }
            } else {
                return "Please enter valid Book ID";
            }
        } catch (Exception ex) {
            Logger.getLogger(BookOperations.class.getName()).log(Level.SEVERE, null, ex);
            return "Error occured while receiveing book";
        }

    }

    @WebMethod
    public List<Bookissuedate> userHistory(int userid) {
        //get from session
        List<Bookissuedate> list = new ArrayList<Bookissuedate>();
        List<Bookissuedate> result = new ArrayList<Bookissuedate>();
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BookissuedateJpaController repo = new BookissuedateJpaController(emf);

        list = repo.findAll();

        for (Bookissuedate history : list) {
            if (history.getUserid() == userid) {
                result.add(history);

            }

        }

        return result;
    }

    private boolean isValidUser(Integer userid) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        List<Libraryuser> libraryUser = repo.findAll();

        for (Libraryuser list : libraryUser) {
            if (list.getId() == userid) {
                return true;
            }
        }
        return false;

    }

    private Boolean isValidBook(String bookid) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        List<Books> list = repo.findAll();
        for (Books book : list) {
            if (book.getBookid().equalsIgnoreCase(bookid) && book.getAvailability().equalsIgnoreCase("Available")) {
                return true;
            }
        }
        return false;
    }

    private void changeBookAvailability(String bookid) {
        Books book1 = new Books();
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        List<Books> list = repo.findAll();
        for (Books book : list) {
            if (book.getBookid().equalsIgnoreCase(bookid)) {
                book1 = book;
                break;
            }
        }

        book1.setAvailability("Unavailable");
        try {
            repo.edit(book1);
        } catch (Exception ex) {
            Logger.getLogger(BookOperations.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private boolean isValid(String id) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        List<Books> list = repo.findAll();
        for (Books book : list) {
            if (book.getBookid().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }

}
