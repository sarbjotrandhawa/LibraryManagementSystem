<%-- 
    Document   : BookUpdated
    Created on : 16 Aug, 2021, 2:04:35 AM
    Author     : Ravi
--%>

<%@page import="java.util.logging.Level"%>
<%@page import="com.service.Exception_Exception"%>
<%@page import="com.service.Books"%>
<%@page import="com.service.BooksServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Book</title>
    </head>
    <body>
           <%
            
                         Books book = new Books();
              book.setBookid(request.getParameter("id"));
               book.setBookauthor(request.getParameter("author"));
                book.setTitle(request.getParameter("title"));
                 book.setBooklocation(request.getParameter("location"));
                  book.setBookpublication(request.getParameter("pub"));
                   book.setBookdetail(request.getParameter("detail"));
                    book.setAvailability(request.getParameter("avail"));
              
              
         BooksServiceService service = new BooksServiceService();
    
            service.getBooksServicePort().updateBook(book);
            
         
             out.print("Book details Successfully Updated !!!!");
            
            
     
            
        %>
    </body>
</html>
