<%-- 
    Document   : String3
    Created on : 2017/05/08, 15:27:01
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       String msg="きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
       out.print(msg.replace("i", "い"));
       out.print(msg.replace("u", "う"));
       out.print(msg);
       %>
    </body>
</html>
