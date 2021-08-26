<%-- 
    Document   : UpdateEmployee
    Created on : Aug 16, 2021, 1:58:10 AM
    Author     : Jenny
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.service.Employee"%>
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
        <title>JSP Page</title>
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
            String id = (String) request.getParameter("empid");

            EmployeeServiceService service = new EmployeeServiceService();

            Employee emp = service.getEmployeeServicePort().displayEmployeeById(Integer.parseInt(id));


        %>
        <h1 style="color:tomato;"> Let's increase our Book Count ! </h1>
        <form name="UploadEmployeeResult" action="UpdatedEmployeeResult.jsp" method="post">


            <table class="book">
                <tr> <td>    Employee Id     </td> <td><input type="text" name="empid" value="<%=emp.getEmployeeid()%>" readonly/></td> </tr>
                <tr> <td>    First Name     </td> <td><input type="text" name="fname" value="<%=emp.getEmployeefirstname()%>"  required/></td> </tr>  
                <tr> <td> Last Name </td> <td><input type="text" name="lname" value="<%=emp.getEmployeelastname()%>" required /></td> </tr>
                <tr> <td> Email </td> <td><input type="text" name="email" value="<%=emp.getEmail()%>"  required /></td> </tr>
                <tr> <td> Phone </td> <td><input type="text" name="phone" value="<%=emp.getPhone()%>" required /></td> </tr>
                <tr> <td> Username </td> <td><input type="text" name="username" value="<%=emp.getUsername()%>" required /></td> </tr>
                <tr> <td> Date of Joining </td> <td><input type="date" name="dateOfJoining" value="<%=emp.getDateofjoining()%>" placeholder="DD/MM/YYYY" required /></td> </tr>
                <tr> <td> <input type="submit" value="Update" clas="empbtn"/></td></tr>
            </table>
        </form>

    </body>
</html>
