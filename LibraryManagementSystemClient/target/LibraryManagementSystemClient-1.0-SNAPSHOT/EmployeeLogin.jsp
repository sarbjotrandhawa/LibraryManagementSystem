<%-- 
    Document   : EmployeeLogin
    Created on : 16 Aug, 2021, 9:55:15 PM
    Author     : macbookair
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Login Page</title>
            <link rel="stylesheet" type="text/css" href="css/style.css">
               <style>   
            body {  
                font-family: Calibri, Helvetica, sans-serif;  


                background: url('images/lib.jpg') no-repeat center center fixed; 
                -webkit-background-size: cover;
                -moz-background-size: cover;
                -o-background-size: cover;
                background-size: cover;
                text-align: center;
            }  
            button {   
                background-color: #4CAF50;   
                width: 100%;  
                color: black;   
                padding: 15px;   
                margin: 10px 0px;   
                border: none;   
                cursor: pointer;   
            }   
            form {   
                border: 3px solid #f1f1f1; 
                width: 50%;
                display: inline-block;
            }   

            h1{
                color: red;
            }
            input[type=text], input[type=password] {   
                width: 100%;   
                margin: 8px 0;  
                padding: 12px 20px;   
                display: inline-block;   
                border: 2px solid green;   
                box-sizing: border-box;   
            }  
            button:hover {   
                opacity: 0.7;   
            }   
            .cancelbtn {   
                width: auto;   
                padding: 10px 18px;  
                margin: 10px 5px;  
                
            }   


            .container { 
                width: 45%;
                padding: 5px;   
                background-color: whitesmoke; 
                margin-left: 400px;
                height: 90%;
            }   


        </style> 
    </head>
    <body>
         <div class="topnav">
            <ul>
                <li><a href="index.jsp"> Home</a></li>
              
            </ul>
        </div>
       <center> <h1> LIBRARY MANAGEMENT SYSTEM </h1> </center> 
    <div class="container"> 
        <form action="ValidateEmployeeLogin.jsp" >  

            <label>Username :</label>   
            <input type="text" placeholder="Enter Username" name="username" required>  
            <label>Password :</label>   
            <input type="password" placeholder="Enter Password" name="password" required>  
              <button type="submit" value="Login">Login</button>  
           
        </form> 
         <% String msgbexist = request.getParameter("msg");
            if (msgbexist != null) {%>
            <h1>  <%=msgbexist%></h1>
        <% }%>
    </div>   
    </body>
</html>
