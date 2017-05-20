<%-- 
    Document   : FortuneTellingResurt
    Created on : 2017/04/28, 13:20:05
    Author     : guest1Day
--%>

<%@page import="org.camp.servlet.ResultDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultDate data=(ResultDate)request.getAttribute("DATA");
                    %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (data!=null){
                out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getluck()+"です!</h1>");
            }
            %>
    </body>
</html>
