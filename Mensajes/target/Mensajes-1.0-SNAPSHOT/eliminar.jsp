<%-- 
    Document   : eliminar
    Created on : 27/08/2024, 11:13:02 p. m.
    Author     : EDISON RESTREPO
--%>

<%@page import="com.estival.mensajes.MensajeDao"%>
<%@page import="com.estival.mensajes.Mensaje"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id = request.getParameter("id");
            Mensaje mensaje = new Mensaje(Integer.valueOf(id));
            MensajeDao mensajeDao = new MensajeDao();
            mensajeDao.eliminar(mensaje);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        %>
    </body>
</html>
