<%-- 
    Document   : DeleteEmployee
    Created on : Aug 16, 2021, 1:07:49 AM
    Author     : Jenny
--%>

<%@page import="com.service.EmployeeServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
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
            
            String id = (String)request.getParameter("empid");
            
              EmployeeServiceService service = new EmployeeServiceService();
       
            int x = service.getEmployeeServicePort().deleteEmployee(Integer.parseInt(id));
            if(x==1){
        %>
        
        <h1>Employee deleted successfully </h1>
        <%
            }
        %>
    </body>
</html>