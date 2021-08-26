<%-- 
    Document   : Update
    Created on : 16 Aug, 2021, 1:45:56 AM
    Author     : Ravi
--%>

<%@page import="com.service.Libraryuser"%>
<%@page import="com.service.UserServiceService"%>
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
                <li><a href="SearchBook.jsp"> Search Books</a></li>
                <li><a href="IssueBook.jsp"> Issue Books</a></li>
                <li><a href="RecieveBook.jsp"> Receive Books</a></li>
                <li><a href="AddBooks.jsp"> Add Books</a></li>
                <li><a href="DisplayBooks.jsp"> Display Books</a></li>
                <li><a href="DisplayUsers.jsp"> Display Users</a></li>
                   <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
            </ul>
        </div>

        <h1 style="color:tomato;"> Let's increase our Book Count ! </h1>
        
         <%  String x = request.getParameter("id");
                 
              UserServiceService service = new UserServiceService();
             Libraryuser libraryUser= service.getUserServicePort().displayUserById(Integer.parseInt(x));
             
  
                %>
        <form name="Upload" action="UpdateUser.jsp" method="Post">

            <table class="book">
               
                <tr> <td>  Id </td> <td> <input type="text" name="id" value="<%=x%>" readonly/></td> </tr>
                <tr> <td>  First Name </td> <td> <input type="text" name="firstname"  value="<%=libraryUser.getFirstname()%>"/></td> </tr>
                <tr> <td>  Last Name  </td> <td><input type="text" name="lastname" value="<%=libraryUser.getLastname()%>" required/></td> </tr>  
                <tr> <td> UserName </td> <td><input type="text" name="username" value="<%=libraryUser.getUsername()%>" required /></td> </tr>
                <tr> <td> Email id </td> <td><input type="text" name="email" value="<%=libraryUser.getEmail()%>" required /></td> </tr>
                <tr> <td> Contact No </td> <td><input type="text" name="phone" value="<%=libraryUser.getPhone()%>" required /></td> </tr>
                <input type="hidden" name="password" value="<%=libraryUser.getPassword()%>" required />
                <tr> <td><input type="submit" value="Submit" clas="bookbtn"/></td></tr>
            </table>
        </form>

    </body>
</html>