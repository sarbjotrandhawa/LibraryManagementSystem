<%-- 
    Document   : ValidateEmployeeLogin
    Created on : 16 Aug, 2021, 9:59:17 PM
    Author     : macbookair
--%>

<%@page import="com.service.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.service.Libraryuser"%>
<%@page import="com.service.AuthenticatorServiceService"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ValidateEmployee</title>
    </head>
    <body>
        <%
      String name = request.getParameter("username");
            String password = request.getParameter("password");

            AuthenticatorServiceService service = new AuthenticatorServiceService();
            Employee user = service.getAuthenticatorServicePort().employeeAuthenticator(name, password);

            if (user != null) {
            if(user.getIsadmin()==1)
            {
                session.setAttribute("uid",user.getEmployeeid());
                session.setAttribute("uname",user.getUsername());
                
                request.setAttribute("User", user);
                RequestDispatcher rd = request.getRequestDispatcher("/AdminHome.jsp");
                rd.forward(request, response);
            }
            else
            {
                session.setAttribute("uid",user.getEmployeeid());
                session.setAttribute("uname",user.getUsername());
                request.setAttribute("User", user);
                RequestDispatcher rd = request.getRequestDispatcher("/EmployeeHome.jsp");
                rd.forward(request, response);
            }
           
                
            }
            else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/EmployeeLogin.jsp?msg=Invalid Credentials");
                rd.forward(request, response);
            }
%>

    </body>
</html>
