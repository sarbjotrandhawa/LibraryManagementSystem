<%-- 
    Document   : AddBooks
    Created on : 14 Aug, 2021, 12:36:27 PM
    Author     : Ravi/Payal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css">
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

        <h1 style="color:tomato;"> Let's increase our Book Count ! </h1>
        <form name="Upload" action="BookServlet" method="post">


            <table class="book">

                <tr> <td>   Book ID </td> <td> <input type="text" name="id" required/></td> </tr>
                <tr> <td>    Title     </td> <td><input type="text" name="title"  required/></td> </tr>  
                <tr> <td> Book Author </td> <td><input type="text" name="author"  required /></td> </tr>
                <tr> <td> Book Publication </td> <td><input type="text" name="pub"  required /></td> </tr>
                <tr> <td> Book Details </td> <td><input type="text" name="detail"  required /></td> </tr>
                <tr> <td> Book Location </td> <td><input type="text" name="location"  required /></td> </tr>
                <tr> <td> Book Availability </td> <td><select name="avail">
                            <option value="Available">Available</option>
                            <option value="Unavailable">Unavailable</option>
                        </select></td> </tr>


                <tr> <td>        <input type="submit" value="Submit" clas="bookbtn"/></td></tr>



            </table>
        </form>

    </body>
</html>
