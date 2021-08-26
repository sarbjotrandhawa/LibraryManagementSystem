<%-- 
    Document   : SearchBook
    Created on : 16 Aug, 2021, 1:40:17 PM
    Author     : Ravi
--%>

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
        
       <form action="SearchBookWScall.jsp">
  <p>Please select your preference of searching book.....:</p>
  
   <table class="book">

                <tr> <td>    Enter Title/Author: </td> <td> 
                        <input type="text" name="input" required/>
                    </td> </tr>
  
                  <tr> <td><input type="radio" id="author" name="search" value="author"></td>
                         <td>    <label for="html">Search Book by Author</label></td></tr>
                   <tr> <td><input type="radio" id="title" name="search" value="title"> </td>
                          <td>   <label for="css">Search Book by Title</label></td> </tr>
                <tr> <td> <br/><br/></td> </tr>
                <tr> <td></td> <td><input type="submit" value="Submit"></td> </tr>
   </table>
</form>
    </body>
</html>
