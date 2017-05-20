<%-- 
    Document   : challenge2-8
    Created on : 2017/04/26, 11:43:44
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
            String kimi[]={"10", "100", "soeda", "hayashi", "-20", "118", "END"};
          
           kimi[3]="33";
         out.print(kimi[3]);
        
           %>
    </body>
</html>
