<%-- 
    Document   : DisplayBooks
    Created on : 14 Aug, 2021, 3:07:59 PM
    Author     : Ravi
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Books"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Books</title>
          <link rel="stylesheet" type="text/css" href="css/style.css">
          
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
        

        <h1 style="color:tomato;"><center>Books Information from DB</center></h1>
            <%
                List<Books> list = (ArrayList<Books>) request.getAttribute("listOfBooks");     
            %>
        
       
            
            <table cellspacing="2" cellpadding="2" border="1" id="books">

<tr><th>Book ID</th><th> Title</th><th>Book Author</th><th>Publication</th>
    <th>Details</th><th>Location</th><th>Book Count </th><th>Operation</th><th>Operation</th></tr>
<%
// Iterating through list

if(request.getAttribute("listOfBooks") != null)  // Null check for the object
{
	Iterator<Books> iterator = list.iterator();  
	
	while(iterator.hasNext())  // iterate through all the data until the last record
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
                <td><a href="Update.jsp?id=<%=lst.getBookid()%>">Update</a></td>
                <td><a href="Delete.jsp?id=<%=lst.getBookid()%>">Delete</a></td>
	</tr>
	<%
	}
}
%>
</table>
</br>
    </body>
</html>

