<%-- 
    Document   : Registration
    Created on : 14 Aug, 2021, 12:55:17 PM
    Author     : Ravi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
         <link rel="stylesheet" type="text/css" href="css/style.css">
         <style>
         body {  
  font-family: Calibri, Helvetica, sans-serif;  


  background: url('images/register.jpg') no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
  text-align: center;
}  
</style>
    </head>
    <body>
<h1>User Registration Form</h1>
<form action="User" method="post" class="reg">
                         	<table style="with: 20%">
                                  	<tr>
                                            	<td>First Name</td>
                                            	<td><input type="text" name="firstname" /></td>
                                  	</tr>
                                  	<tr>
                                            	<td>Last Name</td>
                                            	<td><input type="text" name="lastname" /></td>
                                  	</tr>
                                  	<tr>
                                            	<td>UserName</td>
                                            	<td><input type="text" name="username" /></td>
                                  	</tr>
                                            	<tr>
                                            	<td>Password</td>
                                            	<td><input type="password" name="password" /></td>
                                  	</tr>
                                        <tr>
                                            	<td>Email id</td>
                                            	<td><input type="text" name="email" /></td>
                                  	</tr>
                                  	<tr>
                                            	<td>Contact No</td>
                                            	<td><input type="text" name="phone" /></td>
                                  	</tr>
                         	</table>
                         	<input type="submit" value="Submit" class="regbtn"/></form>
</body>
</html>

