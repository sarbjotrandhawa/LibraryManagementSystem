/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.service.Books;
import com.service.BooksServiceService;
import com.service.Employee;
import com.service.EmployeeServiceService;
import com.service.Exception_Exception;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Jenny
 */
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmployeeServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmployeeServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EmployeeServiceService service = new EmployeeServiceService();
           try {
          List<Employee> list;
       
            list = service.getEmployeeServicePort().displayEmployees();
            
            
             request.setAttribute("listOfEmployees", list);
          RequestDispatcher requestDispatcher = request.getRequestDispatcher("/DisplayEmployees.jsp");            
            requestDispatcher.forward(request, response);
        } catch (Exception_Exception ex) {
            Logger.getLogger(BookServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter out = response.getWriter()) {
            Employee emp = new Employee();
            emp.setEmployeefirstname(request.getParameter("fname"));
            emp.setEmployeelastname(request.getParameter("lname"));
            emp.setEmail(request.getParameter("email"));
            emp.setPhone(request.getParameter("phone"));
            emp.setUsername(request.getParameter("username"));
            emp.setPassword(request.getParameter("password"));

           /*
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dateOfJoining"));
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date1);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            */
           emp.setDateofjoining(request.getParameter("dateOfJoining"));
        
   
            emp.setIsadmin(0);

            EmployeeServiceService service = new EmployeeServiceService();
            service.getEmployeeServicePort().insertEmployee(emp);
            out.print("Employee details Successfully Added !!!!");
             response.sendRedirect("/LibraryManagementSystemClient/AdminHome.jsp?msg=Employee Added Sucessfully.");
        }catch (Exception_Exception ex) {
            Logger.getLogger(EmployeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
