<%-- 
    Document   : IssueHistory
    Created on : Aug 17, 2021, 5:46:39 PM
    Author     : Jenny
--%>

<%@page import="com.service.Bookissuedate"%>
<%@page import="com.service.BookOperationsService"%>
<%@page import="com.service.BooksServiceService"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.service.Books"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Books History</title>
          <link rel="stylesheet" type="text/css" href="css/style.css">
          
    </head>
    <body>
             <div class="topnav">
            <ul>
                <li><a href="SearchBookUser.jsp"> Search Books</a></li>
                <li><a href="IssueHistory.jsp">Issue History</a></li>
                   <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
            </ul>
        </div>
        

        <h1 style="color:tomato;"><center>Books History from DB</center></h1>
            <%
                
              BookOperationsService service = new BookOperationsService();
              int x =(Integer)session.getAttribute("uid");
              List<Bookissuedate> list = service.getBookOperationsPort().userHistory(x);

              
            %>
        
       
            
            <table cellspacing="2" cellpadding="2" border="1" id="books">

<tr><th>ID</th><th> Book ID</th><th>Issue Date</th>
    <th>Receive Date</th></tr>
<%
// Iterating through list

if(list != null)  // Null check for the object
{
	Iterator<Bookissuedate> iterator = list.iterator();  
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		Bookissuedate lst = iterator.next(); 
	%>
	<tr>
            <td><%=lst.getId()%></td>
		<td><%=lst.getBookid()%></td>
		<td><%=lst.getIssuedate()  %></td>
                <td><%=lst.getReceivedate()%></td>
                    
	</tr>
	<%
	}
}
%>
</table>
</br>
    </body>
</html>