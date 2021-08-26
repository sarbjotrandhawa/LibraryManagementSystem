<%-- 
    Document   : SearchBookWScall
    Created on : 16 Aug, 2021, 1:50:12 PM
    Author     : Ravi
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.awt.print.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Books"%>
<%@page import="com.service.BooksServiceService"%>
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
        <%
            
            String input = request.getParameter("input");
            String b = request.getParameter("search");
       
           BooksServiceService service = new BooksServiceService();
           List<Books> list;
           if(b.equals("author"))
           {
                list =  service.getBooksServicePort().searchBookByAuthor(input);
           }
           else{
                list = service.getBooksServicePort().searchBookByTitle(input);
           }

        %>
        <br/><br/><br/><br/><table  cellspacing="2" cellpadding="2" border="1" id="books">
        <tr><th>Book ID</th><th> Title</th><th>Book Author</th><th>Publication</th>
            <th>Details</th><th>Location</th><th>Availability</th></tr>
<%
// Iterating through list

if(list != null)  
{
	Iterator<Books> iterator = list.iterator();  
	
	while(iterator.hasNext())  
	{
		Books lst = iterator.next(); 
	%>
	<tr>
                <td><%=lst.getBookid()%></td>
		<td><%=lst.getTitle()%></td>
		<td><%=lst.getBookauthor()%></td>
		<td><%=lst.getBookpublication()%></td>
                <td><%=lst.getBookdetail()%></td>
                <td><%=lst.getBooklocation()%></td>
                <td><%=lst.getAvailability()%></td>
               
	</tr>
	<%
	}
}
%>
        </table>
    </body>
</html>
