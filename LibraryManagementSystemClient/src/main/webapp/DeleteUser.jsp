<%-- 
    Document   : DeleteUser
    Created on : 16 Aug, 2021, 2:01:13 PM
    Author     : macbookair
--%>

<%@page import="com.service.UserServiceService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%

            int id = Integer.parseInt(request.getParameter("id1")) ;

            UserServiceService service = new UserServiceService();

            service.getUserServicePort().deleteUser(id);
             RequestDispatcher rd = request.getRequestDispatcher("/DisplayUsers.jsp");
                rd.forward(request, response);

        %>
    </body>
</html>
