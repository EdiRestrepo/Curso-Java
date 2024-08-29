<%-- 
    Document   : index
    Created on : 27/08/2024, 7:58:37 p. m.
    Author     : EDISON RESTREPO
--%>

<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="com.estival.mensajes.Mensaje"%>
<%@page import="com.estival.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensajes</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <!-- Modal -->
        <div class="d-flex flex-column border p-3">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="index.jsp" method="POST">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5" >Crear Mensaje</h1>
                        </div>
                        <div class="modal-body">

                            <div class="form-group">
                                <label  class="form-label">Ingrese el Mensaje</label>
                                <textarea  class="form-control" name="mensaje" rows="3"></textarea>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Autor</label>
                                <input type="text" name="autor" class="form-control">
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary" name="enviar">Enviar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div> 
        <%
            MensajeDao mensajeDao = new MensajeDao();
            
            if(request.getParameter("enviar") != null){
                Mensaje mensaje = new Mensaje(request.getParameter("mensaje"), request.getParameter("autor"));
                
                mensajeDao.insertar(mensaje);
            }
            
        %>
        <div class="d-flex flex-column border p-3">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" >Todos los mensajes</h1>
                    </div>
                    <%
                        //MensajeDao mensajeDao = new MensajeDao();
                        List<Mensaje> mensajes = mensajeDao.selccionar();
                        
                        Collections.reverse(mensajes);
                        
                        for (Mensaje mensaje : mensajes) {
                                
                            
                    %>
                    
                    <div class="modal-body mb-3">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title"><%=mensaje.getAutor()%></h5>
                                <p class="card-text"><%=mensaje.getMensaje()%></p>
                                <p class="blockquote-footer"><cite><%=mensaje.getFecha()%></cite></p>
                                <a href="editar.jsp?id=<%=mensaje.getId()%>
                                   &&mensaje=<%=mensaje.getMensaje()%>
                                   &&autor=<%=mensaje.getAutor()%>" 
                                   class="card-link">Editar</a>
                                <a href="eliminar.jsp?id=<%=mensaje.getId()%>" class="card-link">Eliminar</a>
                            </div>
                        </div>
                    </div>
                   <%}%>
                </div>
            </div>
        </div> 
    </body>
</html>
