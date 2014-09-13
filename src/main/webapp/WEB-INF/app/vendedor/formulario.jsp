<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vendedores</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        
        <div id="formulario">
            <h1>Vendedores!</h1>
            <form method="post" action="<%=request.getContextPath()%>/adm/vendedor/guardar">
                <label>Paterno</label>
                <input type="text" name="paterno" class="txt"/>
                <label>Materno</label>
                <input type="text" name="materno" class="txt"/>
                <label>Nombres</label>
                <input type="text" name="nombres" class="txt"/>
                <label>Email</label>
                <input type="text" name="email" class="txt"/>
                
                <label>Estado</label>
                <select class="txt" name="estado">
                    <option value="1">Activo</option>
                    <option value="0">Pendiente</option>
                </select>
                
                <input type="submit" value="Guardar" class="btn"/>
            </form>
        </div>
        <%@include file="/public/footer.jsp" %>
    </body>
</html>

