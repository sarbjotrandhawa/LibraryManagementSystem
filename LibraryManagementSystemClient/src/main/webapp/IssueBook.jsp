<%-- 
    Document   : BookIssue
    Created on : 17 Aug, 2021, 1:35:52 PM
    Author     : macbookair
--%>

<%@page import="java.util.Date"%>
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
                <li><a href="SearchBook.jsp"> Search Books</a></li>
                <li><a href="IssueBook.jsp"> Issue Books</a></li>
                <li><a href="RecieveBook.jsp"> Receive Books</a></li>
                <li><a href="AddBooks.jsp"> Add Books</a></li>
                <li><a href="/LibraryManagementSystemClient/BookServlet"> Display Books</a></li>
                <li><a href="DisplayUsers.jsp"> Display Users</a></li>
                  <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
            </ul>
        </div>
        <form action="ProcessBookIssue.jsp">
            <table>
                <tr><td>User Id</td><td><input type="text" name ="uid"></td></tr>
                <tr><td>Book Id</td><td><input type="text" name ="bid"></tr>
                <tr><td>Issue date</td><td><input type="text" name ="iid" value="<%=new Date().toString()%>" readonly></tr>
                <tr><td></td><td><input type="submit" value="Issue"></td></tr>      
            </table>        
        </form>
         <% String msgbexist = request.getParameter("msg");
            if (msgbexist != null) {%>
            <h1>  <%=msgbexist%></h1>
        <% }%>
    </body>
</html>
