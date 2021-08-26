<%-- 
    Document   : ProcessBookIssue
    Created on : 17 Aug, 2021, 2:39:11 PM
    Author     : macbookair
--%>

<%@page import="com.service.BookOperationsService"%>
<%@page import="com.service.BooksServiceService"%>
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

            Bookissuedate bookissuedate = new Bookissuedate();
            bookissuedate.setEmployeeid(1);
            bookissuedate.setBookid(request.getParameter("bid"));
            bookissuedate.setUserid(Integer.parseInt(request.getParameter("uid")));
            bookissuedate.setIssuedate(request.getParameter("iid"));
            bookissuedate.setReceivedate("");
            
            BookOperationsService booksOpertaion = new BookOperationsService();
            String msg=booksOpertaion.getBookOperationsPort().issueBook(bookissuedate);
            
            response.sendRedirect("IssueBook.jsp?msg="+msg);
        %>
    </body>
</html>
