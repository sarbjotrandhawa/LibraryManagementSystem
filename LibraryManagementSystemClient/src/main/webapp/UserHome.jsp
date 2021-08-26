<%-- 
    Document   : UserHome
    Created on : 16 Aug, 2021, 1:40:55 AM
    Author     : macbookair
--%>


<%@page import="com.service.Libraryuser"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <title>JSP Page</title>
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
                <li><a href="SearchBookUser.jsp"> Search Books</a></li>
                <li><a href="IssueHistory.jsp">Issue History</a></li>
                 <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
               
            </ul>
        </div>
        <h1> Welcome to User </h1>
        
        <%
         Libraryuser user = (Libraryuser)request.getAttribute("User");        
        %>
        
        <h1><%=user.getFirstname()%></h1>
    </body>
</html>
