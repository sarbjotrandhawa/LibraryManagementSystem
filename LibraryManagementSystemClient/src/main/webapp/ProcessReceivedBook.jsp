<%-- 
    Document   : ProcessReceivedBook
    Created on : Aug 17, 2021, 5:01:19 PM
    Author     : Jenny
--%>

<%@page import="com.service.BookOperationsService"%>
<%@page import="com.service.Bookissuedate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <%

            BookOperationsService booksOpertaion = new BookOperationsService();
            String msg=booksOpertaion.getBookOperationsPort().receiveBook(request.getParameter("id"));
            
            response.sendRedirect("RecieveBook.jsp?msg="+msg);
        %>
    </body>
</html>
