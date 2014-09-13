<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <a href="<%=request.getContextPath()%>/adm/vendedor/nuevo">Nuevo</a>
            
            <c:forEach var="i" items="${vendedores}">
                <p><c:out value="${i.persona.nombres}"/></p>
            </c:forEach>
        </div>
        <%@include file="/public/footer.jsp" %>
    </body>
</html>
