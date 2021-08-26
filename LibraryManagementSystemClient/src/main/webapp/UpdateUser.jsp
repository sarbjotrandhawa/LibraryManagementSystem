<%-- 
    Document   : UpdateUser
    Created on : 16 Aug, 2021, 3:40:18 PM
    Author     : macbookair
--%>

<%@page import="com.servlet.UserServlet"%>
<%@page import="com.service.Exception_Exception"%>
<%@page import="com.service.UserServiceService"%>
<%@page import="com.service.Libraryuser"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            UserServiceService service = new UserServiceService();

            Libraryuser libraryuser = new Libraryuser();
            libraryuser.setId(Integer.parseInt(request.getParameter("id")));
            libraryuser.setFirstname(request.getParameter("firstname"));
            libraryuser.setLastname(request.getParameter("lastname"));
            libraryuser.setEmail(request.getParameter("email"));
            libraryuser.setPassword(request.getParameter("password"));
            libraryuser.setPhone(request.getParameter("phone"));
            libraryuser.setUsername(request.getParameter("username"));

            try {
                service.getUserServicePort().updateUser(libraryuser);
                response.sendRedirect("DisplayUsers.jsp");
            } catch (Exception_Exception ex) {
                Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
            }


        %>
    </body>
</html>
