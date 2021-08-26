<%-- 
    Document   : UpdatedEmployeeResult
    Created on : Aug 16, 2021, 2:54:04 AM
    Author     : Jenny
--%>

<%@page import="com.service.Exception_Exception"%>
<%@page import="javax.xml.datatype.DatatypeConfigurationException"%>
<%@page import="java.text.ParseException"%>
<%@page import="com.service.EmployeeServiceService"%>
<%@page import="javax.xml.datatype.DatatypeFactory"%>
<%@page import="javax.xml.datatype.XMLGregorianCalendar"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.service.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <style>
            body {  
                font-family: Calibri, Helvetica, sans-serif;  


                background: url('images/addbook.jpg') no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                text-align: center;
            }  
        </style>
    </head>
    <body>
         <div class="topnav">
            <ul>
                <li><a href="AddEmployees.jsp"> Add Employee </a></li>
                <li><a href="/LibraryManagementSystemClient/EmployeeServlet"> Display Employee </a></li>
                   <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
            </ul>
        </div>
        <%
            try {
            Employee emp = new Employee();
            emp.setEmployeeid(Integer.parseInt(request.getParameter("empid")));
            emp.setEmployeefirstname(request.getParameter("fname"));
            emp.setEmployeelastname(request.getParameter("lname"));
            emp.setEmail(request.getParameter("email"));
            emp.setPhone(request.getParameter("phone"));
            emp.setUsername(request.getParameter("username"));

            emp.setDateofjoining(request.getParameter("dateOfJoining"));
            emp.setIsadmin(0);

            EmployeeServiceService service = new EmployeeServiceService();
            service.getEmployeeServicePort().updateEmployee(emp);
            }catch (Exception_Exception ex) {
            System.out.println(ex);
        } 
        %>
        <h1>Employee Updated Successfully</h1>
    </body>
</html>
