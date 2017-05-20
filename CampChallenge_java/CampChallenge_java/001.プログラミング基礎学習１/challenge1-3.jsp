<%-- 
    Document   : challenge1-3
    Created on : 2017/04/24, 20:15:51
    Author     : guest1Day
--%>

<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
        <%
            String name="松本";
            String sex ="男性";
            int age =25;
            String profile ="名前:"+name+"性別:"+sex+"年齢:"+age;
            out.println(profile);
            %>
    </body>
</html>
