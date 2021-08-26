/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.controller.LibraryuserJpaController;
import com.controller.exceptions.NonexistentEntityException;
import com.model.Libraryuser;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author macbookair
 */
@WebService
public class UserService {
  @WebMethod
    public void InsertUser(Libraryuser user) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        user.setId(repo.getLibraryuserCount()+1);
        repo.create(user);
    }

    @WebMethod
    public List<Libraryuser> DisplayUser() throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        return repo.findAll();
    }

    @WebMethod
    public Libraryuser DisplayUserById(int id) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        List<Libraryuser> libraryUser = repo.findAll();

        for (Libraryuser list : libraryUser) {
            if (list.getId() == id) {
                return list;
            }
        }

        return null;
    }
    
     @WebMethod
    public int updateUser(Libraryuser user) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        repo.edit(user);
        return 1;
    }

    @WebMethod
    public int DeleteUser(Integer id) throws NonexistentEntityException {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        repo.destroy(id);
        return 1;

    }

}
