/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.controller.EmployeeJpaController;
import com.controller.exceptions.NonexistentEntityException;
import com.model.Employee;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jenny
 */
@WebService
public class EmployeeService {
     
    @WebMethod
    public void InsertEmployee(Employee employee) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);
        employee.setEmployeeid(repo.getEmployeeCount()+1);
        repo.create(employee);
    }

    @WebMethod
    public List<Employee> DisplayEmployees() throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);
        return repo.findAll();
    }

    @WebMethod
    public Employee DisplayEmployeeById(int id) throws Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);
        List<Employee> employee = repo.findAll();

        for (Employee list : employee) {
            if (list.getEmployeeid() == id) {
                return list;
            }
        }

        return null;
    }

    
    @WebMethod
    public int UpdateEmployee(Employee emp) throws NonexistentEntityException, Exception {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);
        repo.edit(emp);

        return 1;
    }
    
    @WebMethod
    public int DeleteEmployee(Integer id) throws NonexistentEntityException {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);
        repo.destroy(id);

        return 1;
    }
    
    @WebMethod
    public Employee SearchEmployeeById(Integer id) throws NonexistentEntityException {
        EntityManagerFactory emf = new Persistence().createEntityManagerFactory("LibraryMngtSystem");
        EmployeeJpaController repo = new EmployeeJpaController(emf);

        return repo.findEmployee(id);
    }

}
