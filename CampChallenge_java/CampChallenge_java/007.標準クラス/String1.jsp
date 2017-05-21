<%-- 
    Document   : String1
    Created on : 2017/05/08, 15:11:33
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
            String name="松本侑也";
             out.print(name.length()+"<br>");
            
             out.print(name.getBytes().length);    
            
            
            %>
            
    </body>
</html>
