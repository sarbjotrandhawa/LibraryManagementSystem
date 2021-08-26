/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.controller.BooksJpaController;
import com.controller.exceptions.NonexistentEntityException;
import com.model.Books;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ravi
 */
@WebService
public class BooksService {

    @WebMethod
    public void InsertBooks(Books book) throws Exception {

        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);

        Books bookObj = new Books();
        bookObj.setBookid(book.getBookid());
        bookObj.setTitle(book.getTitle());
        bookObj.setAvailability(book.getAvailability());
        bookObj.setBooklocation(book.getBooklocation());
        bookObj.setBookauthor(book.getBookauthor());
        bookObj.setBookpublication(book.getBookpublication());
        bookObj.setBookdetail(book.getBookdetail());
        repo.create(bookObj);

    }

    @WebMethod
    public List<Books> DisplayBooks() throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");

        BooksJpaController repo = new BooksJpaController(emf);

        return repo.findAll();
    }

    @WebMethod
    public Books DisplayBookById(String id) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        List<Books> list = repo.findAll();
        for (Books book : list) {
            if (book.getBookid().equalsIgnoreCase(id)) {
                return book;
            }
        }

        return null;
    }

    @WebMethod
    public int DeleteBook(String id) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);

        try {
            repo.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(BooksService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @WebMethod
    public int UpdateBook(Books book) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);

      
            try {
                repo.edit(book);
            } catch (Exception ex) {
                Logger.getLogger(BooksService.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return 1;
        }
        
    @WebMethod
    public List<Books> SearchBookByTitle(String title) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        
        List<Books> list = repo.findAll();
        
        List<Books> result = new ArrayList<Books>();
        
        for (Books book : list) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
               
            }
             
        }

        return result;
    }
    
    @WebMethod
    public List<Books> SearchBookByAuthor(String author) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        BooksJpaController repo = new BooksJpaController(emf);
        List<Books> list = repo.findAll();
        
          List<Books> result = new ArrayList<Books>();
        for (Books book : list) {
            if (book.getBookauthor().equalsIgnoreCase(author)) {
                result.add(book);
                
            }
        }

        return result;
    }
}
