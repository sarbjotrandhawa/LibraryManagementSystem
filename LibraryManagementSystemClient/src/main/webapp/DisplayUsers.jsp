<%-- 
    Document   : DisplayBooks
    Created on : 14 Aug, 2021, 3:07:59 PM
    Author     : Ravi
--%>

<%@page import="com.service.Libraryuser"%>
<%@page import="com.service.UserServiceService"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Books"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Users</title>
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
        

        <h1 style="color:tomato;"><center>Users Information</center></h1>
            <%
               UserServiceService service = new UserServiceService();
          List<Libraryuser> list =  service.getUserServicePort().displayUser();
               
            %>
        
       
            
            <table cellspacing="2" cellpadding="2" border="1" id="books">

<tr><th>ID</th><th> FIRSTNAME </th><th> LASTNAME</th><th>USERNAME</th>
    <th>EMAIL</th><th>PHONE</th> <th>OPERATION</th> <th>OPERATION</th></tr>
<%
// Iterating through list

if(list != null)  // Null check for the object
{
	Iterator<Libraryuser> iterator = list.iterator();  
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		Libraryuser lst = iterator.next(); 
	%>
	<tr>
                <td><%=lst.getId()%></td>
		<td><%=lst.getFirstname()%></td>
		<td><%=lst.getLastname()%></td>
		<td><%=lst.getUsername()%></td>
                <td><%=lst.getEmail()%></td>
                <td><%=lst.getPhone()%></td>
                <td><a href="EditUser.jsp?id=<%=lst.getId()%>">Update</a></td>
                <td><a href="DeleteUser.jsp?id1=<%=lst.getId()%>">Delete</a></td>
	</tr>
	<%
	}
}
%>
</table>
</br>

    </body>
</html>

