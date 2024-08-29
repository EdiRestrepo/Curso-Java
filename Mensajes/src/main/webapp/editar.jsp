<%-- 
    Document   : editar
    Created on : 27/08/2024, 10:42:30 p. m.
    Author     : EDISON RESTREPO
--%>

<%@page import="com.estival.mensajes.Mensaje"%>
<%@page import="com.estival.mensajes.MensajeDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Mensajes</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <!-- Modal -->
        <div class="d-flex flex-column border p-3">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="editar.jsp" method="POST">
                        <div class="modal-header">
                            <h1 class="modal-title fs-5" >Editar Mensaje</h1>
                        </div>
                        <div class="modal-body">

                            <div class="form-group">
                                <input type="hidden" name="id" value="<%=request.getParameter("id")%>">
                                <label  class="form-label">Ingrese el Mensaje</label>
                                <textarea  class="form-control" name="mensaje" rows="3"><%=request.getParameter("mensaje")%>
                                </textarea>
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Autor</label>
                                <input type="text" name="autor" class="form-control" value="<%=request.getParameter("autor")%>">
                            </div>

                        </div>
                        <div class="modal-footer">
                            <a href="index.jsp" type="submit" class="btn btn-danger" >Regresar</a>
                            <button type="submit" class="btn btn-primary" name="enviar">Guardar Cambios</button>
                        </div>
                    </form>
                </div>
            </div>
        </div> 
                             <%
            MensajeDao mensajeDao = new MensajeDao();
            
            String id = request.getParameter("id");
            if(request.getParameter("enviar") != null){
                Mensaje mensaje = new Mensaje(
                Integer.parseInt(id.trim()),
                request.getParameter("mensaje"), 
                request.getParameter("autor"));
                
                mensajeDao.editar(mensaje);
            }
            
        %>
    </body>
</html>
