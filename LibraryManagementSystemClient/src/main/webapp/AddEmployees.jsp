<%-- 
    Document   : AddEmployees
    Created on : Aug 15, 2021, 10:43:21 PM
    Author     : Jenny
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
                <li><a href="AddEmployees.jsp"> Add Employee </a></li>
                <li><a href="/LibraryManagementSystemClient/EmployeeServlet"> Display Employee </a></li>
                  <li style="float:right"><a href="Logout.jsp"> Logout </a></li>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <li style="float:right"><a class="active"> Welcome , <%= session.getAttribute("uname") %></a></li>
            </ul>
        </div>
  
             <h1 style="color:tomato;"> Let's increase our Book Count ! </h1>
             <form name="UploadEmployee" action="EmployeeServlet" method="post">

          
            <table class="book">
                <tr> <td> First Name </td> <td><input type="text" name="fname"  required/></td> </tr>  
                <tr> <td> Last Name </td> <td><input type="text" name="lname"  required /></td> </tr>
                <tr> <td> Email </td> <td><input type="text" name="email"  required /></td> </tr>
                <tr> <td> Phone </td> <td><input type="text" name="phone"  required /></td> </tr>
                <tr> <td> Username </td> <td><input type="text" name="username"  required /></td> </tr>
                <tr> <td> Password </td> <td><input type="password" name="password"  required /></td> </tr>
                <tr> <td> Date of Joining </td> <td><input type="date" name="dateOfJoining" placeholder="DD/MM/YYYY" required /></td> </tr>
                <tr> <td> <input type="submit" value="Submit" clas="empbtn"/></td></tr>
            </table>
        </form>
    </body>
</html>

