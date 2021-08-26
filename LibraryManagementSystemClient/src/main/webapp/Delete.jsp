<%-- 
    Document   : Delete
    Created on : 15 Aug, 2021, 11:03:57 PM
    Author     : Ravi
--%>

<%@page import="com.service.BooksServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Books</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            
            String id = (String)request.getParameter("id");
            
              BooksServiceService service = new BooksServiceService();
       
            int x = service.getBooksServicePort().deleteBook(id);
            
        %>
        
        <h1> deleted successfully </h1>
    </body>
</html>
