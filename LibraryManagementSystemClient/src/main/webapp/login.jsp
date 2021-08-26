<%-- 
    Document   : login
    Created on : 16 Aug, 2021, 2:41:55 AM
    Author     : macbookair
--%>

<%@page import="javax.jms.Session"%>
<%@page import="com.service.Libraryuser"%>
<%@page import="com.service.AuthenticatorServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%

            String name = request.getParameter("username");
            String password = request.getParameter("password");

            AuthenticatorServiceService service = new AuthenticatorServiceService();
            Libraryuser user = service.getAuthenticatorServicePort().userAuthenticator(name, password);
            
            if (user != null) {
                session.setAttribute("uid",user.getId());
                session.setAttribute("uname",user.getUsername());
                request.setAttribute("User", user);
                RequestDispatcher rd = request.getRequestDispatcher("/UserHome.jsp");
                rd.forward(request, response);
            }
            else
            {
                RequestDispatcher rd = request.getRequestDispatcher("/index.jsp?msg=Invalid Credentials");
                rd.forward(request, response);
            }


        %>
    </body>
</html>
