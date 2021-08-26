/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAYAL
package com.service;

import com.controller.EmployeeJpaController;
import com.controller.LibraryuserJpaController;
import com.model.Employee;
import com.model.Libraryuser;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author macbookair
 */
@WebService
public class AuthenticatorService {

    @WebMethod
    public Libraryuser userAuthenticator(String username, String password) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        LibraryuserJpaController repo = new LibraryuserJpaController(emf);
        List<Libraryuser> libraryUser = repo.findAll();

        for (Libraryuser list : libraryUser) {
            if (list.getUsername().equalsIgnoreCase(username) && list.getPassword().equals(password)) {
                return list;
            }
        }
        return null;
    }

    @WebMethod
    public Employee employeeAuthenticator(String username, String password) {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");

        EmployeeJpaController repo = new EmployeeJpaController(emf);
        List<Employee> employee = repo.findAll();

        for (Employee list : employee) {
            if (list.getUsername().equalsIgnoreCase(username) && list.getPassword().equals(password)) {
                return list;
            }
        }
        return null;
    }

}
