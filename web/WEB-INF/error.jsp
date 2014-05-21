<%@ page isErrorPage="true" %>
<html>
    <head>
        <title>Pagina de error</title>
    </head>
    <body bgcolor="FFCCCC">
        <h1>Se encontro un error!</h1>
        <hr>
        Estimado Usuario,<br>
        <br>
        se encontro un error procesando su peticion. <br>
        <br>
        Lo sentimos, y estamos haciendo lo posible para reparar este error lo más pronto posible.<br>
        Usted puede reportar la error a nuestro servicio al cliente, al correo electronico <a
            href="mailto:grupo@daw.com">
            Servicio al cliente</a>.
        <p>Gracias por comunicarnos el detalle del error.
        <p>
            Esta pagina es: <%=request.getRequestURI()%></p>
        <p>
            
        <p>
            La pagina que ha causado el error es: <%=request.getAttribute("view")%></p>
        <p>
            El error es: <%=exception.getMessage()%></p>
        <p>Más detalles:<br>
            <%=exception.toString()%>
        <p style="font-family: Monospace; font-size: 10px ;font-weight: bold;">
            <%
                exception.fillInStackTrace();
                for (StackTraceElement s : exception.getStackTrace()) {
                    out.println(s.toString() + "<br>");
                }
            %>
        </p>
        <hr>
        <a href="index.jsp">Inicio</a><br>
    </body>
</html>