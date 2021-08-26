<%-- 
    Document   : Books
    Created on : 14 Aug, 2021, 2:11:14 PM
    Author     : Ravi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Books</title>
           <style>
         body {  
  font-family: Calibri, Helvetica, sans-serif;  


  background: url('images/books.jpg') no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
  text-align: center;
}  
</style>
    </head>
    <body>
        <h1>Manage Books</h1>
        
          <h2>   <a href="AddBooks.jsp"> Add New Book </a></h2>
          
        
          <!-- comment     <h2>   <a href="/foo/DisplayBooks.jsp"> View All Books </a></h2>--> 
         
            <form action="BookServlet" method="GET">
            <input type="submit" value="View Books" class="button" />
        </form>
          <h2>   <a href="SearchBooks.jsp"> Search Books </a></h2>
          
          <h2>   <a href="#"> Update Book </a></h2>
          
          <h2>   <a href="#"> Delete Book</a></h2>
    </body>
</html>
