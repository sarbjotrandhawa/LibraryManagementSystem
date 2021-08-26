<%-- 
    Document   : DisplayEmployees
    Created on : Aug 16, 2021, 12:21:11 AM
    Author     : Jenny
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Employee</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">

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


        <h1 style="color:tomato;"><center>Employee Information from DB</center></h1>
                <%
                    List<Employee> list = (ArrayList<Employee>) request.getAttribute("listOfEmployees");
                %>


        <table cellspacing="2" cellpadding="2" border="1" id="books">

            <tr><th>Employee ID</th><th>First Name</th><th>Last Name</th><th>Email</th>
                <th>Phone</th><th>Joining Date</th><th>Username</th><th> Delete </th><th>Update</th></tr>
                    <%
                        // Iterating through list
                        if (request.getAttribute("listOfEmployees") != null) // Null check for the object
                        {
                            Iterator<Employee> iterator = list.iterator();

                            while (iterator.hasNext()) // iterate through all the data until the last record
                            {
                                Employee lst = iterator.next();

                    %>
            <tr>
                <td><%=lst.getEmployeeid()%></td>
                <td><%=lst.getEmployeefirstname()%></td>
                <td><%=lst.getEmployeelastname()%></td>
                <td><%=lst.getEmail()%></td>
                <td><%=lst.getPhone()%></td>
                <td><%=lst.getDateofjoining()%></td>
                <td><%=lst.getUsername()%></td>
                <td><a href="/LibraryManagementSystemClient/DeleteEmployee.jsp?empid=<%=lst.getEmployeeid()%>"> Delete </a></td>
                <td><a href="/LibraryManagementSystemClient/UpdateEmployee.jsp?empid=<%=lst.getEmployeeid()%>"> Update </a></td>
            </tr>
            <%
                    }
                }
            %>
        </table>
        </br>

    </body>
</html>